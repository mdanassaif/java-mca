// Derived class ( Subclass) inheriting from Dog

class Pug extends Dog{
    boolean isCute;

    public Pug(String breed, int age, boolean isCute){
        super(breed, age); // call the superclass constructor to initialize breed and age
        this.isCute = isCute;
    }

    public void beCute(){
        if(isCute){
            System.out.println("Pug us being cute!");
        }
    }
}


// super() is used to call the superclass constructor. It must be the first statement in the subclass constructor.
// super (without parentheses) can be used to access superclass members (variables and methods), even if they are hidden by subclass members with the same name.
// super is only used in the context of inheritance (when one class extends another).