package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int myVariable = 5;
        System.out.println("myVariable is equal to " + myVariable + " and is an int.");

        String myString = Integer.toString(myVariable);
        System.out.println("myString is equal to " + myString + " and is a string.");

        myString += 1;
        System.out.println("myString is equal to " + myString + " and is a string.");

        myVariable = Integer.parseInt(myString) + 1;
        System.out.println("myVariable is equal to " + myVariable + " and is an int.");

        // This next code generates an error because of the comma in the string
        //myVariable = Integer.parseInt("1,234");
        //System.out.println("myVariable is equal to " + myVariable + " and is an int.");
    }
}
