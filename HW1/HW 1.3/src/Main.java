import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
public static void main(String[] args) throws NumberFormatException, IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
double c1 = 1.5;
double c2 = 2;
double c3= 2.5;
System.out.println("How long contitued talk from first country(minutes)?");
int t1 = (int) Double.parseDouble(br.readLine());
System.out.println("How long contitued talk from second country(minutes)?");
int t2 = (int) Double.parseDouble(br.readLine());
System.out.println("How long contitued talk from third country(minutes)?");
int t3 = (int) Double.parseDouble(br.readLine());
System.out.println("Price of first talk is " + (c1*t1));
System.out.println("Price of second talk is " + (c2*t2));
System.out.println("Price of third talk is " + (c3*t3));
System.out.println("The total price is " + ((c1*t1)+(c2*t2)+(c3*t3)));
}
}