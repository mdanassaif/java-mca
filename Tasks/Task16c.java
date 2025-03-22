// Local Nested Class 

class OuterClass{
	void display(){
		class LocalClass{
			public int num;
			LocalClass(){
				this.num = 10;
			}
			private int getValue(){
				return num;
			}
			private int getSquare(){
				return num*num;

			}
		}
		LocalClass localObj = new LocalClass();
		System.out.println("The num is: "+localObj.num);
		System.out.println("The square num is: "+localObj.getSquare());
	}
}

public class Task16c{
	public static void main(String args[]){
		OuterClass outerObj  = new OuterClass();
		outerObj.display();
	}
}