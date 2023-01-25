import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Person _1 = new Person("Oleh", "Melnyk");
        _1.output();
        Person _2 = new Person();
        _2.input();
        _2.output();
        _2.setBirthYear(1995);
        _2.output();
    }

}
