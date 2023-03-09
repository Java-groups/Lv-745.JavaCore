package homeWork15MultiThreading.practicalTask;

public class MyThread extends Thread  {
        private String java;
// ========= task 1 ========
        public MyThread() {
            this.java = java;
        }
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                }
                System.out.println(" i learn java");
            }
        }
        //======= task 2 =======

    }


