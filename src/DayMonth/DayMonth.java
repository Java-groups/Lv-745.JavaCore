package DayMonth;


import java.util.Scanner;

public class DayMonth {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int monthDays[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        monthDays[0] = 31;
        monthDays[1] = 28;
        monthDays[2] = 31;
        monthDays[3] = 30;
        monthDays[4] = 31;
        monthDays[5] = 30;
        monthDays[6] = 31;
        monthDays[7] = 31;
        monthDays[8] = 30;
        monthDays[9] = 31;
        monthDays[10] = 30;
        monthDays[11] = 31;

        System.out.println("Enter number of month. ");
        int month = scanner.nextInt();
       switch (month){
           case 0:
               System.out.println(monthDays[0]);
               break;

           case 1:
               System.out.println(monthDays[1]);
               break;
           case 2:
               System.out.println(monthDays[2]);
               break;
           case 3:
               System.out.println(monthDays[3]);
               break;
           case 4:
               System.out.println(monthDays[4]);
               break;
           case 5:
               System.out.println(monthDays[5]);
               break;
           case 6:
               System.out.println(monthDays[6]);
               break;
           case 7:
               System.out.println(monthDays[7]);
               break;
           case 8:
               System.out.println(monthDays[8]);
               break;
           case 9:
               System.out.println(monthDays[9]);
               break;
           case 10:
               System.out.println(monthDays[10]);
               break;
           case 11:
               System.out.println(monthDays[11]);
               break;
           case 12:
               System.out.println(monthDays[12]);
               break;
           default:
               System.out.println("enter number of mounth");
        }
    }
}

