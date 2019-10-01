package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        Algorithm:
        1. This program performs arithmetic operations(+,-,*,/) between two complex numbers and displays them.
        2. Ask user to enter the imaginary and real part of first complex number and save.
        3. Ask user to enter the imaginary and real part of second complex number and save.
        4. display the complex numbers entered by the user.
        5. call a method to perform addition between the two complex numbers and display result.
        6. call a method to perform subtraction between the two complex numbers and display result.
        7. call a method to perform multiplication between the two complex numbers and display result.
        8. call a method to perform division between the two complex numbers and display result.

         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("A complex number is defined as z=a+i*b, where a is the real part, and b is the imaginary part.");
        System.out.println("This programs performs four arithmetic operations (+,-,*,/) on two complex numbers and displays the result."); //displays initial message

        System.out.println("\nEnter the real part of the 1st complex number:");         //enter first complex number
        double a1= scanner.nextDouble();
        System.out.println("Enter the imaginary part of the 1st complex number:");
        double b1= scanner.nextDouble();

        System.out.println("\nEnter the real part of the 2nd complex number:");         //enter second complex number
        double a2= scanner.nextDouble();
        System.out.println("Enter the imaginary part of the 2nd complex number:");
        double b2= scanner.nextDouble();

        System.out.println("\nThe two complex numbers z1 and z2 entered are: ");       //displays complex numbers entered
        System.out.println("z1 = "+a1+" + i"+b1);
        System.out.println("z2 = "+a2+" + i"+b2);
        System.out.println("\nArithmetic Operations: ");

        addition(a1,a2,b1,b2 );            //calls 4 methods
        subtraction(a1,a2,b1,b2 );
        multiplication(a1,a2,b1,b2 );
        division(a1,a2,b1,b2 );

    }
    public static void addition(double a1, double a2, double b1,double b2){  //calculates addition
        double x1= (a1+a2);
        double x2= (b1+b2);
        System.out.println("z1 + z2 = "+x1+" + i"+x2);
    }
    public static void subtraction(double a1, double a2, double b1,double b2){ //calculates subtraction
        double x1= (a1-a2);
        double x2= (b1-b2);
        System.out.println("z1 - z2 = "+x1+" + i"+x2);
    }
    public static void multiplication(double a1, double a2, double b1,double b2){  //calculates multiplication
        double x1= ((a1*a2) - (b1*b2));
        double x2= ((a1*b2) + (b1*a2));
        System.out.println("z1 x z2 = "+x1+" + i"+x2);
    }
    public static void division(double a1, double a2, double b1,double b2){   //calculates division
        double x1= (a1*a2 +b1*b2)/(Math.pow(a2,2) + Math.pow(b2,2));
        double x2= ((b1*a2) - (a1*b2)/(Math.pow(a2,2) + Math.pow(b2,2)) );
        System.out.println("z1/z2 = "+x1+" + i"+x2);
    }

}
