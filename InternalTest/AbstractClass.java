// Abstract class
abstract class Brand {
    // Static method (can be accessed without creating an object)
    public static void staticMethod() {
        System.out.println("This is a static method in the abstract class Brand.");
    }

    // Abstract method (no implementation, must be overridden by subclass)
    public abstract void displayInfo();
}

// Subclass that inherits from the abstract class Brand
class Car extends Brand {
    // Overriding the abstract method
    @Override
    public void displayInfo() {
        System.out.println("This is a Car from the Brand.");
    }
}

// Main class to test the code
 class AbsractClass {
    public static void main(String[] args) {
        // We cannot create an object of the abstract class Brand
        // Brand brand = new Brand(); // This would cause a compilation error

        // Create an object of the subclass Car
        Car car = new Car();
        car.displayInfo();

        // Access the static method from the abstract class using the class name
        Brand.staticMethod();
    }
}
