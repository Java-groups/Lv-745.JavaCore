package MyProject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        //  input and print info about product
        Fruit fruts = new Fruit();
        fruts.input();
        fruts.print();
        fruts.setName("");
        fruts.setColor("");

        // input and print info in file
        fruts.print("frutsForProject.txt");
        fruts.input("frutsForProject.txt");

        //
        Citrus citrus = new Citrus();
        citrus.input();
        citrus.print();
        citrus.getVitaminCContent();
        citrus.setVitaminCContent(13);



        List<Fruit> fruits = new ArrayList<>();
        fruits.add(new Fruit("Apple","Red"));
        fruits.add(new Fruit("PineApple","Yellow"));
        fruits.add(new Fruit("Melon","Yellow"));
        fruits.add(new Fruit("WaterMelon","Red"));
        fruits.add(new Citrus("Orange" ,"Orange",12));
        fruits.add(new Citrus("Lemon" ,"Yellow",15));
        fruits.add(new Citrus("Lime" ,"Green",16));


        // Sorted Yellow fruits
        System.out.println("===== Print info about yellow fruit  =======");
        for (Fruit fruit : fruits){
            if (fruit.getColor().equals("Yellow")){
                fruit.print();
            }
        }

        // сортування за назвою і виведення у файл .
        System.out.println("======= sorted fruits and write the result in file  ======");
        fruits.sort(Comparator.comparing(Fruit::getName));
        try {


            FileWriter fileWriter = new FileWriter("fruits.txt");
            for (Fruit fruit : fruits) {
                fileWriter.write(fruit.getName()+ " ," + fruit.getColor() + "\n");
            }
            fileWriter.close();
        }catch (IOException e ){
            e.printStackTrace();
        }


    }

    }

