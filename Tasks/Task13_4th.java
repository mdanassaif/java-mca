
// Multiple Inheritance
// Java does not support multiple inheritance with classes, but it allows it with interfaces.

/*
class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}

class Runner {
    void run() {
        System.out.println("Running...");
    }
}

// ❌ This will cause an error because Java does NOT support multiple inheritance!
class Dog extends Animal, Runner {  // ❌ ERROR!
}

*/


interface Shape{
	void draw();
}

interface Painting{
	void art();
}

class Artist implements Shape, Painting {
	public void draw(){
		System.out.println("Arist is drawing");

	}

	public void art(){
		System.out.println("Arist is making art");      
	}
}


class Task13_4th{
	public static void main(String args[]){
		Artist myArt = new Artist();
		myArt.draw();
		myArt.art();
	}
}


interface Shape{
	void draw();
}


interface Map{
	void art();
}

class Artist implements Shape, Map{
	public static void main(String[] args){
		
	}
}


