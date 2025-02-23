import java.util.Scanner;

public class FIndElemInArray {
    public static void main(String args[]) {
        int[] arr = {5, 2, 9, 1, 3, 7};

        System.out.println("Enter the number you want to search = ");

        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();

        boolean found = false; // A flag to check if the number is found

        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                System.out.println("Your number " + arr[i] + " founded at index = " + i);
                found = true; // Set the flag to true if the number is found
                break; // Exit the loop once the number is found
            }
        }

        if (!found) { // If the number was not found after the loop
            System.out.println("Write correct number to found.");
        }
    }
}