class ThreadOne extends Thread {
	public void run(){
		System.out.println("Thread is executed");
	}

	public static void main(String[] args){
		ThreadOne t1 = new ThreadOne();
		t1.start();
	}
}

class runThread implements Runnable{
	public void run(){
		System.out.println("tHread is executed");

	}

	public static void main(String[] args){
		runThread t2 = new runThread();
		Thread t1 = new Thread(t2);
		t1.start();
	}
}


class ThreadOne extends Thread {
	public void run(){
		for(int i=0; i <=10; i++){
			System.out.println(i);
			try{
				Thread.sleep(500);
			} catch(InterruptedException e){

			}
		}
	}

	public static void main(String[] args){
		ThreadOne t4 = new ThreadOne();
		t4.start();
	}
}
