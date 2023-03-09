package homeWork15MultiThreading.HomeWork.task_2;

public class DeadLock {
    final static Object first = new Object();
    final static Object second = new Object();

    static Thread x1 = new Thread() {
        public void run() {
            synchronized (first) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 1 acquired first lock");
                synchronized (second) {
                    System.out.println("Thread 1 acquired second lock");
                }
            }
        }
    };
    static Thread x2 = new Thread() {
        public void run() {
            synchronized (second) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 2 acquired first lock");
                synchronized (first) {
                    System.out.println("Thread 2 acquired second lock");
                }
            }
        }

    };


    public static void main(String[] args) throws InterruptedException {
        x1.start();
        x2.start();

        x1.join();
        x2.join();

        System.out.println("End of main thread");
    }
}