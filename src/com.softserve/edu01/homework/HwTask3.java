package com.softserve.edu01.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
Phone calls from three different countries are с1, с2 and с3 standard units per minute.
Talks continued t1, t2 and t3 minutes.
How much computer will count for each call separately and all talk together?
Input all source data from console, make calculations and output to the screen
*/
public class HwTask3 {
final double c1 = 3.5,c2 = 4.5,c3 = 5.5;
double t1,t2,t3;
public void readTimeOfCall() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Enter time 1: ");
    t1 = Double.parseDouble(br.readLine());
    System.out.print("Enter time 2: ");
    t2 = Double.parseDouble(br.readLine());
    System.out.print("Enter time 3: ");
    t3 = Double.parseDouble(br.readLine());
}
public String countUnits(){
    return "Country 1(3.5/minute): " + c1*t1 + "\nCountry 2(4.5/minute): " + c2*t2 + "\nCountry 3(5.5/minute): " + c3*t3 + "\nSum: "  + (c1 * t1 + c2 * t2 + c3 * t3);
}
}

