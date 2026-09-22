package experiment2;

public class Video {
    private String name;
    private float rating;
    private boolean checkout;

    public Video(String name) {
        this.name = name;
        checkout = false;
        rating = 0;
    }

    String getName() {
        return name;
    }

    float getRating() {
        return rating;
    }

    boolean getCheckout() {
        return checkout;
    }

    void receiveRating(float rating) {
        this.rating = rating;
        System.out.println("Rated " + rating + " stars");
    }

    void doCheckout() {
        if (checkout == true) {
            System.out.println("Video is already rented");
            return;
        }
        checkout = true;
        System.out.println("Video rented successfully");
    }

    void doReturn() {
        if (checkout == false) {
            System.out.println("Video not rented yet");
            return;
        }
        checkout = false;
        System.out.println("Video returned successfully");
    }

    public String toString() {
        return "Video: " + name + "\nRating: " + rating + "\nCheckout: " + checkout + "\n";
    }

}