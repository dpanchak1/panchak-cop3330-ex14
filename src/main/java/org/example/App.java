/*
 *  UCF COP3330 Fall 2021 Assignment 14 Solution
 *  Copyright 2021 David Panchak
 */
package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner input=new Scanner(System.in);

        System.out.print("What is the order amount? ");
        double amount=input.nextDouble();
        System.out.print("What is the state? ");
        String state=input.next();

        String output="";
        if (state.equals("WI"))
        {
            double tax=amount*.055;
            output=output+String.format("The subtotal is $%.02f.%nThe tax is $%.02f.%n",amount,tax);
            amount=amount+tax;
        }
        output=output+String.format("The total is $%.02f.",amount);
        System.out.printf("%s",output);
    }
}
