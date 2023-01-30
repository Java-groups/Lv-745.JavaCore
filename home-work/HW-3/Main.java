import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void floats(float f1, float f2, float f3) {
        float[] fArray = {f1, f2, f3};
        byte inRange = 0;
        byte outRange = 0;

        for(float i : fArray) {
            if(i <= -5 || i >= 5) {
                inRange++;
            }else {
                outRange++;
            }
        }

        System.out.println(fArray[0]);
        System.out.println("In the range - " + inRange + "\n" + "Out of the range - " + outRange);


    }

    public static void ints(int i1, int i2, int i3) {

        int[] iArray = {i1, i2, i3};

        int max = -1;

        for (Integer number : iArray) {
            if (number > max) {
                max = number;
            }
        }

        int min = Integer.MAX_VALUE;

        for (Integer number : iArray) {
            if (number < min) {
                min = number;
            }
        }

        System.out.println("Max Value: " + max + "\n" + "Min Value" + min);

    }

    public static void Errors(int code) {

        String answer = switch(code){
            case 400 -> HTTPError.BAD_REQUEST.getDescription();
            case 401 -> HTTPError.UNAUTHORIZED.getDescription();
            case 402 -> HTTPError.PAYMENT_REQUIRED.getDescription();
            case 403 -> HTTPError.FORBIDDEN.getDescription();
            case 404 -> HTTPError.NOT_FOUND.getDescription();
            case 405 -> HTTPError.METHOD_NOT_ALLOWED.getDescription();
            case 406 -> HTTPError.NOT_ACCEPTABLE.getDescription();
            case 407 -> HTTPError.PROXY_AUTHENTICATION_REQUIRED.getDescription();
            case 408 -> HTTPError.REQUEST_TIMEOUT.getDescription();
            case 409 -> HTTPError.CONFLICT.getDescription();
            case 410 -> HTTPError.GONE.getDescription();
            default -> "Wrong";
        };
        System.out.println(answer);
    }

    public static void main(String[] args) {
        floats(3.4423342f, 3.34533f, 8.2342222f);
        ints(3,7,1);
        Errors(402);
        Dog fluffy = new Dog("Flaffy", "Shepard", 3);
        Dog sparky = new Dog("Sparky", "French", 5);
        Dog lucky = new Dog("Lucky", "ChIhUaHuA", 2);

        ArrayList<String> names = new ArrayList<String>();

        names.add(fluffy.getName());
        names.add(sparky.getName());
        names.add(lucky.getName());

        if(names.get(0).equals(names.get(1)) || names.get(2).equals(names.get(0)) || names.get(1).equals(names.get(2))) {
            System.out.println("There are names matched");
        }

        if(fluffy.getAge() > sparky.getAge()) {
            System.out.println(fluffy.output() + " Are Older");
        } else if (fluffy.getAge() <= sparky.getAge()) {
            System.out.println(sparky.output() + " Are Older");
        } else if (lucky.getAge() >= sparky.getAge()) {
            System.out.println(lucky.output() + " Are Older");
        } else if (lucky.getAge() < sparky.getAge()) {
            System.out.println(sparky.output() + " Are Older");
        } else System.out.println(fluffy.output() + " Are Older");
        System.out.println(fluffy.getBreed());
    }

}
