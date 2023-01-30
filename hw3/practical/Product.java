package practical;

public class Product {
    private String name;
    private double price;
    private int quantity;

    private static String mostExpensiveName;
    private static int mostExpensiveQuantity;

    private static double mostExpensivePrice = 0.0;

    private static String biggestName;
    private static int biggestQuantity = 0;

    private static double biggestPrice;


    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        if (price>mostExpensivePrice){
            mostExpensiveName = name;
            mostExpensivePrice = price;
            mostExpensiveQuantity = quantity;
        }

        if (price > biggestQuantity){
            biggestName = name;
            biggestPrice = price;
            biggestQuantity = quantity;
        }
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    public static String mostExpensive() {
        return "Most expensive product{" +
                "name='" + mostExpensiveName + '\'' +
                ", quantity=" + mostExpensiveQuantity +
                '}';
    }

    public static String biggestPrice() {
        return "Biggest price product{" +
                "name='" + biggestName + '\'' +
                ", price=" + biggestPrice +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
