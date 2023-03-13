package MyProject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Fruit {

    private String name;
    private String color;


    // constructor
    public Fruit(String name, String color) {
        this.name = name;
        this.color = color;
    }
    public Fruit() {
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // create metods input output.
    public void input () throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name of fruit");
        this.name = scanner.nextLine();
        System.out.println("Enter color of fruit");
        this.color = scanner.nextLine();

    }
    public void print(){
        System.out.println("Name " + this.name);
        System.out.println("Color " + this.color);
    }

    public void input (String filename) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filename));
        this.name = br.readLine();
        this.color = br.readLine();
        br.close();
    }

    public void print(String filename) throws IOException {
        FileWriter fileWriter = new FileWriter(filename);
        fileWriter.write("Name :" + name +"\n");
        fileWriter.write("Color :" + color +"\n");
        fileWriter.close();
    }


    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
