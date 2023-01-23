package FlowerBed;
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader;

public class Circle {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("What's radius of flower bed?"); 
		int radius = Integer.parseInt(br.readLine()); 
		double pi = 3.14;
		
		double result = pi * radius * radius;
		
		System.out.println("Area " + result + " m2");
		
		result = 2 * pi * radius;
		
		System.out.println("And perimeter " + result + " m") ;
	}
}

//	int age = Integer.parseInt(br.readLine());