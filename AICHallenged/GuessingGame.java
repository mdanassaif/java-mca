import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
String PlayAgain;
        do{
        System.out.println("Welcome to the Number Guessing Game!");
        Random randNum = new Random();
        int num = randNum.nextInt(100) + 1;
        Scanner getNum = new Scanner(System.in);
     
        for(int i = 0; i <10; i++){

        System.out.println("Guess a number between 1 and 100 (" + (10 - i) + " tries left):");
        int guess;
        try{
            guess = getNum.nextInt();
        } catch(InputMismatchException e){
            System.out.println("Please enter a valid number");
            getNum.nextLine();
            i--;
            continue;
        }
        

        if(num == guess){
            System.out.println("You got it! The Number was:"+num);
            break;
        }else if(guess < num){
            System.out.println("Too low! Try again.");
        }else{
            System.out.println("Too high! Try again.");
        }

        if (i == 9) { 
            System.out.println("Game over! The number was: " + num);
        }

    }
    getNum.nextLine();
    System.out.println("Play again? (Yes/no)");
    PlayAgain = getNum.nextLine().trim().toLowerCase();
    if(!PlayAgain.equals("yes") && !PlayAgain.equals("no")){
        getNum.nextLine();
    }

}while(PlayAgain.equals("yes"));


    System.out.println("Thanks for playing");
        
    }
}