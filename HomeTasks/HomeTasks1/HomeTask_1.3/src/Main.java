import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Call country1 = new Call();
        Call country2 = new Call();
        Call country3 = new Call();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the minutes of talking from " +country1.getCountry1());
        country1.setTime(Integer.parseInt(sc.nextLine()));
        System.out.println("Enter the minutes of talking from " +country2.getCountry2());
        country2.setTime(Integer.parseInt(sc.nextLine()));
        System.out.println("Enter the minutes of talking from " +country3.getCountry3());
        country3.setTime(Integer.parseInt(sc.nextLine()));

        System.out.println("The price for call from " + country1.getCountry1() + " = " + country1.getCount());
        System.out.println("The price for call from " + country2.getCountry2() + " = " + country2.getCount());
        System.out.println("The price for call from " + country3.getCountry3() + " = " + country3.getCount());
        System.out.println("The sum of calls = " +(country1.getCount() + country2.getCount() + country3.getCount()));
    }
}
