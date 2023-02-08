package HW4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PracticalTasks {
    public static void main(String[] args) throws IOException {
        //Practical tasks
//1.1
        int[] array = {1,3,-15,7,-2,9,25,74,6,8} ;
        int max = array[0];
        for (int i =0; i<array.length; i++){
            max = Math.max(max,array[i]);
        }
        System.out.println("the biggest numbers: "+max);

//1.2
        int sum_positive = 0;
        for (int i =0; i<array.length; i++) {
            if (array[i]>0)
                sum_positive+= array[i];
        }
        System.out.println("the sum of positive numbers: "+sum_positive);

//1.3
        int amount_neg = 0;
        for (int i =0; i<array.length; i++) {
            if (array[i]<0)
                amount_neg++;
        }
        System.out.println("the amount of negative numbers: "+amount_neg);
//1.more numbers

        int amount_positive = 0;
        for (int i =0; i<array.length; i++) {
            if (array[i]>0)
                amount_positive++;}


        String more_numbers = amount_positive>amount_neg? "More positive numbers.":"More negative numbers.";
        System.out.println(more_numbers);


//Employee

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Employee> emp = new ArrayList<Employee>();
        System.out.println("Введите продажи Олега: ");
        emp.add(new Employee("Олег",Integer.parseInt(br.readLine()),1));

        System.out.println("Введите продажи Ольги: ");
        emp.add(new Employee("Ольга",Integer.parseInt(br.readLine()),2));

        System.out.println("Введите продажи Павла: ");
        emp.add(new Employee("Павел",Integer.parseInt(br.readLine()),4));

        System.out.println("Введите продажи Марии: ");
        emp.add(new Employee("Мария",Integer.parseInt(br.readLine()),1));

        System.out.println("Введите продажи Эдуарда: ");
        emp.add(new Employee("Эдуард",Integer.parseInt(br.readLine()),2));

        List<Employee> sortEmp = emp.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).collect(Collectors.toList());

        for(Employee employee : sortEmp) {
            System.out.println("Продажи: "+ employee.getSalary()+" Имя: "+employee.getName()+" Департамент: "+employee.getDepartment_number());
        }















    }
}



















