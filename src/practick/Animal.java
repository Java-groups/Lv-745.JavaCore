package practick;

public class Animal {
    private int id;

    public Animal (int id){
        this.id=id;
    }
    public void eat(){
        System.out.println("Animal is eating...");
    }

    @Override
    public String toString() {
        return String.valueOf(id);
    }
}
