package homeWork15MultiThreading.practicalTask;

public class Appl {


        public static void main(String[]args) throws Exception {
            // ====== task 1 =======
            System.out.println("task 1");
            Thread t1 = new MyThread();
            t1.start();
            t1.join();
            System.out.println("Thread main");
            // ======= task 2 =====
            System.out.println("task 2");
            Runnable run = new Peace();
            Thread t2 = new Thread(run);

            t2.start();



        }
    }

