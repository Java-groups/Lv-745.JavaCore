package homeWork15MultiThreading.HomeWork.task_1;

public class Treads implements Runnable {
    private String messages;
    private Thread previousThread;

    public Treads(String messages, Thread previousThread) {
        this.messages = messages;
        this.previousThread = previousThread;
    }

    @Override
    public void run() {
        try {
        if (previousThread != null) {
            previousThread.join();
        }
            for (int i = 0; i < 5; i++) {
                System.out.println(messages);
            }
                Thread.sleep(1000);
            } catch(InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }

