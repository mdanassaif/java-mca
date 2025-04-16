//BigInteger and BigDecimal Program

import java.math.BigInteger;
import java.math.BigDecimal;

import java.util.Scanner;

public class KashNaBol{
	public static void main(String args[]){

	Scanner GetINP = new Scanner(System.in);

	BigInteger x = new BigInteger(GetINP.nextLine());

	BigInteger y = new BigInteger(GetINP.nextLine());

	System.out.println("The sum is "+x.add(y));
	System.out.println("The sub is "+x.subtract(y));
	System.out.println("The mul is "+x.multiply(y));
	System.out.println("The div is "+x.divide(y));
	System.out.println("The mod is "+x.mod(y));

	BigDecimal a = new BigDecimal(GetINP.nextLine());
	BigDecimal b = new BigDecimal(GetINP.nextLine());

	System.out.println("The sum is "+a.add(b));
	System.out.println("The sub is "+a.subtract(b));
	System.out.println("The mul is "+a.multiply(b));
	// System.out.println("The div is "+x.divide(y));
	// System.out.println("The mod is "+x.mod(y));
     

 }    
}