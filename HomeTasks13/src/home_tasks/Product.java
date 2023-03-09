package home_tasks;

import java.time.LocalDate;

public class Product {
    private final String manufactureCategory;
    private final LocalDate manufactureDate;
    private final int price;

    public Product(String manufactureCategory, LocalDate manufactureDate, int price) {
        this.manufactureCategory = manufactureCategory;
        this.manufactureDate = manufactureDate;
        this.price = price;
    }

    public String getManufactureCategory() {
        return manufactureCategory;
    }


    public LocalDate getManufactureDate() {
        return manufactureDate;
    }


    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "manufactureCategory='" + manufactureCategory + '\'' +
                ", manufactureDate=" + manufactureDate +
                ", price=" + price +
                '}';
    }
}
