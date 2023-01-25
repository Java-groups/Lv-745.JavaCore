package students;

public class Student {
    private String name;
    private int rating;
    private static int studentsCount = 0;
    private static int totalRating = 0;

    public static double avgRating() {
        return totalRating / studentsCount;
    }

    public static int getTotalRating(){return totalRating;}
    public static int getStudentsCount(){return studentsCount;}
    public Student (){

    }
    public Student(String name, int rating) {
        this.name = name;
        this.rating = rating;
        studentsCount += 1;
        totalRating += rating;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getRating() {
        return this.rating;
    }

    public boolean betterStudent(Student s) {
        if (this.rating > s.getRating()) {
            return true;
        } else {
            return false;
        }
    }

    public String toString(){
        return "Student [name = "+this.name+", rating = "+this.rating+"]";
    }



}
