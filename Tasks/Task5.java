// Develop a java application for Banking transaction: 

// Balance_Check, Deposit_Amount, Withdraw_Amount & Exit.

import java.util.Scanner;

public class Task5 {
    static double balance = 1000.00; 

    public static void main(String args[]) {
        Scanner getInput = new Scanner(System.in);
        int choice;

        System.out.println("Welcome to Bank Boi");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Amount");
        System.out.println("3. Withdraw Amount");
        System.out.println("4. Exit");

        do {
            System.out.println("Choose your Option: ");
            choice = getInput.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    depositAmount(getInput);
                    break;
                case 3:
                    withdrawAmount(getInput);
                    break;
                case 4:
                    exit();
                    break;
                default:
                    System.out.println("Invalid option. Choose between 1-4.");
            }
        } while (choice != 4);

        getInput.close();
    }

    public static void checkBalance() {
        System.out.println("Your Bank Balance == " + balance);
    }

    public static void depositAmount(Scanner getInput) {
        System.out.print("Enter amount to deposit: ");
        double amount = getInput.nextDouble();
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited successfully. New Balance == " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public static void withdrawAmount(Scanner getInput) {
        System.out.print("Enter amount to withdraw: ");
        double amount = getInput.nextDouble();
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. New Balance == " + balance);
        } else {
            System.out.println("Invalid or insufficient balance.");
        }
    }

    public static void exit() {
        System.out.println("Really Love to see you back, Goodbye.");
        System.exit(0);
    }
}