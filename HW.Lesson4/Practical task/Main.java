import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("********Task N1********");
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = 0;

        if (reader.nextInt() % 2 == 0) {
            num++;
        }
        if (reader.nextInt() % 2 == 0) {
            num++;
        }
        if (reader.nextInt() % 2 == 0) {
            num++;
        }
        System.out.println("There are " + num + " odd numbers.");

        System.out.println("********Task N2********");
        System.out.println("Enter the number of day, please:");
        String input = br.readLine();
        String result;
        switch (input) {
            case "1":
                result = "Monday. Понеділок";
                break;
            case "2":
                result = "Tuesday. Вівторок";
                break;
            case "3":
                result = "Wednesday. Середа";
                break;
            case "4":
                result = "Thursday. Четвер";
                break;
            case "5":
                result = "Friday. П'ятниця";
                break;
            case "6":
                result = "Saturday. Субота";
                break;
            case "7":
                result = "Sunday. Неділя";
                break;
            default:
                result = "Wrong number! Некоректний номер!";
        }
        System.out.println(result);

        System.out.println("********Task N3********");
        enum continents {
            ASIA, AFRICA, EUROPE, NORTH_AMERICA, SOUTH_AMERICA
        }
        String country;
        System.out.println("Choose from next countries: Ukraine, Spain, Poland, Italy, Saudi Arabia, China, India, Egypt, Nigeria, Sudan, Canada, USA, Cuba, Colombia, Peru, Ecuador");
        System.out.print("Enter country: ");
        country = br.readLine();
        switch (country) {
            case "Ukraine": case "Spain": case "Poland": case "Italy":
                System.out.println(continents.EUROPE); break;
            case "Saudi Arabia": case "China": case "India":
                System.out.println(continents.ASIA);break;
            case "Egypt": case "Nigeria": case "Sudan":
                System.out.println(continents.AFRICA);break;
            case "Canada": case "USA": case "Cuba":
                System.out.println(continents.NORTH_AMERICA);break;
            case "Colombia": case "Peru": case "Ecuador":
                System.out.println(continents.SOUTH_AMERICA);break;
            default:
                System.out.println("Incorrect country name or country currently not listed");
        }
        System.out.println("********Task N4********");
        Product product1 = new Product("Bread", 2.5, 10);
        Product product2 = new Product("Milk", 1.4, 15);
        Product product3 = new Product("Tea", 3,21 );
        Product product4 = new Product("Chocolate", 4.3,12 );

        if(product1.getPrice() >= product2.getPrice() && product1.getPrice() >= product3.getPrice() && product1.getPrice() >= product4.getPrice()){
            System.out.println("The most expensive item is " + product1.getName() + ". The quantity of the most expensive item - " +  product1.getQuantity());
        }
        if(product2.getPrice() >= product1.getPrice() && product2.getPrice() >= product3.getPrice() && product2.getPrice() >= product4.getPrice()){
            System.out.println("The most expensive item is " + product2.getName() + ". The quantity of the most expensive item - " +  product2.getQuantity());
        }
        if(product3.getPrice() >= product1.getPrice() && product3.getPrice() >= product2.getPrice() && product3.getPrice() >= product4.getPrice()){
            System.out.println("The most expensive item is " + product3.getName() + ". The quantity of the most expensive item - " +  product3.getQuantity());
        }
        if(product4.getPrice() >= product1.getPrice() && product4.getPrice() >= product2.getPrice() && product4.getPrice() >= product4.getPrice()){
            System.out.println("The most expensive item is " + product4.getName() + ". The quantity of the most expensive item - " +  product4.getQuantity());
        }

        if(product1.getQuantity() >= product2.getQuantity() && product1.getQuantity() >= product3.getQuantity() && product1.getQuantity() >= product4.getQuantity()){
            System.out.println("The name of the items, which has the biggest quantity is " + product1.getName());
        }
        if(product2.getQuantity() >= product1.getQuantity() && product2.getQuantity() >= product3.getQuantity() && product2.getQuantity() >= product4.getQuantity()){
            System.out.println("The name of the items, which has the biggest quantity is " + product2.getName());
        }
        if(product3.getQuantity() >= product1.getQuantity() && product3.getQuantity() >= product2.getQuantity() && product3.getQuantity() >= product4.getQuantity()){
            System.out.println("The name of the items, which has the biggest quantity is " + product3.getName());
        }
        if(product4.getQuantity() >= product1.getQuantity() && product4.getQuantity() >= product2.getQuantity() && product4.getQuantity() >= product3.getQuantity()){
            System.out.println("The name of the items, which has the biggest quantity is " + product4.getName());
        }
    }
}