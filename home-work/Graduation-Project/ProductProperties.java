public abstract class ProductProperties {

    private int weigth;
    private int price;
    private String dish;
    public int table;
    private int orderQauntity;


    public String getDish() {
        return dish;
    }

    public void setDish(String dish) {
        this.dish = dish;
    }

    public int getWeigth() {
        return weigth;
    }

    public void setWeigth(int weigth) {
        this.weigth = weigth;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getOrderQauntity() {
        return orderQauntity;
    }

    public void setOrderQauntity(int orderQauntity) {
        this.orderQauntity = orderQauntity;
    }



}
