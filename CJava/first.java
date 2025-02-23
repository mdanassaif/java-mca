 
// Arithmetic Operations by Using Scanner and get name as well from user

import java.util.*;

class Main {
    public static void main(String args[]){
        int a, b, c;
        String name;
        System.out.println("Arithmetic Operations:");

        Scanner getNums = new Scanner(System.in);  
        System.out.println("Write your first number");
        a = getNums.nextInt();
        System.out.println("Write your second number");
        b = getNums.nextInt();
        
        getNums.nextLine();
        
        System.out.println("Write your name");
        name = getNums.nextLine();

        System.out.println("Your name is: " + name + " And your calculations are below");
        
        c = a + b;
        System.out.println("The addition of your two numbers = " + c);
        
        c = a - b;
        System.out.println("The subtraction of your two numbers = " + c);
        
        c = a * b;
        System.out.println("The multiplication of your two numbers = " + c);
        
        c = a / b;
        System.out.println("The division of your two numbers = " + c);
        
        c = a % b;
    }
}
