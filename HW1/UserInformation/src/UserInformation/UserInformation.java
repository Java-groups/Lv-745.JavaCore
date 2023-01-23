package UserInformation;
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader;

public class UserInformation {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Hello. What is your name?"); 
		String name = br.readLine(); 
		System.out.println("How old are you?");
		int age = Integer.parseInt(br.readLine());
		System.out.println("Where are you live?");
		String adress = br.readLine(); 
		System.out.println("What's color your eyes?");
		String eye = br.readLine();
		System.out.println("How tall are you?");
		String tall = br.readLine();
		
		System.out.println("Hello " + name + " )");
		System.out.println("Age: " + age); 
		System.out.println("eye color: " + eye);
		System.out.println("Height: " + tall);
		System.out.println(name + " live in " + adress);
	}
}