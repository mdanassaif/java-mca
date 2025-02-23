 
// inheritance : inheritance allows you to create new classes (derived classes or subclasses) based on existing classes (base classes or superclasses). The derived class inherits the attributes and methods of the base class, 1  and you can add new attributes and methods or override existing ones

public class Day09{
        public static void main(String[] args){
            Pug myPug = new Pug("Pug",2,true);

            System.out.println("Breed: "+myPug.breed); // Inherited from Dog
            System.out.println("Age: "+myPug.age); // Inherited from Dog
            System.out.println("Is Cute: "+myPug.isCute); // Specific to pug
        }
    }