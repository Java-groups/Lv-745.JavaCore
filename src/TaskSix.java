import java.util.Scanner;

public class TaskSix {

    public void execute() {
        int count = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any text: ");
        String text = input.nextLine().strip();
        for (int i = 0; i < text.length() - 1; i++) {
            if (text.charAt(i) == ' ' && Character.isLetter(text.charAt(i + 1)) && (i > 0)) {
                count++;
            }
        }
        count++;
        System.out.println("Total number of words in the given string: " + count);
    }
}