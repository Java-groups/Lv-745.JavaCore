package homeWork6OOP_EncapsulationInheratande.homeWork.homeWork2;

public class Developer extends Employeer {
    private String position;

    public Developer (String name, int age, double salary,String position){
    super(name,age,salary);
    this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
   @Override
    public String report(){
        return String.format("Name: %s, Age: %d, Position: %s, Salary: ₴ %.2f.", this.getName(), this.getAge(), this.getPosition(), this.getSalary());
    }
}
