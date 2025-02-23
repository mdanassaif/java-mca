// Sorting of Numbers .

import java.util.Scanner;

public class Task7{
	public static void main(String args[]){
		Scanner getValue = new Scanner(System.in);
        System.out.println("========================================");
		System.out.print("How many number you want to store == ");
		int n = getValue.nextInt();
		System.out.println("========================================");
		int arr[] = new int[n];
        
        System.out.println("Write one by one all "+n+ " numbers : ");
		for(int i = 0; i < arr.length; i++){
			System.out.print(i+1+"--> ");
			arr[i] = getValue.nextInt();
		}
        System.out.println("========================================");
		System.out.println("Your all numbers before sorted order");
		System.out.println("========================================");
		for(int i = 0; i < arr.length; i++){
			System.out.println(arr[i]);
		}


		for(int i = 0; i < arr.length; i++){
			for(int j = i +1; j < arr.length; j++){
				int temp ;
			   if ( arr[i] > arr[j]){
			   	temp = arr[i];
			   	arr[i] = arr[j];
			   	arr[j] = temp;
			   }

			}
		}

        System.out.println("========================================");
		System.out.println("Your all numbers after sorted order");
		System.out.println("========================================");
		for(int i = 0; i < arr.length; i++){
			System.out.println(arr[i]);
		}


		
getValue.close();
	}
}