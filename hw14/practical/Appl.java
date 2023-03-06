public class Appl extends Thread {
    private static Thread t1,t2,t3;
    public static void main(String[] args) {
        System.out.println("---------FIRST TASK----------------");
        taskOne();
        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("---------SECOND TASK----------------");
        taskTwo();
        try {
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("My name is Oleksandr");
    }

    private static void taskOne(){
        t1 = new Appl();
        t1.start();
    }

    private static void taskTwo(){
        t2 = new Thread(()->{
            for (int i = 0; i < 5; i++) {
                try {
                    System.out.println("Hello, world");
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        t3 = new Thread(()->{
            for (int i = 0; i < 5; i++) {
                try {
                    System.out.println("Peace in the peace");
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        t2.start();
        t3.start();

    }

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
