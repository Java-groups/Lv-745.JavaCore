public class Main {
    public static void main(String[] args) {
        run();
    }
    public static void run() {
        String input = "I am learning   Java Core";
        String output = input.replaceAll("\\s+", " ");
        System.out.println(output);
    }
}