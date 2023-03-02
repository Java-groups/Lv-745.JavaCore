package Task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task5 {
    public static void main(String[] args) throws IOException {
        BufferedReader diya = new BufferedReader(new InputStreamReader(System.in));
        int C1,C2,C3;
        C1 = 4; C2 = 6; C3 = 8;

        System.out.println("How many minutes you did you talk with Poland  ? " );
        String talk = diya.readLine();
        System.out.println("For talcking with poland you must pay " + C1 + talk);


        System.out.println("How many minutes you did you talk Germany  ? " );
        String talk1 = diya.readLine();
        System.out.println("For talcking with Germeny you must pay " + C2 + talk1);


        System.out.println("How many minutes you did you talk  Uk 3? " );
        String talk2 = diya.readLine();
        System.out.println( "For talcking with UK you must pay " +  talk2 + C3);

        System.out.println("How many minutes you did you talk ? " );
        String talk3 = diya.readLine();
        System.out.println("For talcking with another county you must pay " + C1 + C2 + C3 + talk3);
    }
}
