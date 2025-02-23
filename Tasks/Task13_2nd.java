// Multilevel Inheritance

class Food {
	void eatFood(){
		System.out.println("People eat Food.");
	}
}

class Fruits extends Food{
	void eatFruits(){
		System.out.println("People eat Fruits.");
	}
}

class Drink extends Fruits{
	void doDrink(){
		System.out.println("People drink.");
	}
}

class Task13_2nd{
	public static void main(String args[]){
		Drink myFood = new Drink();
		myFood.eatFood();
		myFood.eatFruits();
		myFood.doDrink();
	}
}