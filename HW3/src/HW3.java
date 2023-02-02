import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count1 = 3;
		
		// Task 1.1 read 3 float numbers and check: are they all belong to the range [-5, 5];
		System.out.println("Please, type three float numbers");
		for (int i = 0; i < count1; i++) {
			float num1 = Float.parseFloat(br.readLine());
			if(num1 >= -5 && num1 <= 5) {
				System.out.println("Typed number "+ num1+ " belong in range [-5, 5]");
			}
			else System.out.println("Typed number "+ num1+ " is not belong in range [-5, 5]");
		}
		
		// Task 1.2 read 3 integer numbers and write max and min of them;
		int[] arr2 = new int[count1] ;
		System.out.println("Please, type three integer numbers");
		for (int i = 0; i < count1; i++) {
			 arr2[i] = Integer.parseInt(br.readLine());				
		}
		System.out.println("Max integer number is - " + Max1(arr2));
		System.out.println("Min integer number is - " + Min1(arr2));
		
		// Task 1.3 read number of HTTP Error (400, 401,402, ...) and write the name of this error (Declare enum HTTPError)
		System.out.println("Please type the number of HTTP Error");
		int num2 = Integer.parseInt(br.readLine());
		switch (num2){
			case 400 : System.out.println(HTTPError.BAD_REQUEST.getErrorName()); break;
			case 401 : System.out.println(HTTPError.UNAUTHORIZED.getErrorName()); break;
			case 402 : System.out.println(HTTPError.PAYMENT_REQUIRED.getErrorName()); break;
			case 403 : System.out.println(HTTPError.FORBIDDEN.getErrorName()); break;
			case 404 : System.out.println(HTTPError.NOT_FOUND.getErrorName()); break;
			case 405 : System.out.println(HTTPError.METHOD_NOT_ALLOWED.getErrorName()); break;
			case 406 : System.out.println(HTTPError.NOT_ACCEPTABLE.getErrorName()); break;
			case 407 : System.out.println(HTTPError.PROXY_AUTHENTICATION_REQUIRED.getErrorName()); break;
			default: System.out.println("Another error code");
		}
		// Task 2 Create class Dog with fields name, breed, age
		//•Declare enum for field breed
		//•Create 3 instances of type Dog
		//•Check if there is no two dogs with the same name
		//•Display the name and the kind of the oldest dog
		
		Dog dog1 = new Dog("Friend", Dog.breed.TAXA, 2);
		Dog dog2 = new Dog("Friend", Dog.breed.COLLIE, 1);
		Dog dog3 = new Dog("Kosmos", Dog.breed.GERMAN, 2);
		
		
		
		if (dog1.getName().equals(dog2.getName()) || dog1.getName().equals(dog3.getName()) || dog2.getName().equals(dog3.getName())) {
			System.out.println("There are no dogs with same name");
		}
		else {
			System.out.println("All three dogs have different name");
		}
		
		// olddest dog
		int ol1 = dog1.getAge();
		int ol2 = dog2.getAge();
		int ol3 = dog3.getAge();
		
		if (ol1 > ol2 && ol1 > ol3) {
			System.out.println("The oldest gog is " + dog1.getName());
		} 
		else if (ol2 > ol1 && ol2 > ol3) {
			System.out.println("The oldest gog is " + dog2.getName());
		}
		else if (ol3 > ol1 && ol3 > ol1) {
			System.out.println("The oldest gog is " + dog3.getName());
		}
		else {
			System.out.println("Some of dogs have same old");
		}


	}
	// Method which return min integer number from array
	public static int Min1(int[] a) {
		int mi1 = a[0];
		for (int i = 0; i < a.length; i++) {
			if (mi1 > a[i]) {
				mi1 = a[i];
			}
		}
		return mi1;		
	}
	// Method which return max integer number from array
	public static int Max1(int[] a) {
		int ma1 = a[0];
		for (int i = 0; i < a.length; i++) {
			if (ma1 < a[i]) {
				ma1 = a[i];
			}
		}
		return ma1;	
	}

}
