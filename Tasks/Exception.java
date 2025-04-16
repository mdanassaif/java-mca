import java.io.IOException;


public class ExceptionHnadling{
	public static void main(String[] args){
		// diivde by zero ( unchecked excpection)
		try{
			in result = 1/0;
		}catch(ArithmeticException e){
			System.out.println("Can't divide by zer"+e.getMessage());

		}


		// checked expetion 

		try{
			readFile("file.txt");
		}catch(IOException e){
           System.out.println("Can't found the file"+e.getMessage());
		}
	}
}