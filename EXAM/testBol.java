// Develop a java application for Banking transaction : Balance_Check, Deposit_Amount,
// Withdraw_Amount and Exit.

import java.util.Scanner;


public class testBol{
	static double balance = 1000.00;
	public static void main(String[] args){
    

      Scanner getInput = new Scanner(System.in);
      int choice;

    do {
            System.out.println("\n=====================");
            System.out.println("   Welcome to Our Bank   ");
            System.out.println("=====================");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("---------------------");
            System.out.print("Choose your option: ");
      choice  = getInput.nextInt();




      switch(choice){
      case 1:
      	getbalance();
      	break;
      case 2:
      	addMoney(getInput);
      	break;
      case 3:
      	takeMoney(getInput);
      	break;
      case 4:
      	System.out.println("Thank you for visiting : /");
      	break;	
      default:
      	System.out.println("You choose please better between 1 -4 ");
      	break;			
      }

    }while(choice != 4);

    getInput.close();
   }


   public static void getbalance(){
   	System.out.println("You Balance : "+balance);

   }



   public static void addMoney(Scanner getInput){
   	System.out.print("Please write amount to Deposit === ");
   	int addAmount = getInput.nextInt();

   	if(addAmount > 0){
   		balance += addAmount;
   		System.out.println("You added "+addAmount+ "so final balance is "+balance);
   	}else{
   		 System.out.println("You are not adding money, I think.");
   	}
  
   }

     public static void takeMoney(Scanner getInput){
     	System.out.print("Please write amount to Withdraw === ");
     	int newAmount = getInput.nextInt();
   	if(newAmount > 0 && newAmount <= balance){
   		balance -= newAmount;
   		System.out.println("You took "+newAmount+ "so final balance is "+balance);
   		
   	}else{
   		 System.out.println("You haven't money so first add some money");

   	}
  
   }
}

