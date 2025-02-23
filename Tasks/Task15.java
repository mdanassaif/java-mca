//  Interface Implementation.

// An interface in java is a blueprint of class that contains abstract methods ( methods with a body ) and constants.

// It is used to achieve abstraction and multiple inheritance in java


interface Book{
	void aboutBook();
}

class BookWorm implements Book{
	public void aboutBook(){
		System.out.println("Page 34 and gonna finish next day.");
	}
}

class BookSeller implements Book{
	public void aboutBook(){
		System.out.println("34 Books sold out today");
	}
}

public class Task15{
	public static void main(String args[]){		
		Book isBookWorm = new BookWorm();
		isBookWorm.aboutBook();

		Book isbookSold = new BookSeller();
		isbookSold.aboutBook();
	}
}

/*

	1.	Cannot Have Method Bodies – All methods in an interface are abstract by default (before Java 8).
	2.	Multiple Inheritance – A class can implement multiple interfaces.
	3.	No Object Creation – You cannot create an object of an interface.
	4.	Public and Abstract Methods – Interface methods are implicitly public and abstract.
	5.	Variables Are Final & Static – All variables declared in an interface are public, static, and final by default.

*/