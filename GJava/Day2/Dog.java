class Dog extends Animal {
    String breed;

    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}








/*

What is Method Overriding?

Method overriding occurs when a subclass (derived class) provides a specific implementation for a method that is already defined in its superclass (base class).  The subclass's version of the method replaces the superclass's version when called on an object of the subclass type.

Why do we need Overriding?

Inheritance establishes an "is-a" relationship (e.g., a Dog is an Animal).  However, sometimes the inherited behavior from the superclass isn't exactly what you need for the subclass.  Overriding allows you to customize or specialize that behavior.


 */