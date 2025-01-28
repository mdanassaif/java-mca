 
// FInd the bigger number among three number

import java.util.*;

class Main3 {
    public static void main(String args[]){
        int a, b, c;
        System.out.println("Enter Your 3 Numbers:");

        Scanner getNums = new Scanner(System.in);  
        System.out.println("Write your first number");
        a = getNums.nextInt();
        System.out.println("Write your second number");
        b = getNums.nextInt();
		System.out.println("Write your third number");
		c = getNums.nextInt();
		
		if(a > b && a > c){
				System.out.println("Biggest number is ="+a);
		}else if( b > a && b > c){
			System.out.println("Biggest number is ="+b);
		} else{
				System.out.println("Biggest number is = "+c);
		}
        
        
    }
}