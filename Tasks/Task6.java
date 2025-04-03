// Generic Program for one type parameter and two type parameter.


class Box<T>{
    private T item;

    public void setItem(T item){
        this.item = item;
    }

    public T getItem(){
        return item;

    }
}



public class test{
    public static void main(String args[]){
       
       Box<String> stringBox = new Box<>();
       stringBox.setItem("hehe");
       System.out.println("The item is "+ stringBox.getItem());


       Box<Integer> integerBox = new Box<>();
       integerBox.setItem(2020);
       System.out.println("The number is "+integerBox.getItem());
    }
}

// How it works:
// Box<T> → T is a placeholder for any type.
// When you use Box<String>, T becomes String.
// When you use Box<Integer>, T becomes Integer.