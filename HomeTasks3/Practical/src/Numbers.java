public class Numbers {
    private static int count = 0;

    public void setNumber(int number) {
        if (number % 2 == 1) {
            count++;
        }
    }

    public static int getCount() {
        return count;
    }
}
