 
public class Day03{
    public static void main(String[] args){

        int x = 10;
        int y = 20;

        // Arithmetic operators
        int sum = x + y;
        int difference = x -y;
        int division = x /y;
        int multiplicatipn = x *y;
        int modulous = x % y; // remainder of deivision

        // Assignment operators
        int z = 10;
        z += 5; // becomes 10+5 = 15
        z -= 3; // becomes 15 - 3 = 12
        z *= 2; // becomes 12 * 2 = 24
        z /=4; // become 24 / 4 = 6

        // printing the results
        System.out.println("Sum: "+sum);
        System.out.println("Difference: "+difference);
        System.out.println("Division: "+division);
        System.out.println("Multiplication: "+multiplicatipn);
        System.out.println("Modulous: "+modulous);
        System.out.print("The value of z becomes: "+z);





    }
}