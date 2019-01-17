package com.company;

public class Main {

    public static void main(String[] args) {
        final double DELTA = 0.001;
	    String firstName = "John";
	    String last = "Doe";
	    printName(firstName, last);
	    System.out.println(last);

	    int x = 7;
	    int y = 8;
	    int z;

	    z = multiply(x, y);
	    System.out.println(z);

	    double number1 = 5.2;
	    double number2 = 7.3;
	    double number3 = 5.2;

	    System.out.printf("%f and %f are equal: %b \n", number1, number2, isEqual(number1, number2, DELTA));
        System.out.printf("%f and %f are equal: %b \n", number1, number3, isEqual(number1, number3, DELTA));
        System.out.printf("%f and %f are equal: %b \n", 0.1, 0.8, isEqual(0.1, .8, DELTA));
        System.out.printf("%f and %f are equal: %b \n", 0.1 + 0.7, 0.8, isEqual(0.1 + 0.7, .8, DELTA));
        System.out.printf("%f and %f are equal: %b \n", 0.8,0.1 + 0.7, isEqual(.8,0.1 + 0.7, DELTA));

        System.out.println(.1 + .7);
        System.out.println(isEqual(3.,3.00001,DELTA));
        System.out.println(isEqual(.3,3.00001,DELTA));

    }

    public static boolean isEqual(double x, double y, double epsilon){
        boolean result;

        result = Math.abs(x-y) < epsilon;

        return result;
    }

    public static int multiply(int p, int q){
        int result = p * q;
        return result;
    }

    public static void printName(String first, String last){
        last = "Smith";
        System.out.printf("%s, %s\n", last, first);
    }

}
