import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Entering the radius");
				double rad = Double.parseDouble(br.readLine());
				System.out.println("The perimeter of flower bed is " + (2*3.14*rad));
				System.out.println("The area of flower bed is " + (3.14*(rad*rad)));
		}
}
