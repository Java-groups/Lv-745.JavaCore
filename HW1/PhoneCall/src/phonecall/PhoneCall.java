package phonecall;
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader;

public class PhoneCall {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Which first country you want to call?");
		String country1 = br.readLine();
		System.out.println("Which second country you want to call?");
		String country2 = br.readLine();
		System.out.println("Which third country you want to call?");
		String country3 = br.readLine();
		
		System.out.println("How much minutes you talked with " + country1 + "?");
		int time1 = Integer.parseInt(br.readLine());
		System.out.println("How much minutes you talked with " + country2 + "?");
		int time2 = Integer.parseInt(br.readLine());
		System.out.println("How much minutes you talked with " + country3 + "?");
		int time3 = Integer.parseInt(br.readLine());
		
		int minute1 = 3;
		int minute2 = 5;
		int minute3 = 10;
		
		int result1, result2, result3;
		
		result1 = time1 * minute1;
		result2 = time2 * minute2;
		result3 = time3 * minute3;
		int result4 = result1 + result2 + result3;
		
		System.out.println("You have to pay for call to " + country1 + " " + result1 + "$");
		System.out.println("You have to pay for call to " + country2 + " " + result2 + "$");
		System.out.println("You have to pay for call to " + country3 + " " + result3 + "$");
		System.out.println("In general you have to pay for these freaks " + result4 + "$");
		
	}
}