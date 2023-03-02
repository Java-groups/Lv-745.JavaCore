package PracticalTask2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class PracticalTask2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("How are You?");
        String feel = br.readLine();
        System.out.println("You are " + feel);

    }
}
