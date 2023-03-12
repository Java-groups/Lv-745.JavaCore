public enum MenuAlcoholDrinks {

    BEER_ALE("ALE Beer"),
    CARLSBERG("Carlsberg Beer"),
    CHERNIHIVSKE("Chernihivske Beer"),
    HORTYTSYA("Horilka Hortytsya");

    private final String alcoholDrink;

    MenuAlcoholDrinks(String alcoholDrink) {
        this.alcoholDrink = alcoholDrink;
    }

    public String getAlcoholDrink() {
        return alcoholDrink;
    }
}
