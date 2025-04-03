// Threads , how threads works 

class ThreadImp extends Thread{ 
    @Override 
    public void run(){ 
        String str = "Thread class implementation Thread is running Successfully"; 
        System.out.println(str); 
    } 
} 

class RunnableImp implements Runnable{ 
    @Override 
    public void run(){ 
        String str = "Runnable Interface implementation Thread is running Successfully"; 
        System.out.println(str); 
    } 
} 

public class Task18 { 
    public static void main(String[] args) { 
        // Method-1 : Using Thread Class 
        ThreadImp t1 = new ThreadImp(); 
        t1.start(); 

        // Method-2 : Using Runnable Interface 
        RunnableImp r1 = new RunnableImp(); 
        Thread t2 = new Thread(r1); 
        t2.start(); 
    } 
}