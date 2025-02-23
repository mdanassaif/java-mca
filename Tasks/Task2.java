// Write a java program to perform arithmetical operations 
import java.util.Scanner;


public class Task2{
	public static void main(String args[]){



		// method 1 : Static way to perform arithmetical operations 

		System.out.println("-----------------------------------"); 
        System.out.println("-----------------------------------");
        System.out.println("-----------Static way--------------");
        System.out.println("-----------------------------------"); 
        System.out.println("-----------------------------------");
        int favNum1 = 10, favNum2 = 20, favNumFinal = 0;     
        favNumFinal = favNum1 + favNum2;
        System.out.println("The sum = " + favNumFinal);
        favNumFinal = favNum1 - favNum2;
        System.out.println("The minus = " + favNumFinal);
        favNumFinal = favNum1 * favNum2;
        System.out.println("The multiply = " + favNumFinal);
        favNumFinal = favNum1 / favNum2;
        System.out.println("The division = " + favNumFinal);
        favNumFinal = favNum1 % favNum2;
        System.out.println("The modulous = " + favNumFinal);
        System.out.println("-----------------------------------");
        System.out.println("-----------------------------------");
        System.out.println("-----------------------------------");


       // method 2 : Scanner class way perform arithmetical operations

        int finalNum;
		Scanner takeInput = new Scanner(System.in);
        System.out.print("Write your First Number = ");
		int fNum = takeInput.nextInt();
		System.out.print("Write your Second Number = ");
		int sNum = takeInput.nextInt();
        System.out.println("-----------------------------------"); 
        System.out.println("-----------------------------------");
        System.out.println("-----------Scanner way-------------");
        System.out.println("-----------------------------------"); 
        System.out.println("-----------------------------------");
		finalNum = fNum + sNum;

		System.out.println("The sum of your numbers = "+finalNum);

		finalNum = fNum - sNum;

		System.out.println("The minus of your numbers = "+finalNum);


		finalNum = fNum * sNum;

		System.out.println("The multiply of your numbers = "+finalNum);


		finalNum = fNum / sNum;

		System.out.println("The division of your numbers = "+finalNum);


		finalNum = fNum % sNum;

		System.out.println("The modulous of your numbers = "+finalNum);
		System.out.println("------------------------------------");

	}
}