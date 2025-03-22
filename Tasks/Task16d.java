// Anonymous Nested Class 

abstract class OuterClass{
	int num = 15;
	abstract void getNum();
}

public class Task16d{
	public static void main(String args[]){
		OuterClass obj = new OuterClass(){
		@Override
		void getNum(){
			System.out.println("The current num is: "+num);
		}
	};
	obj.getNum();
}
}