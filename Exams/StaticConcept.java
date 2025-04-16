// Static and Static variable



class MyClass {
	static int count = 0;

	MyClass(){
		count++;
	}

	void display(){
		System.out.println("Count: "+ count);
	}
}

public class StaticConcept{
	public static void main(String[] args){
		MyClass obj1 = new MyClass();
		MyClass obj2 = new MyClass();
		MyClass obj3 = new MyClass();

		obj1.display();
		obj2.display();

		System.out.println("Direct access: "+MyClass.count);

	}
}