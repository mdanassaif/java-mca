/*

It is a fundamental concept in OOP that allows developers to represent 
complex system by simplyfying them into their essential characterstics while
hide unnessary implementation details.

Abstartion in java can be achieve using the abstract classes and intefaces.

Abstract class : An abstract class is a class that cannot be initialize 
^^^^^^^^^^^^^^   on its own and serves as a blue print for other class. 


1) Abstract class are declared using "abstract" classes.
2) It can contain abstract method as well as concrete method.




*/

abstract class Shape{
	public abstract double area();

	public void display(){
		System.out.println("This is a shape class");
	}
}

class Rectangle extends Shape {
	private double length;
	private double width;

	Rectangle(double length , double width){
		this.length = length;
		this.width = width;
	}

	public double area(){
		return length * width;
	}


}

class Circle extends Shape {
	private double radius;

	public Circle(double radius){
		this.radius = radius;
	}

	public double area(){
		return Math.PI * radius * radius;
	}
}

 
 

public class Abstraction{
	public static void main(String[] args){
		Shape rect1 = new Rectangle(5, 4);
		Shape circle1 = new Circle(5);
 

		System.out.println("Area of Rect: "+rect1.area());
		System.out.println("Area of Rect: "+circle1.area());
	}
}