 
//Methods in Java. Methods are blocks of code that perform specific tasks. They allow you to organize your code, make it more readable, and reuse code easily.

public class Day07 {
    public static int calculateArea(int length, int width){ // This is the return type of the method so use int over void
        return length * width;

    }    

    public static void main(String[] args){
        int length = 10;
        int width = 30;

        int areaOfRectangle = calculateArea(length, width);

        System.out.println("The area of the rectangle is: "+areaOfRectangle);
    }
}
