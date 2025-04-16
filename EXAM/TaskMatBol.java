// Sorting of Numbers and Names

import java.util.Scanner;


public class TaskMatBol{
	public static void main(String[] args){


		Scanner getInput = new Scanner(System.in);
         
         System.out.println("How many numbers and names you want to store");
	 	 int n = getInput.nextInt();
	 	 getInput.nextLine();  

 

		int[] arr = new int[n];

		String[] arr2 = new String[n];
         
         System.out.println("Enter " + n + " numbers:");
	 	 for(int i = 0; i < n; i++){
	 	 	arr[i] = getInput.nextInt();
	 	 }
	 	 getInput.nextLine();
         
         System.out.println("Enter " + n + " names:"); 
	 	  for(int i = 0; i < n; i++){
	 	 	arr2[i] = getInput.nextLine();
	 	 }
 
        System.out.println("Original numbers:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("Original names:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr2[i]);
        }

	 	 for(int i = 0; i < n; i ++){
	 	 	for(int j = i + 1; j <n; j++){
	 	 		if(arr[i] > arr[j]){
	 	 			int temp = arr[i];
	 	 			arr[i] = arr[j];
	 	 			arr[j] = temp;
	 	 		}
	 	 	}
	 	 }

	 	  for(int i = 0; i < n; i ++){
	 	  	for (int j = i + 1; j < n; j++) {
	 	 	if(arr2[i].compareTo(arr2[j]) > 0){
	 	 		String temp = arr2[i];
	 	 		arr2[i] = arr2[j];
	 	 		arr2[j] = temp;

	 	 	}
	 	 }
	 	 }

       System.out.println("Sorted numbers:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("Sorted names:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr2[i]);
        }


getInput.close();


	}
}