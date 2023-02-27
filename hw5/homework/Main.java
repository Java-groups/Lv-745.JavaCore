package hw5.homework;

public class Main {
    public static void main(String[] args) {
       Bird[] moreBird = {new Penguin("No","Yes","Peng"),
               new Chicken("Yes","Yes", "Chick"),
               new Swallow("Yes","Yes", "Swal"),
               new Eagle("Yes","Yes", "Eagl")};

for (Bird Birds: moreBird){
    Birds.fly();
    System.out.println(Birds);
}










    }
}
