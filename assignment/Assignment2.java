import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class KoolRestaurant {

    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm"); 

        Scanner input = new Scanner(System.in);
        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║         Welcome to KoolRestaurant        ║");
        System.out.println("║           A place for foodies ♨          ║");
        System.out.println("║         Date: " + now.format(formatter) +"           ║"); 
        System.out.println("╠══════════════════════════════════════════╣");
        System.out.println("║                 MENU                     ║");
        System.out.println("╠══════════════════════════════════════════╣");
        System.out.println("║  1. Maska Bun..................₹60       ║");
        System.out.println("║  2. Irani Chai.................₹15       ║");
        System.out.println("║  3. Coffee.....................₹45       ║");
        System.out.println("║  4. Shawarma...................₹75       ║");
        System.out.println("║  5. Biryani....................₹90       ║");
        System.out.println("║  6. Water Bottle...............₹9        ║");
        System.out.println("║  7. Double Ka Meetha...........₹50       ║");
        System.out.println("║  8. Icecream...................₹30       ║");
        System.out.println("╠══════════════════════════════════════════╣");
        System.out.println("║  0. Order It                             ║");
        System.out.println("╚══════════════════════════════════════════╝");

        int choice;
        int maskaBunQty = 0;
        int iraniChaiQty = 0;
        int coffeeQty = 0;
        int shawarmaQty = 0;
        int biryaniQty = 0;
        int waterBottleQty = 0;
        int doubleKaMeethaQty = 0;
        int iceCreamQty = 0;


        do {
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            if (choice == 1) {
                System.out.print("Enter Maska Bun quantity: ");
                maskaBunQty += input.nextInt();
            } else if (choice == 2) {
                System.out.print("Enter Irani Chai quantity: ");
                iraniChaiQty += input.nextInt();
            } else if (choice == 3) {
                System.out.print("Enter Coffee quantity: ");
                coffeeQty += input.nextInt();
            } else if (choice == 4) {
                System.out.print("Enter Shawarma quantity: ");
                shawarmaQty += input.nextInt();
            } else if (choice == 5) {
                System.out.print("Enter Biryani quantity: ");
                biryaniQty += input.nextInt();
            } else if (choice == 6) {
                System.out.print("Enter Water Bottle quantity: ");
                waterBottleQty += input.nextInt();
            } else if (choice == 7) {
                System.out.print("Enter Double Ka Meetha quantity: ");
                doubleKaMeethaQty += input.nextInt();
            } else if (choice == 8) {
                System.out.print("Enter Icecream quantity: ");
                iceCreamQty += input.nextInt();
            } else if (choice != 0) {
                System.out.println("Invalid choice.");
            }

        } while (choice != 0);

        System.out.println("\nYour Bill:");
        double total = 0;

        if (maskaBunQty > 0) {
            System.out.println("Maska Bun x " + maskaBunQty + " - ₹" + (maskaBunQty * 60));
            total += maskaBunQty * 60;
        }
        if (iraniChaiQty > 0) {
            System.out.println("Irani Chai x " + iraniChaiQty + " - ₹" + (iraniChaiQty * 15));
            total += iraniChaiQty * 15;
        }
        
        if (coffeeQty > 0) {
            System.out.println("Coffee x " + coffeeQty + " - ₹" + (coffeeQty * 45));
            total += coffeeQty * 45;
        }
        if (shawarmaQty > 0) {
            System.out.println("Shawarma x " + shawarmaQty + " - ₹" + (shawarmaQty * 75));
            total += shawarmaQty * 75;
        }
        if (biryaniQty > 0) {
            System.out.println("Biryani x " + biryaniQty + " - ₹" + (biryaniQty * 90));
            total += biryaniQty * 90;
        }
        if (waterBottleQty > 0) {
            System.out.println("Water Bottle x " + waterBottleQty + " - ₹" + (waterBottleQty * 9));
            total += waterBottleQty * 9;
        }
        if (doubleKaMeethaQty > 0) {
            System.out.println("Double Ka Meetha x " + doubleKaMeethaQty + " - ₹" + (doubleKaMeethaQty * 50));
            total += doubleKaMeethaQty * 50;
        }
        if (iceCreamQty > 0) {
            System.out.println("Icecream x " + iceCreamQty + " - ₹" + (iceCreamQty * 30));
            total += iceCreamQty * 30;
        }

        double gst = total * 0.05;
        double grandTotal = total + gst;
        System.out.printf("Subtotal: ₹%.2f\n", total);
        System.out.printf("GST (5%%): ₹%.2f\n", gst); 
        System.out.println("------------------------------------"); 
        System.out.printf("Grand Total: ₹%.2f\n", grandTotal);
        System.out.println("------------------------------------"); 
        System.out.println("Thank you for your visit :)"); 


        input.close();
    }
}