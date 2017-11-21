package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code herek
        // Testing OR
        if (true || false)
        {
            System.out.println("Only one value needs to be true in an OR statement for the whole evaluation to be true");
        }

        // Testing AND
        if (true && false)
        {
            //
        } else {
            System.out.println("Both values need to be true for an AND statement to be true");
        }

        // Test if a number is between two numbers
        int myMaxLimit = 20;
        int myMinLimit = 5;

        int myValue = 10;

        if (myValue < myMaxLimit && myValue > myMinLimit)
        {
            System.out.println("The value " + myValue + " is between " + myMinLimit + " and " + myMaxLimit);
        } else {
            System.out.println("The value " + myValue + " is not between " + myMinLimit + " and " + myMaxLimit);
        }

        // Test if two numbers are between two sets of numbers
        int myMaxXLimit = 5;
        int myMinXLimit = 1;
        int myMaxYLimit = 3;
        int myMinYLimit = 1;

        int myXValue = 6;
        int myYValue = 2;

        if ( (myXValue < myMaxXLimit && myXValue > myMinXLimit) && (myYValue < myMaxYLimit && myYValue > myMinYLimit))
        {
            System.out.println("Both the X and Y values are within the limits");
        } else {
            System.out.println("One or both of the X and Y values are outside of the limits");
        }

        // Using NOT
        boolean myBoolean = false;
        if (!myBoolean)
        {
            System.out.println("NOT false is true");
        }
    }
}
