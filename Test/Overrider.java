class Monkey {
    void makeSound(){
        System.out.println("hey");
    }
}

class Animal extends Monkey {
    @Override // hey
    void makeSound(){
        System.out.println("bye");
    }

}

public class Overrider {
    public static void main(String[] args){
        Monkey myMonkey = new Monkey();
        Animal newAnimal = new Animal();
        Animal anptheAnimal = new Animal();

        myMonkey.makeSound();
        newAnimal.makeSound();
        anptheAnimal.makeSound();

    }
    
}
