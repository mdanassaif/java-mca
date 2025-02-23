import java.math.BigInteger;
import java.util.Scanner;



public class BigIntWala{
    public static void main(String args[]){
        BigInteger r;

        Scanner  scan = new Scanner(System.in);

        System.out.println("Entrer your big numbers.");

        BigInteger a = scan.nextBigInteger();
        BigInteger b = scan.nextBigInteger();

        r = b.add(a);
        System.out.println("The sum of big numbers: "+r);

        r = b.subtract(a);
        System.out.println("The ssubtractum of big numbers: "+r);

        r = b.multiply(a);
        System.out.println("The multiply of big numbers: "+r);

        r = b.divide(a);
        System.out.println("The divide of big numbers: "+r);

        r = b.mod(a);
        System.out.println("The mod of big numbers: "+r);
        




        

    }
}