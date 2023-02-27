package hw5.homework2;

public class Main {
    public static void main(String[] args) {
       Employee[] empl = {new Developer("Nina",23,2356.8, "position1"),
               new Developer("Nelly",25,2856.8, "position2"),
               new Developer("Lina",18,1356.8, "position3")} ;

       for (Employee emp:empl){

           System.out.println(emp.report());
       }








    }
}
