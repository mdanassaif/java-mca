// Polymorphism, which means "many forms," is a powerful concept in object-oriented programming that allows you to treat objects of different classes in a uniform way.  It simplifies code and makes it more flexible.

public class Day010{
    public static void main(String[] args){
        Animal[] animals = new Animal[3];
        animals[0] = new Animal("Generic Animal");
        animals[1] = new Dog("Buddy", "Labrador"); //Polymorphism
        animals[2] = new Animal("Another Generic Animal");

        for(Animal animal : animals){
            animal.makeSound();
        }
    }
}