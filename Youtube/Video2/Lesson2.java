// Instance Variable and Instance Methods



// Instance Variables (Properties)

/* 

- What: Properties of a class that store data unique to each object.
- Role: Represent the state of an instance (e.g., `self.name`, `self.age`).
- Example: In a `Person` class, `self.name = "Alice"`.

*/


// Instance Methods
/* 

- What: Functions defined in a class that operate on an object's data.

- Role: Define behaviors specific to an instance (e.g., `greet()`).

- Example: `def greet(self): print(f"Hi, I'm {self.name}")`.

*/

/* Connection
- Instance variables hold the data; instance methods use or modify it.

*/

/* 

Declaring Objects
~~~~~~~~~~~~~~~~~~

1. Object Creation : new instatntiates a new object of a class.
2. Memory Allocation : Allocates memory for the object in the heap.
3. COnstructor Invocation : Calls the class constructor to initialize the objects
4. Reference Return : Return a reference to the created object.
5. Array Creation: Also used for creating arrays, like int[] arr = new int[];
6. Dynamic Allocation : Inlike static allocation , new allows for dyanamic



         (reference)     ( construct to make new obj)
         Object Name     Constructor
           |                |
           |                |
           |                |
Student student1 = new Student();
   ^                ^
   |                |
   |                |
Class Name        Keyword  
 


// Class Vs Object

Class is a blueprint 
~~~~~~~~~~~~~~~~~~~~~

like we are making class of CAR
where we are:

properties    methods

color         start()
price         backward()
km            forward()
model         stop() 

Object are real values in memory
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

properties values       methods

color : red               start()
price : 23,00             backward()
km : 1200                 forward()
model : Audi              stop() 


*/


public class Lesson2{

	// Instance Variables
	int noOfWheels;
	String color;
	float maxSpeed;
	float currentFuelInLiters;
	int noOfSeats;



    // Instance Methods

    public Lesson2 start(){
		if(currentFuelInLiters ==0){
			System.out.println("Car is out of fuel, can not start.");
		}else if(currentFuelInLiters < 5){
			System.out.println("Car is in reserved mode  please refuel");
			currentFuelInLiters--;
		}
		else{
		System.out.println("Car is started... brhhhhh");
		currentFuelInLiters--;
	}
	return this;
}

	public void drive(){
		 
			currentFuelInLiters--;
	 
		System.out.println("Car is driving");
	 
	}
 

	public void addFuel(float fuel){
		currentFuelInLiters += fuel;

	}

	public float getCurrentFuelLevel(){
		return currentFuelInLiters;
	}

	 

}