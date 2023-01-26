package lesson3;

public class Student {


    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int Rating;
    public void setRating(int rating) {

        Rating = rating;
    }
    public int getRating() {

        return Rating;
    }

    public void print() {

        System.out.println(name + " your rating is " + Rating + " points");
    }


   //public void print(String greeting, int rating){
    //   System.out.println(greeting + " " + name);
    //   System.out.println("Your rating are " + rating + " points");
   //}
   public Student() {}


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", Rating=" + Rating +
                '}';
    }
}
