// Nested Classs ( non - static)

class OuterClass {

	static int num1 = 10;
	int num2 = 20;
	private int num3 = 30;

	class InnerClass{
		void display(){
			System.out.println("Static outer num1: "+num1);
			System.out.println("Non-Static outer num2: "+num2);
			System.out.println("private outer num3: "+num3);
		}
	}
}

public class Task16b {
	public static void main(String[] args){
		OuterClass outerObj = new OuterClass();
		OuterClass.InnerClass innerObj = outerObj.new InnerClass();
		innerObj.display();
	}
}