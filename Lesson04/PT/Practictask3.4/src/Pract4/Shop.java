package Pract4;

public class Shop {
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.setName("Milk");
        product1.setPrice(10.33f);
        product1.setQuantity(100);

        Product product2 = new Product();
        product2.setName("Butter");
        product2.setPrice(20.65f);
        product2.setQuantity(50);

        Product product3 = new Product();
        product3.setName("Coffee");
        product3.setPrice(48.12f);
        product3.setQuantity(20);

        Product product4 = new Product();
        product4.setName("Tea");
        product4.setPrice(18.99f);
        product4.setQuantity(18);

        if(product1.getPrice() >= product2.getPrice() && product1.getPrice() >= product3.getPrice() && product1.getPrice() >= product4.getPrice()){
        System.out.println("Найдорожчий товар " + product1.getName() + ", його кількість становить - " +  product1.getQuantity());
        }
        if(product2.getPrice() >= product1.getPrice() && product2.getPrice() >= product3.getPrice() && product2.getPrice() >= product4.getPrice()){
            System.out.println("Найдорожчий товар " + product2.getName() + ", його кількість становить - " +  product2.getQuantity());
        }
        if(product3.getPrice() >= product1.getPrice() && product3.getPrice() >= product2.getPrice() && product3.getPrice() >= product4.getPrice()){
            System.out.println("Найдорожчий товар " + product3.getName() + ", його кількість становить - " +  product3.getQuantity());
        }
        if(product4.getPrice() >= product1.getPrice() && product4.getPrice() >= product2.getPrice() && product4.getPrice() >= product4.getPrice()){
            System.out.println("Найдорожчий товар " + product4.getName() + ", його кількість становить - " +  product4.getQuantity());
        }

        if(product1.getQuantity() >= product2.getQuantity() && product1.getQuantity() >= product3.getQuantity() && product1.getQuantity() >= product4.getQuantity()){
            System.out.println("Найбільша кількість товару - це " + product1.getName());
        }
        if(product2.getQuantity() >= product1.getQuantity() && product2.getQuantity() >= product3.getQuantity() && product2.getQuantity() >= product4.getQuantity()){
            System.out.println("Найбільша кількість товару - це " + product2.getName());
        }
        if(product3.getQuantity() >= product1.getQuantity() && product3.getQuantity() >= product2.getQuantity() && product3.getQuantity() >= product4.getQuantity()){
            System.out.println("Найбільша кількість товару - це " + product3.getName());
        }
        if(product4.getQuantity() >= product1.getQuantity() && product4.getQuantity() >= product2.getQuantity() && product4.getQuantity() >= product3.getQuantity()){
            System.out.println("Найбільша кількість товару - це " + product4.getName());
        }
    }

}
