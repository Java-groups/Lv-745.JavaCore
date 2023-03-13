package practical_task;

public class Main {
    public static void main(String[] args) {
        run();
    }

    private static void run() {
        try {
            sleepTest();
        } catch (InterruptedException e) {
            System.out.println("Exception from sleepTest: " + e.getMessage());

        }

        try {
            outputMessage();
        } catch (InterruptedException e) {
            System.out.println("Exception from outputMessage: " + e.getMessage());
        }
    }

    private static void sleepTest() throws InterruptedException {
        Runnable r = new Run();
        Thread t = new Thread(r);
        t.start();
        t.join(); // used to give this Thread a control bcz it's working with outputMessage on the same time
    }

    private static void outputMessage() throws InterruptedException {
        Runnable r1 = new Run1();
        Thread t1 = new Thread(r1);
        Runnable r2 = new Run2();
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();
        // They're working on the same time
        t1.join();
        t2.join();
        // printing the message after working t1 and t2
        System.out.println("My name is Nazar");
    }

    public static class Run implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println("I study Java");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public static class Run1 implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println("«Hello, world");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }

    public static class Run2 implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println("Peace in the peace");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}




