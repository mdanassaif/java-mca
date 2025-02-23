public class ArithmeticOPR{
    public static void main(String args[]){
        int a, b , c;
        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);
        c = a + b;  

        System.out.println("addition"+c);
        c = a -b;
        System.out.println("Substraction"+c);
        c = a * b;
        System.out.println("Multiplication"+c);
        c = a / b;
        System.out.println("Division"+c);
        c = a % b;
        System.out.println("Modulous"+c);
    }
}