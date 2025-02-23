// Write a java program to find the ODD or EVEN number.

import java.util.Scanner;

public class Task4{
	public static void main(String args[]){
		Scanner takeInput = new Scanner(System.in);
		System.out.print("Choose any Positive number == ");
		int yourfavNum = takeInput.nextInt();
		if(yourfavNum%2==0){
			System.out.println("Your Number = "+yourfavNum+" is an Even Number.");
		}else {
			System.out.println("Your Number = "+yourfavNum+" is an Odd Number.");
		}
	}
}