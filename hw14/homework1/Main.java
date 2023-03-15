package homework1;

public class Main {

    public static void main(String[] args) {
        System.out.println(
                """
                Homework TASK 1
                Run three threads and output there different messages for 5 times.
                The third thread supposed to start after finishing working of the two previous threads.
                """);

        Thread thread1 = new Message("Thread 1");
        Thread thread2 = new Message("Thread 2");
        Thread thread3 = new Message("Thread 3");

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread3.start();
        try {
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}




