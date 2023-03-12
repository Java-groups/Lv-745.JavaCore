public enum MenuNonAlcoholDrinks {

    COLA("Coca-Cola"),
    FANTA("Fanta"),
    SPRITE("Sprite"),
    WATER("Water");

    private final String nonAlcoholDrink;

    MenuNonAlcoholDrinks(String nonAlcoholDrink) {
        this.nonAlcoholDrink = nonAlcoholDrink;
    }

    public String getNonAlcoholDrink() {
        return nonAlcoholDrink;
    }
}
