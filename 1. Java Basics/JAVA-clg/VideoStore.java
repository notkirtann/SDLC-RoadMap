import java.util.Scanner;

class VideoStore {
    Video[] store;
    Scanner sc;
    int index;

    VideoStore(int capacity, Scanner sc) {
        store = new Video[capacity];
        this.sc = sc;
        index = 0;
    }

    void addVideo(String name) {
        store[index] = new Video(name);
        index++;
        System.out.println("Added video " + name);
    }

    void doCheckout(String name) {

        for (Video video : store) {
            if (video == null)
                return;
            if (video.getName().equals(name)) {
                video.doCheckout();
            }
        }
    }

    void doReturn(String name) {
        for (Video video : store) {
            if (video == null)
                return;
            if (video.getName().equals(name)) {
                video.doReturn();
            }
        }
    }

    void receiveRating(String name, float rating) {
        for (Video video : store) {
            if (video == null)
                return;
            if (video.getName().equals(name)) {
                video.receiveRating(rating);
            }
        }
    }

    void listInventory() {
        System.out.println("----- Inventory -----\n");
        for (Video video : store) {
            if (video == null)
                return;
            System.out.println(video.toString());
        }
        System.out.println("---------------------\n");
    }
}
