import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        createList();
    }

    public static void createList() {
        Employee workers[] = new Employee[4];
        workers[0] = new SalariedEmployee("Andriy", "UJY854", "UJN561VDR", 130, 42.5);
        workers[1] = new SalariedEmployee("Anya", "BNH452", "CDF503UJG", 100, 35);
        workers[2] = new ContractEmployee("Oleg", "IKJ805", "PBR803JKM", 32000);
        workers[3] = new ContractEmployee("Ira", "BLY403", "RFT802OPL", 40500);
        System.out.println("Original Arrays: " + Arrays.toString(workers));
        Arrays.sort(workers, new Employee.BySalary());
        System.out.println("Sorted Arrays: " + Arrays.toString(workers));
    }
}



