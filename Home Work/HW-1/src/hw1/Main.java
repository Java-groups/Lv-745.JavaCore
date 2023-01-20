package hw1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) throws IOException {

        String name = JOptionPane.showInputDialog("What is your name?");
        String place = JOptionPane.showInputDialog("Where are you live? " + name);
        JOptionPane.showMessageDialog(null, name + " You are live in the " + place);

        int radius = Integer.parseInt(JOptionPane.showInputDialog("Radius: "));
        JOptionPane.showMessageDialog(null, "Circumference: " + Math.round(Math.PI * radius * radius) + "\n" + "Perimeter: " + Math.round(2 * Math.PI * radius));

        int timeUkraine = Integer.parseInt(JOptionPane.showInputDialog("Speaking time in Ukraine"));
        int timeCanada = Integer.parseInt(JOptionPane.showInputDialog("Speaking time in Canada"));
        int timeLithuania = Integer.parseInt(JOptionPane.showInputDialog("Speaking time in Lithuania"));

        Calls first = new Calls(2, 4, 5, timeUkraine, timeCanada, timeLithuania);
        JOptionPane.showMessageDialog(null, "Ukraine amount: " + first.outputUkraine() + "\n" + "Canada amount: " + first.outputCanada() + "\n" + "Lithuania amount: " + first.outputLithuania());
    }
}
