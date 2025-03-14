// While Loop, Methods & Array

/*

1. Comments
~~~~~~~~~~~~~

USed to add notes in java code
Syntax : 

--> Single line : //
--> Multi Line : /* -Your notes inside-- * /


What is Loop ?
****************
Code that runs multiple times based on a condition


2. While Loop
~~~~~~~~~~~~~~~

while(condition){
	// Code 
}

3. Methods ( FUnctions)
~~~~~~~~~~~~~~~~~~~~~~~~

Blocks of resuable code


4. Return Statement
~~~~~~~~~~~~~~~~~~~

Sends a value back from a function.
What can be returned ? Value, variable, calculation etc
Return endss the function immediatlety

public static void main ❌
public static int main ✅



5. Arguments
~~~~~~~~~~~~~~

Input values that a function takes
Parameters put value into function , while return gets value out.



6. Arrays 
~~~~~~~~~~~

An array is just a list of values.
Arrays are used to storing multiple values in a single variable.

*/
import java.util.Scanner;

public class Lesson4{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		int[] myInts = new int[10]; // making an object
		int[] intvalues = {1, 2, 3, 4, 5, 6, 8, 10, 34};
		int num = input.nextInt();
		boolean isFound = isFound(intvalues, num);

		if(isFound){
			System.out.println("Your number found");
		}else{
			System.out.println("Didn't found your num.");
		}
	}

	public static boolean isFound(int[] intvalues,  int num ){
		int index = 0;
		while ( index < intvalues.length){
			if(intvalues[index] == num){
					return true;
			}
		 
			index++;
		}
		return false;
	}
}

// get memory at same time and get same name but need to retrive particular value by index number
// square bracket means --> array ( keep in mind )
// array is an object 


/*

7. 2D Arrays

int[][] numArray = new int[2][3];
int[][] numValues = {{1, 3, 5}, {3, 6, 7}}

numArray[0][2] // output : 5;


*/

