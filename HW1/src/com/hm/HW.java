package com.hm;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import com.contries.*;

public class HW {

public static void main(String[] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	// 1 Flower Bad
	System.out.println("Please type a radius for Flower bed ");
	int rad = Integer.parseInt(br.readLine());
	System.out.println("Perimetr of Flower bed is - " + (2*rad * Math.PI)+ " meters");
	System.out.println("Area of Flower bed is - " + (rad*rad* Math.PI/4)+ " squere meters");

	// 2 Name and address
	String name;
	String address;
	System.out.println("What is your name?");
	name = br.readLine();
	System.out.println("Where do you live " + name + "?");
	address =  br.readLine();
	System.out.println("Your name is - " + name+". You live in " + address + "!");

	// 3 Phone calls
	System.out.println("Type price and time of first call");
	int c1 = Integer.parseInt(br.readLine());
	int t1 = Integer.parseInt(br.readLine());
	
	System.out.println("Type price and time of second call");
	int c2 = Integer.parseInt(br.readLine());
	int t2 = Integer.parseInt(br.readLine());
	
	System.out.println("Type price and time of third call");
	int c3 = Integer.parseInt(br.readLine());
	int t3 = Integer.parseInt(br.readLine());
	
	int[] ar1 = {c1,c2,c3};
	int[] ar2 = {t1,t2,t3};
	Countries s1 = new Countries(c1, t1);
	//Countries s2 = new Countries(c2, t2);
	//Countries s3 = new Countries(c3, t3);
	Countries s4 = new Countries(ar1, ar2);
	
	System.out.println("The first call cost - " + s1.cost(c1, t1));
	System.out.println("The Second call cost - " + Countries.cost(c2, t2));
	System.out.println("The third call cost - " + Countries.cost(c3, t3));	
	System.out.println("The summary call cost - " + s4.costs(ar1,ar2));



    }

}
