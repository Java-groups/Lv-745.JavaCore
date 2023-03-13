import src.TaskTwo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Appl {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        byte choice;
        do {
            System.out.print("""
                    ___________________________________________________________
                    Menu of tasks:
                    0.Exit
                    1.	Input number and generate Fibonacci sequence (e.g. number: 6, result: 1, 1, 2, 3, 5, 8)
                    2.	Input number and decompose this number into a product of prime numbers with their degrees (e.g. number: 84, result 2^2, 3, 7)
                    3.	Input cost of dollar and sum of money in gryvna.
                    Calculate how many dollars user can buy and change.
                    4.	Input string and calculate number of loud letters (e.g. word: “My test text”, result: 3)
                    5.	Input string and check if this string is palindrome (e.g. “ABCCBA”)
                    6.	Input text and calculate number of words in this text
                    7.	Input number n and calculate n! (e.g. 5! = 1*2*3*4*5 = 120)
                    8.	Input number in range from 1 to 1 000 000 and output this number in English
                    9.	Write method to return random value 0 or 1.
                    Input number n, call this method n times and calculate how many times were number one
                    10.	Find the number of steps for which you get 1, using the following process: we take any
                    the natural number n is greater than one. If it is even, then divide it by 2, and if it is odd, then
                    multiply by 3 and add 1
                    11.	Enter the credit card number from the manufacturer (Visa, MasterCard, American Express, Discover) and check for the correct number (see how credit cards use the checksum)
                    12.	If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
                    The sum of these multiples is 23. Find the sum of all the multiples of 3 or 5 below 1000.
                    13.	2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
                    What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
                    14.	In England the currency is made up of pound, £, and pence, p, and there are eight coins in general circulation: 1p, 2p, 5p, 10p, 20p, 50p, £1 (100p) and £2 (200p).
                    It is possible to make £2 in the following way: 1×£1 + 1×50p + 2×20p + 1×5p + 1×2p + 3×1p.
                    How many different ways can £2 be made using any number of coins?
                    ___________________________________________________________
                    Enter your choice:""");
            choice = Byte.parseByte(br.readLine());
            switch (choice) {
                case 1 -> {


                }
                case 2 -> {
                    TaskTwo taskTwo = new TaskTwo();
                    taskTwo.execute();
                }
                case 3-> {

                }
                case 4-> {

                }
                case 5-> {
                    System.out.println("Task 5 - " + Task5.palindrome());
                }
                case 6-> {

                    TaskSix six = new TaskSix();
                    six.execute();

                }
                case 7-> {

                }
                case 8-> {

                }
                case 9-> {
                    TaskNine nine = new TaskNine();
                    nine.execute();

                }
                case 10-> {

                }
                case 11-> {

                }
                case 12-> {
                    System.out.println("Task 12 - " + Task12.sum());
                }
                case 13-> {

                }
                case 14-> {
                    System.out.println("Task 14  - " + Task14.countCoinCombinations());
                }
                default -> {
                    System.out.println("Wrong choice! Repeat again!");
                    choice=0;
                }
            }
        }while (choice!=0);
    }
}
