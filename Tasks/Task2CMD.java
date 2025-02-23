// Write a java program to perform arithmetical operations using Command Line Argument 

public class Task2CMD {
    public static void main(String args[]){
        int favNum1 = Integer.parseInt(args[0]);
        int favNum2 = Integer.parseInt(args[1]);
        int favNumFinal;

        System.out.println("----------------------");
        System.out.println("----- CLI Way --------");
        System.out.println("----------------------");
        favNumFinal  = favNum1 + favNum2;
        System.out.println("Sum: " + favNumFinal);
        System.out.println("----------------------");
        favNumFinal  = favNum1 - favNum2;
        System.out.println("Minus: " + favNumFinal);
        System.out.println("----------------------");
        favNumFinal  = favNum1 * favNum2;
        System.out.println("Multiply: " + favNumFinal);
        System.out.println("----------------------");
        favNumFinal  = favNum1 / favNum2;
        System.out.println("Division: " + favNumFinal);
        System.out.println("----------------------");
        favNumFinal  = favNum1 % favNum2;
        System.out.println("Modulous: " + favNumFinal);
        System.out.println("----------------------");
    }
}