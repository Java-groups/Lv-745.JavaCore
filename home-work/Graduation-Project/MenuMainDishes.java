enum MenuMainDishes {

    FRENCH_FRIES("French Fries"),
    PORK_BURGER("Pork Burger"),
    AGED_PORK_BURGER("Aged Pork Burger"),
    CHICKEN_BURGER("Chicken Burger"),
    BEEF_BURGER("Beef Burger"),
    MASHED_POTATO_DUCK("Mashed Potato with Duck Leg"),
    RISOTTO("Risotto"),
    HOTDOG("Hot-Dog"),
    PASTA("Pasta Carbonara");

    private final String dish;

    MenuMainDishes(String dish) {
        this.dish = dish;
    }

    public String getDish(){
        return dish;
    }

}
