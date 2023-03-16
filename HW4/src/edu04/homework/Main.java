package edu04.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		run();
	}

	public static void run() {
		task1();
		task2();
		task3();
		task4();
	}

	public static void task1() {

		System.out.println("****Task 1****\n");
		System.out.println("Please type number of month.From 1 to 12\n");
		String arrMonthName[] = { "January", "Februarry", "March", "April", "May", "June", "July", "August",
				"September", "October", "November", "December" };
		int arrMonthDays[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int num1 = 0; // Number of Month
		int count = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		do {
			try {
				num1 = Integer.parseInt(br.readLine());
				count++;
			} catch (NumberFormatException | IOException e) {
				System.out.println("Please type Integer Number!");
			}
			if (num1 < 1 || num1 > 12) {
				System.out.println("Integer Number must bee bettween 1 and 12\nPlease retype!");
				count = 0;
			}
			;
		} while (count == 0);

		System.out
				.println("\nIt is - " + arrMonthName[num1 - 1] + ". \nThere are " + arrMonthDays[num1 - 1] + " days.");

	}

	public static void task2() {

		System.out.println("\n****Task 2****\n");
		int count = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int arrNumb[] = new int[10];

		for (int i = 0; i < 10; i++) {
			System.out.println("Please type " + (i + 1) + " integer number");
			do {
				count = 0;
				try {
					arrNumb[i] = Integer.parseInt(br.readLine());
					count++;
				} catch (NumberFormatException | IOException e) {
					System.out.println("Please, type Integer Number!");
					count = 0;
				}
			} while (count == 0);
		}

		System.out.println("\n");
		firstPositiveFive(arrNumb);
	}

	public static void task3() {

		System.out.println("\n****Task 3****\n");
		int count = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int arrNumb1[] = new int[5];
		System.out.println("\nPlease, type 5 Integer numbers");

		for (int i = 0; i < arrNumb1.length; i++) {
			System.out.println("Please type " + (i + 1) + " integer number");
			do {
				count = 0;
				try {
					arrNumb1[i] = Integer.parseInt(br.readLine());
					count++;
				} catch (NumberFormatException | IOException e) {
					System.out.println("Please, type Integer Number!");
					count = 0;
				}
			} while (count == 0);
		}

		secondPositive(arrNumb1);
		minValuePosition(arrNumb1);
		productEvenNumber(arrNumb1);
	}

	public static void task4() {
		System.out.println("\n****Task 4****\n");
		printCarOfYear();

	}

	public static void firstPositiveFive(int[] a) {
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			if (a[i] < 0) {
				sum++;
			}
		}
		if (sum > 0) {
			System.out.println("Product of last 5 element is " + lastFive(a));
		} else
			System.out.println("Sum of the first 5 element is  " + firstFive(a));
	}

	public static int firstFive(int[] a) {
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			sum = sum + a[i];
		}
		return sum;
	}

	public static int lastFive(int[] a) {
		int sum = 1;
		for (int i = 5; i < a.length; i++) {
			sum = sum * a[i];
		}
		return sum;
	}

	public static void secondPositive(int[] a) {
		int count = 0;
		int i = 0;
		for (; i < a.length; i++) {
			if (a[i] > 0) {
				count++;
			}
			if (count == 2)
				break;
		}
		if (count < 2) {
			System.out.println("\nThere are no two positive integer numbers");
		} else {
			System.out.println("\nThe second positive number is " + a[i]);
		}

	}

	public static void minValuePosition(int[] a) {
		int minInt = a[0];
		int imin = 0;
		for (int i = 0; i < a.length; i++) {
			if (minInt > a[i]) {
				minInt = a[i];
				imin = i;
			}
		}
		System.out.println("\nMinimal Value from Array is " + minInt + ". Its position is " + (imin + 1));
	}

	public static void productEvenNumber(int[] a) {
		int prod = 1;
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0 && a[i] != 0) {
				prod = prod * a[i];
				count++;
			}
		}
		if (count == 0) {
			System.out.println("\nThere are no even numbers");
		} else {
			System.out.println("\nProduct of all even numbers is " + prod);
		}
	}

	public static void printCarOfYear() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Car[] cars = new Car[4];
		cars[0] = new Car("BMW X1", 2021, 2.600);
		cars[1] = new Car("BMW X3", 2019, 2.000);
		cars[2] = new Car("BMW X5", 2020, 3.200);
		cars[3] = new Car("BMW X7", 2020, 3.600);
		int count = 0;
		int k = 0;
		int year = -1;

		System.out.println("\nType Year");
		do {
			try {
				year = Integer.parseInt(br.readLine());
				count++;
			} catch (NumberFormatException | IOException e) {
				System.out.println("Please, type Integer Number of Year!");
			}
		} while (count == 0);
		System.out.println("\nCars by typed Year");
		if (count > 0) {
			for (int i = 0; i < 4; i++) {
				if (cars[i].getYear() == year && year > 0) {
					System.out.println(cars[i]);
				} else
					k++;
			}
			if (k == 4) {
				System.out.println("There are not cars with your type number");
			}

		} else {
			System.out.println("There are not cars with your type number");
		}
		
		System.out.println("\n Sort Cars by years");

		Car tmp = new Car();
		for (int i = 0; i < cars.length; i++) {
			for (int j = i + 1; j < cars.length; j++) {
				if (cars[i].getYear() > cars[j].getYear()) {
					tmp = cars[i];
					cars[i] = cars[j];
					cars[j] = tmp;
				}
			}
		}

		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}
	}

}
