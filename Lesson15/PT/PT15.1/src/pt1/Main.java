package pt1;

public class Main extends Thread{
    public static void main(String[] args) {

        Thread t = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("I study Java");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t.start();
    }
}
