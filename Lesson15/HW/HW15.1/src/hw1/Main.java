package hw1;

public class Main extends Thread {
    public static void main(String[] args) {

        Thread t1 = new Thread(new PrintMessage("Thread 1"));
        Thread t2 = new Thread(new PrintMessage("Thread 2"));

        t1.start();
        t2.start();

        Thread t3 = new Thread(new PrintMessage("Thread 3"));
        t3.start();

    }
}

class PrintMessage implements Runnable {

    private String message;

    public PrintMessage(String message) {
        this.message = message;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(message + " - Message " + i);
        }
    }
}
