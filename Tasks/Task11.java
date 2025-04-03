//method Overloading Program.

public class Task11{

	void HelloWorld(){
		System.out.println("HelloWorld Method without parameter");
	}

	void HelloWorld(int num){
		System.out.println("HelloWorld Method with 1 parameter: "+num);
	}

	void HelloWorld(int num, String text){
		System.out.println("HelloWorld Method with 2 parameter: "+num + ","+text);
	}

	public static void main(String args[]){

		Task11 obj = new Task11();

		obj.HelloWorld();
		obj.HelloWorld(10);
		obj.HelloWorld(20, "India");
	}
}


 