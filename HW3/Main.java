package HW3;

public class Main {
    //#1
    public static void main(String[] args) {
        float num1 = 7.51f;
        float num2 = -2.15f;
        float num3 = 1.51f;

        String answerNum1 = (-5 > num1 | num1 < 5) ? " belong to the range " : "does not belong to the range";
        String answerNum2 = (-5 > num2 | num2 < 5) ? " belong to the range " : "does not belong to the range";
        String answerNum3 = (-5 > num3 | num3 < 5) ? " belong to the range " : "does not belong to the range";
        System.out.println(answerNum1);
        System.out.println(answerNum2);
        System.out.println(answerNum3);

        int number1 = 15;
        int number2 = 215;
        int number3 = 34;
        int max;

        max = number1 > number2 ? number1 : number2;
        max = (max > number3) ? max : number3;
        System.out.println("Max number: " + max);


        System.out.println("Your error: " + HTTPError.error400.getError());

       Dog dog1 = new Dog("Lisa",Breed.breed1.getBreedDogs(), 2) ;
        Dog dog2 = new Dog("Luna",Breed.breed2.getBreedDogs(), 10) ;
        Dog dog3 = new Dog("Kelvin",Breed.breed3.getBreedDogs(), 7) ;

        System.out.println(dog1.equals(dog2));

        int oldDog;

        oldDog = dog1.getAge() > dog2.getAge() ? dog1.getAge() : dog2.getAge();
        oldDog = Math.max(oldDog, dog3.getAge());
        System.out.println("Max age: " + oldDog);

    }
}
    enum HTTPError{
            error400 ("HTTP 400 Bad Request"), error401("P 401 Unauthorized"),error402 ("402 Payment Required");
            private String error;

        HTTPError(String error) {
            this.error = error;
        }

        public String getError() {
            return error;
        }
    }


        










