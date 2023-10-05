package com.pluralsight;
import java.util.Scanner;
public class BasicCalculator {
    public static void main(String []args){
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Enter a first number : ");
            int num1 = myScanner.nextInt();
        System.out.print("Enter a second number : ");
            int num2 = myScanner.nextInt();
        System.out.print("Choose from the following options :  + (Add), - (Subtract), * (Multiply), / (Divide) : ");
            String choice = myScanner.next();

        System.out.print("Here is your problem: " + num1 + " " + choice + " " + num2 + " = JUST KIDDING HAHA YOU DO IT! " );

    }
}
