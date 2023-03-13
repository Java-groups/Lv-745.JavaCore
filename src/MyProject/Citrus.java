package MyProject;

import java.io.IOException;
import java.util.Scanner;

public class Citrus extends Fruit {

    // create variable
    private double vitaminCContent;


    // constructor

    public Citrus(String name, String color, double vitaminCContent) {
        super(name, color);
        this.vitaminCContent = vitaminCContent;

    }
    public Citrus(){

    }

    public void getVitaminCContent() {
    }

    public void setVitaminCContent(double vitaminCContent) {
        this.vitaminCContent = vitaminCContent;
    }

    @Override
    public void input() throws IOException {
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter  vitamin C content");
        this.vitaminCContent = scanner.nextDouble();
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Vitamin C Content " + this.vitaminCContent);
    }

    @Override
    public String toString() {
        return "Citrus{" +
                "vitaminCContent=" + vitaminCContent +
                '}';
    }
}
