package org.example;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("What is your name? ");
        String str = scan.nextLine();
        System.out.println("Hello, " + str + ", nice to meet you!");
    }
}
