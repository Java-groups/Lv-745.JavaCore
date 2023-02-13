package homework1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------FIRST TASK----------");
        taskOne();
    }
    public static void taskOne(){
        Employee[] employees = {new SalariedEmployee("00001","Mike","SSIN2345435", 43267),
                new ContractEmployee("00002","Line","FTIM24u957425", 290.5, 160),
                new SalariedEmployee("00003","John","FTIM24u957422", 49931),
                new SalariedEmployee("00004","Nick","SSIN22345435", 48932),
                new ContractEmployee("00005","Anna","FTIM24u9574348", 305.5, 160),
                new SalariedEmployee("00006","Mary","FTIM24u9574366", 34564),};
        System.out.println("--Unsorted array of Employee--");
        for (Employee employee:employees) {
            System.out.println(employee);

        }
        Arrays.sort(employees);
        System.out.println("--Sorted array of Employee--");
        for (Employee employee:employees) {
            System.out.println(employee);
        }
    }
}
