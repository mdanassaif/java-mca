public class Lesson2Obj {
	String name;
	String dateOfLicense;



	public static void main(String[] args){
		// making static because JVM no need to makw own object to access it

		// Lesson2 newCar; // reference , just address created not an actual object created
		// Lesson2 newCar = new Lesson2();
		// newCar.addFuel(6);
		// newCar.drive();
		// newCar.drive();
		// newCar.drive();
		// newCar.addFuel(6);
		// newCar.drive();
		// newCar.drive();
		// newCar.drive();
		// newCar.drive();
		// newCar.drive();
		// newCar.drive();
		// newCar.drive();
		// newCar.drive();
		// newCar.drive();
		// newCar.drive();		
		// System.out.println(newCar.getCurrentFuelLevel());
		// System.out.println(newCar.getCurrentFuelLevel());

		Lesson2 myCar = new Lesson2();
		myCar.addFuel(8);
		myCar.start().drive();

		Driver Lesson2Obj = new Lesson2Obj();
		Lesson2Obj.dateOfLicense = "1/32/1920";
	 


	}
}