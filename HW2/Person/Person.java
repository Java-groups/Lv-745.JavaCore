
package Person;

import java.time.YearMonth;
import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;
    private int year = YearMonth.now().getYear();
    private int count = 0;
    public Person(){}
    public Person(String firstName,String lastName){
    this.firstName = firstName;
    this.lastName = lastName;
    count++;
    }


    public String getFirstName() {return firstName;}

    public void setFirstName(String firstName) {this.firstName = firstName;}

    public String getLastName() {return lastName;}

    public void setLastName(String lastName) {this.lastName = lastName;}

    public int getBirthYear() {return birthYear;}

    public void setBirthYear(int birthYear) {this.birthYear = birthYear;}

    public int getYear() {return year;}

    public void setYear(int year) {this.year = year;}
    public int getCount() { return count;}

public int getAge(){return year-birthYear ;}

    public  void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input firstName and lastName");
        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        System.out.println("Input birthYear");
        int birthYear = scanner.nextInt();
        this.firstName = firstName;
        this.lastName=lastName;
        this.birthYear=birthYear;
        count++;
    }


    public String output() {return "firstName - " +firstName
                                    +" lastName - "+ lastName+ " birthYear - "+birthYear
                                    +" Age - "+getAge();}


//    public void changeName(String fn, String ln) {
//        this.firstName = fn;
//        this.lastName = ln;
//    }




}
