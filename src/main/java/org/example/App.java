/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Nikolai Coletta
 */
package org.example;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        System.out.print( "Enter the principal: " );
        int P = Integer.parseInt( scan.nextLine() );
        System.out.print( "Enter the rate of interest: " );
        double r = Double.parseDouble( scan.nextLine() );
        System.out.print( "Enter the number of years: " );
        int t = Integer.parseInt( scan.nextLine() );

        double A = P * (1 + (r/100.0) * t);

        System.out.println( "After " + t + " years at " + r + "%, the investment will be worth $" + String.format("%.2f", A) + ".");
    }
}
