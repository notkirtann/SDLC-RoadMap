
import java.util.Scanner;

public class VideoLauncher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VideoStore vStore = new VideoStore(50, sc);
        String name = "";
        int option = 1;
        float rating = 0;
        while (true) {
            System.out.println("----------------------");
            System.out.println("1. Add Video");
            System.out.println("2. Checkout");
            System.out.println("3. Return");
            System.out.println("4. Give Rating");
            System.out.println("5. List Inventory");
            System.out.println("6. Exit");
            System.out.println("----------------------");
            System.out.print("Enter your choice: ");
            option = sc.nextInt();
            sc.nextLine();
            if (option >= 1 && option <= 4) {
                System.out.print("Enter Video Name: ");
                name = sc.nextLine();
            }
            System.out.println();
            switch (option) {
                case 1:
                    vStore.addVideo(name);
                    break;
                case 2:
                    vStore.doCheckout(name);
                    break;
                case 3:
                    vStore.doReturn(name);
                    break;
                case 4:
                    System.out.print("Give rating: ");
                    rating = sc.nextFloat();
                    sc.nextLine();
                    vStore.receiveRating(name, rating);
                    break;
                case 5:
                    vStore.listInventory();
                    break;
                case 6:
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    break;
            }
            System.out.println();
        }
    }
}
