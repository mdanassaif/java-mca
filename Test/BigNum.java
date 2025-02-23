public class BigNum{
    public static void main(String args[]){
        int a , b, c;

        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);
        c = Integer.parseInt(args[2]);

        if(a > b && a > c){
            System.out.println("A = "+a+" is the bigger number");
        }else if(b > a && b > c){
            System.out.println("B = "+b+" is the bigger number");
        }else{
            System.out.println("C = "+c+" is the bigger number");
        }
    }
}