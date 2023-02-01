package HW2;

public class Student {
    private String name;
    private int rating;
    private static int students = 0;
    private static int totalRating = 0;

    public static int getStudents() {
        return students;
    }
    public static int getTotalRating() {
        return totalRating;
    }

    public static int avgRating(){return totalRating/students;}
    public void setName(String name) {
        this.name = name;
    }
    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }



    public Student(){}
    public Student(String name,int rating){
        this.name = name;
        this.rating = rating;
        students++;
        totalRating+=rating;
    }

    public boolean betterStudent(Student s) {return this.rating>s.getRating();}

    public String toString(){return "Student [name = "+this.name+", rating = "+this.rating+"]";}


}



