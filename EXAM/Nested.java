 

// 1. Static Nested Classes

/*

A static nested class is a class defined inside another class with the static keyword


*/

class Outer {
	static class StaticNested{
		void display(){
			System.out.println("Hello I am static_nested class");
		}
	}
}


public class Nested{
	public static void main(String[] args){
		Outer.StaticNested nested = new Outer.StaticNested();
		nested.display();
	}
}


/*

A non-static nested class, also called an inner class is defined inside another class without the static keyword. It is tied to an instance of the outer class.

*/

class Outer {
	private String message = "Hello from Outer";

	class Inner{
		void display(){
			System.out.println(message)
		}
	}
}

public class Nested{
	public static void main(String[] args){
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		inner.display();

	}
}