/*

Inheritance allows a class ( subclass/child class) to inherit properties 
( field and methods) from another class ( superclass/parent class). 
it promotes code resuabality and establishes a "is-a" relationship 
between classes.


// Benefits of Inheritance:

-- Code Resulablity - Reuse code from parent class
-- Method Overriding : sublcass can provide a specific implementation of
 a method already defined in the superclass
-- Extensibility : Easily extend functionality by adding new features in 
the subclass.
-- Data Hiding : Base class can decide to keep some data  private so that 
it can not be access by others.




// Superclasses and Subclasses:

-- A superclass is the parent class add a subclass is the child xlass that
extends the superclas suing the extends keyword.

// Member Access Rules :

-- Subclasses can access public and protencted members of the superclass.

--Privare members are not directly accessible but can be accesses via 
  getters/setters.


// Super Keyword :

Used to refer to the immediate parent clas;s constructor, method or variable.

// FInal Keyword

a final class  cannot be inherted , a final method cannot be overridden 
and a final variable cannot be redesigned.


// Types of Inheritance 

1) Single 
~~~~~~~~~~

It is simple Inheritance of all when a class extends another class 
( only one class) then we call it as Single Inheritance.





2) Muli-level 
~~~~~~~~~~

In this inheritance , if derived class will be inheriting a parent class 
and as well as the derived class ast as the parent class to other class.



3) Heirarical 
~~~~~~~~~~

one parent class wil be inherited by many sub class 

4) Multiple 
~~~~~~~~~~

It/s nothing but one class extending more than one parent class/super class
multiple inheritance is basically not supported by many object-oriented 
programming languages such as JAVA, c# etc.

But you can achieve multiple-inheritance using interfaces.

public class A {
	-----
}

Interface B{
	
}

class C extends A implements B{
	
}


*/




class Human{
	String name = "Human";
	void drink(){
		System.out.printlkfl
	}
}
