// Big Integer & Big Decimal Program

import java.util.Scanner;
import java.math.BigInteger;
import java.math.BigDecimal;


public class Task9 {
	public static void main(String args[]){
		Scanner getInput = new Scanner(System.in);


        System.out.println("------------------------------");
        System.out.println("Write your Two Big Big Integer");
        System.out.println("------------------------------");
        System.out.print("( 1 ) --> ");
		BigInteger num1 = new BigInteger(getInput.nextLine());
        System.out.print("( 2 ) --> ");
		BigInteger num2 = new BigInteger(getInput.nextLine());


        System.out.println("|-------------------------------");
 		System.out.println("| The sum :"+num1.add(num2));
		System.out.println("| The Minus :"+num1.subtract(num2));
		System.out.println("| The Multiply :"+num1.multiply(num2));
		System.out.println("| The Division :"+num1.divide(num2));
		System.out.println("| The Modulous :"+num1.mod(num2));
		System.out.println("|-------------------------------");

        
        System.out.println("------------------------------");
        System.out.println("Write your Two Big Big Decimal");
        System.out.println("------------------------------");
        System.out.print("( 1 ) --> ");
		BigDecimal num3 = new BigDecimal(getInput.nextLine());
		System.out.print("( 2 ) --> ");
		BigDecimal num4 = new BigDecimal(getInput.nextLine());


        System.out.println("|-------------------------------");
 		System.out.println("| The sum :"+num1.add(num2));
		System.out.println("| The Minus :"+num1.subtract(num2));
		System.out.println("| The Multiply :"+num1.multiply(num2));
		// System.out.println("The Division :"+num3.divide(num4));
		// System.out.println("The Modulous :"+num3.remainder(num4));
		System.out.println("|-------------------------------");


		getInput.close();
	}
}