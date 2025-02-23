import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class ElectricityBill {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("How much units used: ");
        int units = scanner.nextInt();  

        System.out.print("Enter 'D' for Domestic or 'C' for Commercial: ");
        char type = scanner.next().toUpperCase().charAt(0);  

        double rate;

        if (type == 'D') { 
            if (units <= 100) {
                rate = 5;
            } else if (units <= 300) {
                rate = 7;
            } else if (units <= 500) {
                rate = 9;
            } else {
                rate = 10;
            }
        } else {
            if (units <= 100) {
                rate = 8;
            } else if (units <= 300) {
                rate = 10;
            } else if (units <= 500) {
                rate = 12;
            } else {
                rate = 15;
            }
        }


        double bill = units * rate;

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"); 

        System.out.println("\n--- Electricity Bill ---");  
        System.out.println("Date: " + now.format(formatter));  
        System.out.println("Units Used: " + units);
        System.out.println("Type: " + (type == 'D' ? "Domestic" : "Commercial"));  
        System.out.printf("Rate per unit: ₹%.2f\n", rate);  
        System.out.printf("Total Bill: ₹%.2f\n", bill); 

        scanner.close();
    }
}