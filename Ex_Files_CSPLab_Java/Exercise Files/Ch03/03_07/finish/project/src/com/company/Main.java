package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // Create an array
        String[] myArray = new String[] {"Doug", "Mike", "Janet", "Matt"};

        // Output a single element of the array
        System.out.println(myArray[0]);

        // This will generate an exception since element 4 doesn't exist in the array
        //System.out.println(myArray[4]);
    }
}
