interface Shape {
    double area();
    void display();
}

class Rectangle implements Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double area() {
        return length * width;
    }

    public void display() {
        System.out.println("Rectangle area: " + area());
    }
}

class Circle implements Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public void display() {
        System.out.println("Circle area: " + area());
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Shape rect = new Rectangle(5, 4);
        Shape circle = new Circle(3);

        rect.display();
        circle.display();
    }
}