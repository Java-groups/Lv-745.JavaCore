import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("********Task N1********");
        System.out.println("Enter float number1: ");
        double input1 = Double.parseDouble(br.readLine());
        System.out.println("Enter float number2: ");
        double input2 = Double.parseDouble(br.readLine());
        System.out.println("Enter float number3: ");
        double input3 = Double.parseDouble(br.readLine());
        System.out.println("-5>number1>+5: " + (5>input1&&input1>-5));
        System.out.println("-5>number2>+5: " + (5>input2&&input2>-5));
        System.out.println("-5>number3>+5: " + (5>input3&&input3>-5));

        System.out.println("********Task N2********");
        System.out.println("Enter Integer number1: ");
        Integer inputInteger1 = Integer.valueOf(br.readLine());
        System.out.println("Enter Integer number2: ");
        Integer inputInteger2 = Integer.valueOf(br.readLine());
        System.out.println("Enter Integer number3: ");
        Integer inputInteger3 = Integer.valueOf(br.readLine());
        if (inputInteger1>inputInteger2&& inputInteger1>inputInteger3) {
            System.out.println("The max integer is: " + inputInteger1);
        } else if (inputInteger2>inputInteger1&& inputInteger2>inputInteger3) {
            System.out.println("The max integer is: " + inputInteger2);
        }else if (inputInteger3>inputInteger1&& inputInteger3>inputInteger3) {
            System.out.println("The max integer is: " + inputInteger3);
        }
        if (inputInteger1<inputInteger2 && inputInteger1<inputInteger3) {
            System.out.println("The min integer is: " + inputInteger1);
        } else if (inputInteger2<inputInteger1 && inputInteger2<inputInteger3) {
            System.out.println("The min integer is: " + inputInteger2);
        }else if (inputInteger3<inputInteger1 && inputInteger3<inputInteger2) {
            System.out.println("The min integer is: " + inputInteger3);
        }

        System.out.println("********Task N3********");
        System.out.println("Enter the number of Error (Example: N401)");
        int httpError = parseInt(br.readLine());
        switch (httpError){
            case 400 : System.out.println(HTTPError.BAD_REQUEST.getNameOfError()); break;
            case 401 : System.out.println(HTTPError.UNAUTHORIZED.getNameOfError()); break;
            case 402 : System.out.println(HTTPError.PAYMENT_REQUIRED.getNameOfError()); break;
            case 403 : System.out.println(HTTPError.FORBIDDEN.getNameOfError()); break;
            case 404 : System.out.println(HTTPError.NOT_FOUND.getNameOfError()); break;
            case 405 : System.out.println(HTTPError.METHOD_NOT_ALLOWED.getNameOfError()); break;
                        default: System.out.println("Wrong enter!");
        }

        System.out.println("********Task N4********");
        Dog dog1 = new Dog("Oskar", Dog.breed.POODLES, 3);
        Dog dog2 = new Dog("Flower", Dog.breed.BOXER, 1);
        Dog dog3 = new Dog("Tim", Dog.breed.SPANIEL, 2);


        if (dog1.getName().equals(dog2.getName()) || dog2.getName().equals(dog3.getName()) || dog1.getName().equals(dog3.getName())) {
            System.out.println("There are two dogs with the same name.");
        } else System.out.println("There aren not two dogs with the same name.");
        if (dog1.getAge() > dog2.getAge() && dog1.getAge() > dog3.getAge()) {
            System.out.println("Oldest dog is " + dog1.getName());
        }
        if (dog2.getAge() > dog1.getAge() && dog2.getAge() > dog3.getAge()) {
            System.out.println("Oldest dog is " + dog2.getName());
        }
        if (dog3.getAge() > dog1.getAge() && dog3.getAge() > dog2.getAge()) {
            System.out.println("Oldest dog is " + dog3.getName());
        }
    }
}