package com.company;

public class Main {

    // create the score variable for the game
    public static int outsideValue = 5;

    // main function of the program
    public static void main(String[] args) {
        // Output variables to the console
        System.out.println("From outside: outsideValue = " + outsideValue);
        // System.out.println("From outside: functionValue = " + functionValue);

        myFunction();
        myOtherFunction();
    }

    public static void myFunction() {
        // Create a variable inside of a function
        int functionValue = 10;

        // Output variables to the console
        System.out.println("From outside: outsideValue = " + outsideValue);
        System.out.println("From outside: functionValue = " + functionValue);
    }

    public static void myOtherFunction() {
        // Output variables to the console
        System.out.println("From outside: outsideValue = " + outsideValue);
        // System.out.println("From outside: functionValue = " + functionValue);
    }
}