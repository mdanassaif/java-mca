// This is predefined classs in Java to perform arithmatical operation we don't use the operator

// Package --> class ---> BigInteger

import java.util.Scanner;
import java.math.BigInteger;

public class BigInt{
	public static void main(String[] args){

		BigInteger r;

		Scanner getValue = new Scanner(System.in);
        
        System.out.print("Write your first number --> ");
		BigInteger num1 = getValue.nextBigInteger();
		System.out.print("Write your second number --> ");
		BigInteger num2 = getValue.nextBigInteger();

		r = num1.add(num2);

		System.out.println("The sum of your number is == "+r);

		r = num1.subtract(num2);

		System.out.println("The sub of your number is == "+r);

		r = num1.multiply(num2);

		System.out.println("The multiply of your number is == "+r);

		r = num1.divide(num2);

		System.out.println("The Division of your number is == "+r);

		r = num1.mod(num2);

		System.out.println("The Modulous of your number is == "+r);

	}
}