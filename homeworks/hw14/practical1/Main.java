package practical1;

public class Main extends Thread{
    public static void main(String[] args) {

        System.out.println(
                """
                PRACTICAL TASK 1
                Output text «I study Java» 10 times with the intervals of one second (Thread.sleep(1000);).
                """);

        Thread thread = new Main();

        thread.start();

        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void run(){
         for (int i = 0; i < 10; i++) {

             try {
                 System.out.println("I study Java");
                 Thread.sleep(1000);
             } catch (InterruptedException e) {
                 throw new RuntimeException(e);
             }

         }
    }
}

