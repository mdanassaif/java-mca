// Write a java program to find the greatest among the 3 numbers using command line arguments.


public class Task3{
	public static void main(String args[]){
		int firstNum = Integer.parseInt(args[0]);
		int secondNum = Integer.parseInt(args[1]);
		int thirdNum = Integer.parseInt(args[2]);

		if(firstNum>secondNum && firstNum > thirdNum){
			System.out.println("A ="+firstNum+ " is bigger than B = "+secondNum +" & C ="+thirdNum);
		}else if(secondNum>firstNum && secondNum > thirdNum){
            System.out.println("B = "+secondNum+ " is bigger than A = "+firstNum +" & C = "+thirdNum);
		}else{
           System.out.println("C ="+thirdNum+ " is bigger than A = "+firstNum +" & B ="+secondNum);
		}

	}
}