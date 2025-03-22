// Nested Classes (static) 

public class Task16 {

   public static class InnerClass{
    private int num;
    public void setData(int num){
        this.num = num;
    }

    public int getData(){
        return num;
    }

    public void square(int num){
        this.num = (num*num);
    }
   }

   public static void main(String[] args){
    InnerClass obj = new InnerClass();
    obj.setData(12);
    System.out.println("The num is "+obj.getData());
    obj.square(13);
    System.out.println("The new num is:"+obj.getData());
   }
}