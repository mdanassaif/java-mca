import java.util.*;

class Main {
    public static void main(String arg[]){
      Scanner askingNum = new Scanner(System.in);

      System.out.println("Enter the length =");
      double length = askingNum.nextDouble();

      System.out.println("Enter the width =");
      double width = askingNum.nextDouble();

      double area = calCulateArea(length,width);

      System.out.println("The area od rectangle is = "+area);

      askingNum.close();


    }

    private static double calCulateArea(double x, double y){
        return x * y;

    }
}