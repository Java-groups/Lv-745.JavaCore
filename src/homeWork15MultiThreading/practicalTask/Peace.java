package homeWork15MultiThreading.practicalTask;

public class Peace implements Runnable {
   private String thread;

    public Peace() {
        this.thread = thread;
    }


    @Override
    public void run() {
        // ===== interval 2 seconds
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello world");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);

            }
        }

        // === interval 3 seconds
        for (int i = 0; i < 5; i++) {
            System.out.println("Peace in the peace");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);

            }
        }
        //==== print My name is
        System.out.println("My name is ...");


    }
}
