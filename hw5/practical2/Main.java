package com.softserve.edu05.practicaltask2;

import java.awt.Color;

    public class Main {
        public static void main(String[] args) {
            System.out.println(
                       """
                       PRACTICAL TASK 2
                       Create three classes:\s
                       Point with attributes x and y
                       Line which contains two object of Point class
                       ColorLine with attributes Color  which extends Line class.
                       Override method toString() and define method print() in every classes
                       In main() method create array of Line and add some Line and ColorLine to it. Call method print() for all of it.                                                                                                                        
                       """);

            Line [] lines = new Line[4];
            lines[0] = new Line(new Point(5,10), new Point(2,3));
            lines[1] = new Line(new Point(2,5), new Point(1,7));
            lines[2] = new ColorLine(new Point(7,5), new Point(2,9),new Color(29 ,161, 242));
            lines[3] = new ColorLine(new Point(4,1), new Point(3,3),new Color(255, 185, 0));

            for (Line line : lines) {
                System.out.println(line.print());
            }
        }
    }

