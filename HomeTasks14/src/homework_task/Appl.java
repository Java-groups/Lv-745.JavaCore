package homework_task;

public class Appl {
    public static void main(String[] args) {
        run();
    }

    private static void run() {
        try {
            runThreads();
        } catch (InterruptedException e) {
            System.out.println("runThread() method - " + e.getMessage());
        }

        causeDeadlock();


        establishedThreads();

    }

    private static void runThreads() throws InterruptedException {
        Thread t1 = new MyThread(1, "^_^");
        Thread t2 = new MyThread(2, "-_-");
        Thread t3 = new MyThread(3, ":))");
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        t3.start();
    }

    public static class MyThread extends Thread {
        private final int number;
        private final String message;

        public MyThread(int number, String message) {
            this.number = number;
            this.message = message;
        }

        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread - " + number + " ; Message: " + message);
            }
        }
    }

    private static void causeDeadlock() {
        Object lock1 = new Object();
        Object lock2 = new Object();

        Thread t1 = new Thread(() -> {
            synchronized (lock1) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (lock2) {
                    System.out.println("[Thread 1] lock 2 - locked");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (lock2) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (lock1) {
                    System.out.println("[Thread 2] lock 1 - locked");
                }
            }
        });

        t1.start();
        t2.start();

        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(t1.getState());
        System.out.println(t2.getState());
    }


    private static void establishedThreads() {
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                System.out.println("Thread number two");
            }
        });

        Thread t1 = new Thread(() -> {
            System.out.println("Thread 1 - started");
            t2.start();
        });

        Thread t3 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread number three");
            }
        });

        t1.start();
        t3.start();
    }
}
