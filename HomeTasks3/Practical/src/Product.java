public class Product {

    private String name;
    private double price;
    private int quantity;
    private static double maxPrice = 0;

    private static double maxQuantity = 0;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;

        if (price > maxPrice) {
            maxPrice = price;
        }

        if (quantity > maxQuantity) {
            maxQuantity = quantity;
        }
    }

}