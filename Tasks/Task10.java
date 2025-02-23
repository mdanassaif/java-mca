//Constructor Overloading Program.

class Task10{
	String name;
	int age;



	// Default constructor
	Task10(){
		this.name = "Unknown";
		this.age = 0;
		System.out.println("Default constructor : Name = "+name + ", Age = " + age );
	}

	// Parametherized Constructor with one argument
	Task10(String name){
		this.name = name;
		this.age = 0;
		System.out.println("Single Parameter constructor : Name = "+name + ", Age = " + age );
	}

	// Parametherized Constructor with two argument
	Task10(String name, int age){
		this.name = name;
		this.age = age;
		System.out.println("Single Parameter constructor : Name = "+name + ", Age = " + age );
	}

	public static void main(String args[]){
		Task10 t1 = new Task10();
		Task10 t2 = new Task10("Mohd");
		Task10 t3 = new Task10("Anas", 22);
	}
}


// Constructor Overloading in Java is a feature
// that allows a class to have multiple constructors 
// with different parameter lists.
// Multiple constructors exist in the same class with different signatures.
// It improves flexibility by allowing object initialization in different ways.
