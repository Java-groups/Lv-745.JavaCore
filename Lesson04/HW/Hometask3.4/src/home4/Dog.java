package home4;

public class Dog {
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    private String breed;
    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
      this.breed = breed;
    }


    private int age;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void print() {
        System.out.println(name + " " +  breed + " " + age);
    }



}
