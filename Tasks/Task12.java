
/* 
Method overriding occurs when a subclass provides a specific implementation of a method that is already defined in its superclass. The method must have the same name, return type, and parameters. 
*/

// parent class 

class Family{
	void doWork(){
		System.out.println("Family do work.")
	}
}


// Child class overriding the method
class Father extends Family{
    // Overriding the doWork method
	@Override

	void doWork(){
		System.out.println("Father do work for family.")
	}
}

public class Task12{
	public static void main(String args[]){
		Family myFamily = new Family();

		myFamily.doWork();

		Father myFather = new Father();
		myFather.doWork();

		Family ref = new Father;
		ref.doWork();

		/* Runtime Polymorphism: When a parent class reference is used to call an overridden method, the child’s method executes. */


	}
}

