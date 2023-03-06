public class Main {
    private static Thread t3;
    public static void main(String[] args) {
        System.out.println("---------FIRST TASK----------------");
        taskOne();
        try {
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("---------THIRD TASK----------------");
        taskThree();
        System.out.println("---------SECOND TASK (DEAD LOCK)----------------");
        taskTwo();
    }

    private static void taskOne(){
        Thread t1 = new Thread(new MessagePrinter("Thread 1"));
        Runnable r = new MessagePrinter("Thread 2");
        Thread t2 = new Thread(r);
        t3 = new Thread(new MessagePrinter("Thread 3"));
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t3.start();
    }

    private static void taskTwo(){
        Object lock1 = new Object();
        Object lock2 = new Object();

        Thread firstThread = new Thread(() -> {
            synchronized (lock1) {
                System.out.println("Thread 1 has acquired lock1");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock2) {
                    System.out.println("Thread 1 has acquired lock2");
                }
            }
        });

        Thread secondThread = new Thread(() -> {
            synchronized (lock2) {
                System.out.println("Thread 2 has acquired lock2");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock1) {
                    System.out.println("Thread 2 has acquired lock1");
                }
            }
        });

        firstThread.start();
        secondThread.start();

        try {
            firstThread.join();
            secondThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    private static void taskThree(){
        Thread one = new Thread(() -> {
            Thread two = new Thread(() -> {
                for (int i = 0; i < 3; i++) {
                    System.out.println("Thread number two");
                }
            });

            Thread three = new Thread(() -> {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Thread number three");
                }
            });

            two.start();
            three.start();

            try {
                two.join();
                three.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        one.start();
        try {
            one.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    }

