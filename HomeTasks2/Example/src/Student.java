public class Student {

    private String name;
    private int rating;
    private static int count = 0;
    private double avg = 0;
    private static int sum = 0;


    // setter for inputting name , using console
    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    // default constructor and constructor with parameters

    public Student(int rating) {
        this.rating = rating;
        sum = sum + rating;
        count++;
    }

    public Student(String name, int rating) {
        sum = sum + rating;
        this.name = name;
        this.rating = rating;
        count++;
    }


    // method to find avg
    public double avgRating() {
        avg = sum / count;
        return avg;
    }

    //
    public boolean betterStudent(Student stud1, Student stud2) {
        if (stud1.getRating() > stud2.getRating()) {
            return true;
        } else {
            return false;
        }
    }


    // Output info, using toString
    @Override
    public String toString() {
        return "[name = " + name + ", rating = " + rating + "]";
    }



}
