package homeWork15MultiThreading.HomeWork.task_1;

public class Main {
    public static void main(String[] args) {
        Thread message1 = new Thread(new Treads("1 massege",null));
        Thread message2 = new Thread(new Treads("2 massege",message1));
        Thread message3 = new Thread(new Treads("3 massege",message2));
        message1.start();
        message2.start();
        message3.start();
    }
}
