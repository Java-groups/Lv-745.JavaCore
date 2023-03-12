import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Appl extends WeightPrice {


    public static void main(String[] args) throws IOException {
        Appl execute = new Appl();

        execute.listener().forEach(o -> System.out.println(o.toString()));

    }

    public ArrayList<FoodOrder> listener() throws IOException {
        System.out.println("---------My Restaurant-----------");
        System.out.println();
        System.out.println("____________Our menu_____________");
        System.out.println();
        System.out.println("===========Main dishes===========");
        System.out.println(MenuMainDishes.FRENCH_FRIES.getDish() + " | " + this.weight(MenuMainDishes.FRENCH_FRIES.getDish()) + " | " + this.price(MenuMainDishes.FRENCH_FRIES.getDish()) + "$");
        System.out.println(MenuMainDishes.PORK_BURGER.getDish() + " | " + this.weight(MenuMainDishes.PORK_BURGER.getDish()) + " | " + this.price(MenuMainDishes.PORK_BURGER.getDish()) + "$");
        System.out.println(MenuMainDishes.AGED_PORK_BURGER.getDish() + " | " + this.weight(MenuMainDishes.AGED_PORK_BURGER.getDish()) + " | " + this.price(MenuMainDishes.AGED_PORK_BURGER.getDish()) + "$");
        System.out.println(MenuMainDishes.CHICKEN_BURGER.getDish() + " | " + this.weight(MenuMainDishes.CHICKEN_BURGER.getDish()) + " | " + this.price(MenuMainDishes.CHICKEN_BURGER.getDish()) + "$");
        System.out.println(MenuMainDishes.BEEF_BURGER.getDish() + " | " + this.weight(MenuMainDishes.BEEF_BURGER.getDish()) + " | " + this.price(MenuMainDishes.BEEF_BURGER.getDish()) + "$");
        System.out.println(MenuMainDishes.MASHED_POTATO_DUCK.getDish() + " | " + this.weight(MenuMainDishes.MASHED_POTATO_DUCK.getDish()) + " | " + this.price(MenuMainDishes.MASHED_POTATO_DUCK.getDish()) + "$");
        System.out.println(MenuMainDishes.RISOTTO.getDish() + " | " + this.weight(MenuMainDishes.RISOTTO.getDish()) + " | " + this.price(MenuMainDishes.RISOTTO.getDish()) + "$");
        System.out.println(MenuMainDishes.PASTA.getDish() + " | " + this.weight(MenuMainDishes.PASTA.getDish()) + " | " + this.price(MenuMainDishes.PASTA.getDish()) + "$");
        System.out.println(MenuMainDishes.HOTDOG.getDish() + " | " + this.weight(MenuMainDishes.HOTDOG.getDish()) + " | " + this.price(MenuMainDishes.HOTDOG.getDish()) + "$");
        System.out.println();
        System.out.println("==========Alcohol Drinks=========");
        System.out.println();
        System.out.println(MenuAlcoholDrinks.BEER_ALE.getAlcoholDrink() + " | " + this.weight(MenuAlcoholDrinks.BEER_ALE.getAlcoholDrink()) + " | " + this.price(MenuAlcoholDrinks.BEER_ALE.getAlcoholDrink()) + "$");
        System.out.println(MenuAlcoholDrinks.CARLSBERG.getAlcoholDrink() + " | " + this.weight(MenuAlcoholDrinks.CARLSBERG.getAlcoholDrink()) + " | " + this.price(MenuAlcoholDrinks.CARLSBERG.getAlcoholDrink()) + "$");
        System.out.println(MenuAlcoholDrinks.CHERNIHIVSKE.getAlcoholDrink() + " | " + this.weight(MenuAlcoholDrinks.CHERNIHIVSKE.getAlcoholDrink()) + " | " + this.price(MenuAlcoholDrinks.CHERNIHIVSKE.getAlcoholDrink()) + "$");
        System.out.println(MenuAlcoholDrinks.HORTYTSYA.getAlcoholDrink() + " | " + this.weight(MenuAlcoholDrinks.HORTYTSYA.getAlcoholDrink()) + " | " + this.price(MenuAlcoholDrinks.HORTYTSYA.getAlcoholDrink()) + "$");
        System.out.println();
        System.out.println("========NON Alcohol Drinks=======");
        System.out.println();
        System.out.println(MenuNonAlcoholDrinks.COLA.getNonAlcoholDrink() + " | " + this.weight(MenuNonAlcoholDrinks.COLA.getNonAlcoholDrink()) + " | " + this.price(MenuNonAlcoholDrinks.COLA.getNonAlcoholDrink()) + "$");
        System.out.println(MenuNonAlcoholDrinks.FANTA.getNonAlcoholDrink() + " | " + this.weight(MenuNonAlcoholDrinks.FANTA.getNonAlcoholDrink()) + " | " + this.price(MenuNonAlcoholDrinks.FANTA.getNonAlcoholDrink()) + "$");
        System.out.println(MenuNonAlcoholDrinks.SPRITE.getNonAlcoholDrink() + " | " + this.weight(MenuNonAlcoholDrinks.SPRITE.getNonAlcoholDrink()) + " | " + this.price(MenuNonAlcoholDrinks.SPRITE.getNonAlcoholDrink()) + "$");
        System.out.println(MenuNonAlcoholDrinks.WATER.getNonAlcoholDrink() + " | " + this.weight(MenuNonAlcoholDrinks.WATER.getNonAlcoholDrink()) + " | " + this.price(MenuNonAlcoholDrinks.WATER.getNonAlcoholDrink()) + "$");
        System.out.println();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String dish;
        int orderQuantity;
        int table;
        String isDone = " ";

        ArrayList <FoodOrder> order = new ArrayList<FoodOrder>();

        while(!isDone.equals("no")) {
            System.out.println("What do you want?");
            dish = br.readLine();
            System.out.println("Quantity");
            try {
                orderQuantity = Integer.parseInt(br.readLine());
            }catch (NumberFormatException e) {
                System.out.println("Insert integer!");
                try {
                    orderQuantity = Integer.parseInt(br.readLine());
                }catch (NumberFormatException a) {
                    System.out.println("Wrong input");
                    break;
                }
            }
            System.out.println("Table");
            try {
                table = Integer.parseInt(br.readLine());
            }catch (NumberFormatException e) {
                System.out.println("Insert integer!");
                try {
                    table = Integer.parseInt(br.readLine());
                }catch (NumberFormatException a) {
                    System.out.println("Wrong input");
                    break;
                }

            }
            order.add(new FoodOrder(dish, orderQuantity, table));
            System.out.println("One more?");
            isDone = br.readLine();
        }
        return order;
    }
}
