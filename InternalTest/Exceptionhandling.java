/*exception is an abnormal condition or situation 
that arise at runtime. 

event that disturb the normal flow of runtime of class exception.

exception handling is a mechanism to handle runtime error

normal flow of application can be maintiantain
there are two types of exceptopn founded

1) Checked exception : these exception are checked at complie time 

import java.util.io;


public class Hello{
	public static void main(String[] args){
	try{
	File file = new File("helloworld.txt");
	FileReader reader = new FileReader(file);

	reader.read();
	reader.close();
	} catch(IOExection e){
	System.out.println("A checked exception occured "+e.getMessage);
	}
	System.out.println("Program continues after handling the execution")
	}
}

2) Uncked exception : these exception are unchecke ar execting time

public class Hello2 {
	public static void main(String[] args){
	int a = 10;
	int b = 0;
	try{
	int sum = a /b;
	system.out.println("The sum of numbers"+sum);
	}catch(ArithmeticExection e){
	System.out.println("The exception is"+e.getMessage);
	}
	System.out.println("The program continue after hadning the exception");
	}
}

*/