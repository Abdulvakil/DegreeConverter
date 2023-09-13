package com.Abdulvakil;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Please enter the number of degrees in Celsius: ");
        double c = scn.nextDouble();

        double f = ((9 * c)/5) + 32;

        System.out.println(c + "C is " + f + "F.");

    }
}
