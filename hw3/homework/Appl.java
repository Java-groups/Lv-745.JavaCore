package homework;

import practical.Days;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Float.parseFloat;
import static java.lang.Integer.parseInt;

public class Appl {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("--------FIRST TASK----------");
        float [] enteredFloats = new float[3];
        int inRange = 0, rangeMin = -5, rangeMax = 5;
        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter float number "+i+":");
            enteredFloats[i-1] = parseFloat(br.readLine());
            if (enteredFloats[i-1]>=rangeMin && enteredFloats[i-1]<=rangeMax) {
                inRange++;
            }
        }
        System.out.println("Numbers in range: " + inRange);
        System.out.println("\n\n");

        System.out.println("--------SECOND TASK----------");
        int maxNumber = Integer.MIN_VALUE, minNumber = Integer.MAX_VALUE;
        int [] enteredInts = new int[3];
        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter integer number "+i+":");
            enteredInts[i-1] = parseInt(br.readLine());
            if (enteredInts[i-1]<minNumber) {
                minNumber = enteredInts[i-1];
            }
            if (enteredInts[i-1]>maxNumber) {
                maxNumber = enteredInts[i-1];
            }
        }
        System.out.println("Min Number is: " + minNumber);
        System.out.println("Max Number is: " + maxNumber);
        System.out.println("\n\n");

        System.out.println("--------THIRD TASK----------");
        System.out.print("Enter the number of HTTP Error:");
        int httpError = parseInt(br.readLine());
        switch (httpError){
            case 400 : System.out.println(HTTPError.BAD_REQUEST.getDisplayName()); break;
            case 401 : System.out.println(HTTPError.UNAUTHORIZED.getDisplayName()); break;
            case 402 : System.out.println(HTTPError.PAYMENT_REQUIRED.getDisplayName()); break;
            case 403 : System.out.println(HTTPError.FORBIDDEN.getDisplayName()); break;
            case 404 : System.out.println(HTTPError.NOT_FOUND.getDisplayName()); break;
            case 405 : System.out.println(HTTPError.METHOD_NOT_ALLOWED.getDisplayName()); break;
            case 406 : System.out.println(HTTPError.NOT_ACCEPTABLE.getDisplayName()); break;
            case 407 : System.out.println(HTTPError.PROXY_AUTHENTICATION_REQUIRED.getDisplayName()); break;
            case 408 : System.out.println(HTTPError.REQUEST_TIMEOUT.getDisplayName()); break;
            case 409 : System.out.println(HTTPError.CONFLICT.getDisplayName()); break;
            case 410 : System.out.println(HTTPError.GONE.getDisplayName()); break;
            default: System.out.println("Wrong input!");
        }

        System.out.println("\n\n");
        System.out.println("--------FOURTH TASK----------");
        Dog kuzya = new Dog("Kuzya",7,Breed.ZWERGPINSCHER);
        Dog luk = new Dog("Luk",12,Breed.DACHSHUND);
        Dog snoopy = new Dog("Kuzya",4,Breed.POODLE);

        if (kuzya.getName()==luk.getName()||kuzya.getName()==snoopy.getName()||luk.getName()==snoopy.getName()){
            System.out.println("There are two dogs with the same name!");
        } else System.out.println("There arent two dogs with the same name.");
        if (kuzya.getAge()>luk.getAge()&&kuzya.getAge()>snoopy.getAge()){
            System.out.println("Oldest dog: "+kuzya.print());
        } else if (luk.getAge() > kuzya.getAge() && luk.getAge() > snoopy.getAge()){
            System.out.println("Oldest dog: "+luk.print());
        } else {
            System.out.println("Oldest dog: "+snoopy.print());
        }

    }
}
