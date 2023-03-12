public class FoodOrder extends WeightPrice {

    public int table;
    public int orderQuantity;

    public FoodOrder(String dish, int orderQuantity, int table) {
        super();
        this.dishName(dish);
        this.weight(dish);
        this.price(dish);
        this.table = table;
        this.orderQuantity = orderQuantity;

    }

    @Override
    public String toString() {
        return "FoodOrder { " +
                "Table = " + table + " | " +
                " Choise = " + getDish() + " | " +
                " Order Quantity = " + orderQuantity + " | " +
                " Weight = " + getWeigth() + " | " +
                " Price = " + getPrice() + "$" +
                '}';
    }

}
