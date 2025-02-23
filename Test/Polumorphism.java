public class Polumorphism {
   public int add(int a, int b){
    return a + b;
   }

   public int add(int a, int b, int c){
    return a + b + c;
   }

   public double add(double a , double b){
    return a + b;
   }

   public static void main(String args[]){
    Polumorphism obj = new Polumorphism();
    System.out.println("Sum of 2 and 3"+obj.add(2,3));
    System.out.println("Sum of 2, 1 and 3"+obj.add(2,3, 1));
    System.out.println("Sum of 2.3 and 3.2"+obj.add(2.3,3.2));
   }
}
