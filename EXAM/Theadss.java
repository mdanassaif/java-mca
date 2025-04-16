
class ThreadMe extends Thread{
	@Override
	public void run(){
		String str= "Thread class implementation Thread" + "is running sucessfully";
		System.out.println(str);
	}
}

class RunnableMe implements Runnable{
	@Override
	public void run(){
		String str= "Thread Interface implementation Thread" + "is running sucessfully";
		System.out.println(str);
	}
}



public class Theadss{
	public static void main(String[] args){

		// Method-1 : Using Thread Class
		ThreadMe obj1 = new ThreadMe();
		obj1.start();

		RunnableMe r1 = new RunnableMe();
		Thread obj2 = new Thread(r1);
		obj2.start();


	}
}