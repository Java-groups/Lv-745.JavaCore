package Count;

import java.util.Arrays;

public class Count {
    public static void main(String[] args) {
        int CountNumbers[] = {7,23,74,45,3};

        System.out.println(Arrays.stream(CountNumbers).min());
        System.out.println(CountNumbers[4]);

    }
}
