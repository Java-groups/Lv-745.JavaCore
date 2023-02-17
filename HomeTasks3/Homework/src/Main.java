import Dog.Dog;
import Dog.Breed;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*Do not write all code in main method, separate each tasks, write each task in unique method, and there call that methods*/

        // read 3 float numbers and check: are they all belong to the range [-5, 5];

        System.out.println("---Task_1---");
        Scanner sc = new Scanner(System.in);
        int count = 0;
        Float[] enteredFloat = new Float[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter [ " +(i+1) + " ] float number");
            enteredFloat[i] = sc.nextFloat();
            if (enteredFloat[i] >= -5 && enteredFloat[i] <= 5) {
                count++;
            }
        }
        System.out.println("There are [ " + count + " ] float number that belongs range [-5;5]");

        // read 3 integer numbers and write max and min of them;

        System.out.println("---Task_2---");
        Scanner sc1 = new Scanner(System.in);
        Integer[] enteredInteger = new Integer[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter [ " +(i+1) + " ] integer number");
            enteredInteger[i] = sc1.nextInt();
        }
        int max = enteredInteger[0];
        int min = enteredInteger[0];
        for (int i = 0; i < 3; i++) {
            if (enteredInteger[i] > max) {
                max = enteredInteger[i];
            }
            if (enteredInteger[i] < min) {
                min = enteredInteger[i];
            }
        }
        System.out.println("max = [" +max + "]");
        System.out.println("min = [" +min + "]");


        // read number of HTTP Error (400, 401,402, ...) and write the name of this error

        System.out.println("---Task_3---");
        Scanner sc2 = new Scanner(System.in);
        System.out.print("Enter the number of HTTP error: ");
        int errorNumber = sc2.nextInt();
        switch (errorNumber) {
            case 400 -> System.out.println(HTTPError.BadRequest.getErrorMessage());
            case 401 -> System.out.println(HTTPError.Unauthorized.getErrorMessage());
            case 402 -> System.out.println(HTTPError.PaymentRequired.getErrorMessage());
            case 403 -> System.out.println(HTTPError.Forbidden.getErrorMessage());
            case 404 -> System.out.println(HTTPError.NotFound.getErrorMessage());
            case 405 -> System.out.println(HTTPError.MethodNotAllowed.getErrorMessage());
            case 406 -> System.out.println(HTTPError.NotAcceptable.getErrorMessage());
            case 407 -> System.out.println(HTTPError.ProxyAuthenticationRequired.getErrorMessage());
            case 408 -> System.out.println(HTTPError.RequestTimeout.getErrorMessage());
            case 409 -> System.out.println(HTTPError.Conflict.getErrorMessage());
            case 410 -> System.out.println(HTTPError.Gone.getErrorMessage());
            case 411 -> System.out.println(HTTPError.LengthRequired.getErrorMessage());
            case 412 -> System.out.println(HTTPError.PreconditionFailed.getErrorMessage());
            case 413 -> System.out.println(HTTPError.RequestEntityTooLarge.getErrorMessage());
            case 414 -> System.out.println(HTTPError.RequestURITooLong.getErrorMessage());
            case 415 -> System.out.println(HTTPError.UnsupportedMediaType.getErrorMessage());
            case 416 -> System.out.println(HTTPError.RequestedRangeNotSatisfiable.getErrorMessage());
            case 417 -> System.out.println(HTTPError.ExpectationFailed.getErrorMessage());
            default -> System.out.println("Wrong number! enter the number between [400-417]");
        }

        // Created 3 instances of type Dog

        Dog dog1 = new Dog("Oskar", 5, Breed.Rottweiler);
        Dog dog2 = new Dog("Jonny", 3, Breed.Bulldog);
        Dog dog3 = new Dog("Jonny", 2, Breed.Pug);

        // Checked if there is no two dogs with the same name

        if (Objects.equals(dog1.getName(), dog2.getName()) || Objects.equals(dog1.getName(), dog3.getName()) || Objects.equals(dog2.getName(), dog3.getName())) {
            System.out.println("There is two dogs with the same name");
        } else {
            System.out.println("There is [ NO ] two dogs with the same name");
        }

        // Displayed the name and the kind of the oldest dog

        if (dog1.getAge() >= dog2.getAge() && dog1.getAge() >= dog3.getAge()) {
            System.out.println(dog1.printOldestDog());
        } else if (dog2.getAge() >= dog1.getAge() && dog2.getAge() >= dog3.getAge()) {
            System.out.println(dog2.printOldestDog());
        } else {
            System.out.println(dog3.printOldestDog());
        }


    }
}
