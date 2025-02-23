// Abstract Class Implementation.

// An abstract class is declared using the abstract keyword.

// It can have both abstract methods (without implementation) and concrete methods (with implementation).

//	A subclass must implement the abstract methods or be declared abstract itself.


abstract class Room {
	abstract void findRoom();

	void payMoney(){
		System.out.println("For get room need to pay money as rent.");
	}

}


class Roommate extends Room {
	void findRoom(){
		System.out.println("Finding room is hard as find peace.");
	}
}

public class Task14{
	public static void main(String args[]){
		Roommate newPerson = new Roommate();
		newPerson.payMoney();
		newPerson.findRoom();
	}
}