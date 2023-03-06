package homeWork12.Exceptions.practicalTask1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            squareRectangle(5,-7);
            System.out.println(squareRectangle(-2,-1));
        }catch (NegativeValue e){
            System.out.println(e.getMessage());
        }

    }
    static int squareRectangle(int a ,int b)throws NegativeValue{


        if (a < 0 && b < 0 ){
            throw new NegativeValue("A and B is nagative");
        } else if (a < 0 ){
            throw new NegativeValue("a < 0");
        }else if (b < 0);{
            throw new NegativeValue("b < 0 ");
        }
    }
}

