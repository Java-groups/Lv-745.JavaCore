package homeWork15MultiThreading.HomeWork.Task3;

public class Threads  {
    public static void main(String[] args) {

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
            }  catch (InterruptedException e) {
                e.printStackTrace();
            }
            });
        one.start();


        }

    }




