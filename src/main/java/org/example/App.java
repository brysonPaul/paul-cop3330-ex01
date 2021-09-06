/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Bryson Paul
 */
package org.example;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("What is your name? ");
        String str = scan.nextLine();
        str = "Hello, " + str + ", nice to meet you!";
        System.out.println(str);
    }
}
