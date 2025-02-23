// Sorting of Names.

import java.util.Scanner;

public class Task7Name {
	public static void main(String args[]){

        Scanner getInput = new Scanner(System.in);
        System.out.println("========================================");
        System.out.print("How many names you want to store = ");
        int n = getInput.nextInt();
        getInput.nextLine();
        System.out.println("========================================");
		String arr[] = new String[n];
		
		

		for(int i = 0; i < arr.length; i++){
			System.out.print(i+1+"---> ");
			arr[i] = getInput.nextLine();
		}

        System.out.println("========================");
        System.out.println("Names before storing");
        System.out.println("========================");
		for(int i = 0; i < arr.length; i++){
			System.out.println(arr[i]);
		}

		for(int i = 0; i < arr.length; i++){
			for(int j = i + 1; j < arr.length; j++){
				String temp;
				if(arr[i].compareTo(arr[j]) > 0){
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp; 
				}

			}
		}
        System.out.println("========================");
        System.out.println("Names after storing");
        System.out.println("========================");
		for(int i = 0; i < arr.length; i++){
			System.out.println(arr[i]);
		}

getInput.close();
		 
	}
}