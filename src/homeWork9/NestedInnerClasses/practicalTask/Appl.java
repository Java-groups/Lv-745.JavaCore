package homeWork9.NestedInnerClasses.practicalTask;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public  class Appl  {


    public static void main(String[] args) {



        System.out.println("first task add 7 pairs(id,name)");
            Map<Integer,String> employeeMap = new HashMap<>();
            employeeMap.put(1,"Vasyl");
            employeeMap.put(2,"Stepan");
            employeeMap.put(3,"Marian");
            employeeMap.put(4,"Vladyslav");
            employeeMap.put(5,"Bogdan");
            employeeMap.put(6,"Katya");
            employeeMap.put(7,"Annya");
        System.out.println("display the map with toString");
            System.out.println(employeeMap.toString());

      System.out.println("display the map with iterator");
//            //ITERATOR
            //display the map with iterator
           Iterator<String> iterator = employeeMap.values().iterator();
            while (iterator.hasNext()){
                String current = iterator.next();
                System.out.println(current );
            }
        System.out.println("");
        System.out.println("Task 3");
        Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter id");
            int id = scanner.nextInt();
            if (employeeMap.containsKey(id)){
                String name = employeeMap.get(id);
                System.out.println("Name" + name);
            }else {
                System.out.println("Sorry i cant found employee with this ID" + id);
            }


        System.out.println("What is your name?");
        String name = scanner.next();
        if (employeeMap.containsValue(name)) {
            int IdName = 0;
            for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
                if (entry.getValue().equals(name)) {
                    IdName = entry.getKey();
                    break;
                }
            }
            System.out.println("ID: " + IdName);
        } else {
            System.out.println("Could not find an employee with name " + name);









//        Iterator<String> iterator1 = employeeMap.values().iterator();
//            while (iterator.hasNext()){
//                String name1 = iterator.next();
//                System.out.println(name + " name");
//                if (name.contains()){
//                    iterator.();
//                }
//            }

//        if (employeeMap.containsValue(name)){
//            for (Map.Entry<Integer,String>entry : employeeMap.entrySet() ){
//
//            }
//        }
        }
}}
//            //for each
////            for (String current : employeeMap){
////                System.out.println(current);
////                if (current.contains("Annya")){
////                    employeeMap.remove(current);
//
//            Iterator<String> iterator = employeeMap.values().iterator();
//            while (iterator.hasNext()){
//                String current = iterator.next();
//                System.out.println(current + " current");
//                if (current.contains("Annya")){
//                    iterator.remove();
//                }
//            }
//            System.out.println("final list");
//            System.out.println(employeeMap);









