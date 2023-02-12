package com.softserve.edu01.additional;

class AdditionalTasks {
    //https://www.codewars.com/kata/you-cant-code-under-pressure-number-1/
    class Java {
        public static int doubleInteger(int i) {
            // Double the integer and return it!
            return 2 * i;
        }
    }
    //    https://www.codewars.com/kata/function-3-multiplying-two-numbers/
    class MultiplyNumbers {
        public static int multiply(int a, int b) {
            return a*b;
        }
    }
    //    https://www.codewars.com/kata/volume-of-a-cuboid/
    class Cuboid {
        public static double getVolumeOfCuboid(final double length, final double width, final double height) {
            return length * width * height;
        }
    }
    //    https://www.codewars.com/kata/jennys-secret-message
    class Greeter {
        public static String greet(String name) {
            if (name.equals("Johnny")) {
                return "Hello, my love!";
            } else return String.format("Hello, %s!", name);
        }
    }
    //    https://www.codewars.com/kata/beginner-series-number-2-clock/
    class Clock {
        public static int Past(int h, int m, int s) {
            return (h * 60 * 60 + m * 60 + s) * 1000;
        }
    }
    //    https://www.codewars.com/kata/grasshopper-debug
    class GrassHopper {
        public static String weatherInfo(double temperature) {
            final double c = (temperature - 32) * 5 / 9;
            return c + " is" + ((c > 0.0) ? (" above ") : " ") + "freezing temperature";
        }
    }
}