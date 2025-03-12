import java.io.*;
import java.util.*;

class Sender {
    public void send(String msg) {
        System.out.println("Sending\t" + msg);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }
        System.out.println("\n" + msg + " Sent");
    }
}

class ThreadedSend extends Thread {
    private String msg;
    private Thread t;
    Sender sender;

    ThreadedSend(String m, Sender obj) {
        msg = m;
        sender = obj;
    }

    public void run() {
        synchronized (sender) {
            sender.send(msg);
        }
    }
}

class SyncDemo {
    public static void main(String args[]) {
        Sender snd = new Sender();
        ThreadedSend S1 = new ThreadedSend(" Hi Hamid,", snd);
        ThreadedSend S2 = new ThreadedSend(" How are you ? ", snd);

        S1.start();
        S2.start();

        try {
            S1.join();
            S2.join();
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }

   
        String answer = "Hello! I'm doing well, thank you!";
        System.out.println("\nReceived Answer: " + answer);
    }
}