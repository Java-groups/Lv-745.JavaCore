package hw3;

public class Main {
    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            System.out.println("Thread one started");

            Thread t2 = new Thread(() -> {
                for (int i = 0; i < 3; i++) {
                    System.out.println("Thread number two");
                }

                Thread t3 = new Thread(() -> {
                    for (int i = 0; i < 5; i++) {
                        System.out.println("Thread number three");
                    }
                });

                t3.start();
            });

            t2.start();
        });

        t1.start();

    }
}
