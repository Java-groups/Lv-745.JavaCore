package com.softserve.edu03.practical;

public class Product {
   private String name;
   private int price;
   private int quantity;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    Product(String name, int price,int quantity){
        setName(name);
        setPrice(price);
        setQuantity(quantity);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    public Object mostExpensiveItem(Object o){
        if (this == o) return o;
        if (o == null || getClass() != o.getClass()) return o;
        Product product = (Product) o;
        if(price * quantity > product.price * product.quantity) {
            return this;
        } else { return o; }
    }

    public Object mostItemsQuantity(Object o){
        if (this == o) return o;
        if (o == null || getClass() != o.getClass()) return o;
        Product product = (Product) o;
        if(quantity > product.quantity) {
            return this;
        } else { return o; }
    }

}
