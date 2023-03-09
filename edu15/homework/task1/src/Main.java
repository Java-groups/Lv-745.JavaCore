public class Main {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread("Message 1");
        MyThread thread2 = new MyThread("Message 2");

        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        MyThread thread3 = new MyThread("Message 3");
        Thread t3 = new Thread(thread3);
        t3.start();
    }
}
