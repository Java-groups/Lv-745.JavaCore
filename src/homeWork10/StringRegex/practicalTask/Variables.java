package homeWork10.StringRegex.practicalTask;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Variables {
    public static void main(String[] args) {
// ======== Task 1
        String IT = "String";
        String ItAcedemy = new String ("String");
        System.out.println(IT.equals(ItAcedemy));


        String str1 = "IT";
        String str2 = "IT Academy";
        System.out.println(str2.contains(str1));
 // ======= Task 2



            System.out.println(" Task 2");
            System.out.println("Please enter your surname , name , and patronymic.");
            Scanner scanner = new Scanner(System.in);

            String str = scanner.nextLine();
            String[] strings = str.split(" ");
            String surname = strings[0];
            String name = strings[1];
            String patronymic = strings[2];

//            System.out.println(" Surname and initials" + " " + surname + " " + name + " " + patronymic);
//            System.out.println(" Name" + " " + name);
//            System.out.println(" Name Patronymic and Surname" + " " + " " + name + " " + patronymic + " " + surname);

        System.out.printf("Surname and initials %s %s %s",surname,name,patronymic);
        System.out.printf("%nName %1$s",name,surname,patronymic);
        System.out.printf("%nName Patronymic and Surname %2$s %3$s %1$s",surname,name,patronymic);
        System.out.println("");




    //=========== Task 3

        System.out.println("========= Task 3");

        try {
            String expression = "[a-zA-Z0-9_]{3,15}$";
            String[] userNames = {"RomanSvych1488", "Bodya_Bodya", "Stepanbaklazhan", "PavloMysnyk", "Yaroslav_Pirat"};

//            String expression = "[a-zA-Z0-9_]{3,15}$";
            scanner.next(expression);
            Pattern pattern = Pattern.compile(expression);
            for (String userName : userNames) {
                boolean isValid = pattern.matcher(userName).matches();
                String result = isValid ? "valid" : "invalid";
                System.out.printf("User name %s%n", userName, "Email");
            }
        }
        catch (Exception e){
            System.out.println("not valid email");;
        }

    }
}
