package practical;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        int enteredNumber, even = 0, odd = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("--------FIRST TASK----------");
        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter integer number "+i+":");
            enteredNumber = Integer.parseInt(br.readLine());
            if (enteredNumber%2 == 0) {
                even++;
            } else{
                odd++;
            }
        }
        System.out.println("Even numbers: " + even + ". Odd numbers: " + odd +"\n\n");

        System.out.println("--------SECOND TASK----------");
        System.out.print("Enter weekday's number: ");
        enteredNumber = Integer.parseInt(br.readLine());
        switch (enteredNumber){
            case 1 : System.out.println(Days.Monday.getUa()+", "+Days.Monday.getEn()); break;
            case 2 : System.out.println(Days.Tuesday.getUa()+", "+Days.Tuesday.getEn()); break;
            case 3 : System.out.println(Days.Wednesday.getUa()+", "+Days.Wednesday.getEn()); break;
            case 4 : System.out.println(Days.Thursday.getUa()+", "+Days.Thursday.getEn()); break;
            case 5 : System.out.println(Days.Friday.getUa()+", "+Days.Friday.getEn()); break;
            case 6 : System.out.println(Days.Saturday.getUa()+", "+Days.Saturday.getEn()); break;
            case 7 : System.out.println(Days.Sunday.getUa()+", "+Days.Sunday.getEn()); break;
            default: System.out.println("Wrong input!");
        }
        System.out.println("\n\n");

        System.out.println("--------THIRD TASK----------");
        enum continents {
            ASIA, AFRICA, EUROPE, NORTH_AMERICA, SOUTH_AMERICA, AUSTRALIA, ANTARCTICA
        }
        String country;
        System.out.println("Countries in list: Ukraine, Austria, Poland, \n China, Japan, Taiwan \n" +
                "Nigeria, Ethiopia, Egypt,\n USA, Mexico, Canada,  \nBrazil, Colombia, Argentina" +
                "\nAustralia,  New Zealand, Fiji");
        System.out.print("Enter country: ");
        country = br.readLine();
        switch (country) {
            case "Ukraine": case "Austria": case "Poland":
                System.out.println(continents.EUROPE); break;
            case "China": case "Japan": case "Taiwan":
                System.out.println(continents.ASIA);break;
            case "Nigeria": case "Ethiopia": case "Egypt":
                System.out.println(continents.AFRICA);break;
            case "USA": case "Mexico": case "Canada":
                System.out.println(continents.NORTH_AMERICA);break;
            case "Brazil": case "Colombia": case "Argentina":
                System.out.println(continents.SOUTH_AMERICA);break;
            case "Australia": case "New Zealand": case "Fiji":
                System.out.println(continents.AUSTRALIA);break;
            default:
                System.out.println("Incorrect country name or country currently not listed");
        }
        System.out.println("\n\n");
        System.out.println("--------FOURTH TASK----------");
        Product prod1 = new Product("Bread", 12.1, 100);
        Product prod2 = new Product("Beer", 10.1, 10);
        Product prod3 = new Product("Butter", 15.1, 43);
        Product prod4 = new Product("Honey", 13.1, 63);
        System.out.println(Product.mostExpensive());
        System.out.println(Product.biggestPrice());

    }
}