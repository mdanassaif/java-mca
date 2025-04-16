// Method Overriding program

class anas1 {
	void task1(){
		System.out.println("On the way");
	}
}

class anas2 extends anas1{
	@Override

	void task1(){
         System.out.println("Almost completed");
	}
}

public class CrazyHogyaBhai{

 
	public static void main(String args[]){

	 anas1 obj = new anas1();

	 obj.task1();

	 anas1 obj2 = new anas2();
	 obj2.task1();





	}
}