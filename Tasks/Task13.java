
// Inheritance Implementation (Single, Multiple, Multilevel, Hierarchical).

/* Inheritance in Java

Inheritance is a mechanism where one class acquires the properties and behaviors of another class.

Types of Inheritance in Java:
	1.	Single Inheritance – One class inherits from another.
	2.	Multilevel Inheritance – A class inherits from another class, forming a chain.
	3.	Hierarchical Inheritance – Multiple classes inherit from a single class.
	4.	Multiple Inheritance (via Interfaces) – Java does not support multiple inheritance with classes but allows it through interfaces.
	
*/

//////////// Single Inheritance ////////////

class Work {
	void doWork(){
		System.out.println("People Do their Work");
	}
}

class Tasks extends Work {
	void doTasks(){
		System.out.println("Worker do their tasks.");
	}
}


class Task13{
	public static void main(String args[]){
		Tasks myTask = new Tasks();
		myTask.doWork(); // inherited parent method 
		myTask.doTasks(); // child class method
	}
}