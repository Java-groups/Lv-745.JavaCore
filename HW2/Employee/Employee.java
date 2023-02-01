package Employee;

public class Employee {
    private String name;
    private int hours;
    private int rate;
    private static int totalSum =0;
    private static int count=0;

    public Employee (){count++;}
    public Employee (String name){
        this.name = name;
        count++;
    }
    public Employee (String name, int rate, int hours){
      this.name = name;
      this.rate = rate;
      this.hours = hours;
      count++;
      totalSum+=(rate*hours);
    }

    public static int getTotalSum() {return totalSum;}

    public static int getCount() {return count;}

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public int getHours() {return hours;}
    public void setHours(int hours) {this.hours = hours;}
    public int getRate() {return rate;}
    public void setRate(int rate) {this.rate = rate;}


    public int getSalary() {return rate * hours;}
    public double getBonuses(){ return (rate*hours*0.01);}

    public String toString(){return "[name = "+this.name+", hours = "+this.hours+", rate = " + this.rate;}










}
