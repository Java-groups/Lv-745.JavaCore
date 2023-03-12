
public class WeightPrice extends ProductProperties implements Price{


    public WeightPrice() {

    }

    @Override
    public int weight(String dish) {
        setWeigth(switch(dish.toLowerCase()) {
            case "french fries" -> 170;
            case "pork burger", "chicken burger" -> 260;
            case "aged pork burger" -> 270;
            case "beef burger" -> 280;
            case "mashed potato with duck leg" -> 310;
            case "risotto", "pasta carbonara", "sprite", "fanta", "water", "cola", "coca-cola", "coca cola" -> 300;
            case "hot-dog" -> 120;
            case "ale beer", "chernihivske beer", "carlsberg beer" -> 500;
            case "horilka hortytsya" -> 200;
            default -> 0;

        });

        return getWeigth();


    }

    @Override
    public String dishName(String dish) {
        setDish(switch(dish.toLowerCase()) {
            case "french fries" -> MenuMainDishes.FRENCH_FRIES.getDish();
            case "pork burger" -> MenuMainDishes.PORK_BURGER.getDish();
            case "chicken burger" -> MenuMainDishes.CHICKEN_BURGER.getDish();
            case "aged pork burger" -> MenuMainDishes.AGED_PORK_BURGER.getDish();
            case "beef burger" -> MenuMainDishes.BEEF_BURGER.getDish();
            case "mashed potato with duck leg" -> MenuMainDishes.MASHED_POTATO_DUCK.getDish();
            case "risotto" -> MenuMainDishes.RISOTTO.getDish();
            case "pasta carbonara" -> MenuMainDishes.PASTA.getDish();
            case "hot-dog" -> MenuMainDishes.HOTDOG.getDish();
            case "ale beer" -> MenuAlcoholDrinks.BEER_ALE.getAlcoholDrink();
            case "carlsberg beer" -> MenuAlcoholDrinks.CARLSBERG.getAlcoholDrink();
            case "chernihivske beer" -> MenuAlcoholDrinks.CHERNIHIVSKE.getAlcoholDrink();
            case "horilka hortytsya" -> MenuAlcoholDrinks.HORTYTSYA.getAlcoholDrink();
            case "cola", "coca-cola", "coca cola" -> MenuNonAlcoholDrinks.COLA.getNonAlcoholDrink();
            case "sprite" -> MenuNonAlcoholDrinks.SPRITE.getNonAlcoholDrink();
            case "fanta" -> MenuNonAlcoholDrinks.FANTA.getNonAlcoholDrink();
            case "water" -> MenuNonAlcoholDrinks.WATER.getNonAlcoholDrink();
            default -> "Wrong Choise";

        });

        return getDish();
    }

    @Override
    public int price(String dish) {

        setPrice(switch(dish.toLowerCase()) {
            case "french fries", "pork burger", "chicken burger" -> 5;
            case "aged pork burger" -> 7;
            case "beef burger" -> 6;
            case "mashed potato with duck leg", "ale beer" -> 4;
            case "risotto", "pasta carbonara" -> 8;
            case "hot-dog", "cola", "coca-cola", "coca cola", "sprite", "fanta", "water"-> 1;
            case "carlsberg beer", "horilka hortytsya" -> 3;
            case "chernihivske beer" -> 2;
            default -> 0;

        });

        return getPrice();

    }

}
