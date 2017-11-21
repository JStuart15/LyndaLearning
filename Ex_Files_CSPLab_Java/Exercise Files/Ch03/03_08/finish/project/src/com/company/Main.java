package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String[] myArray = new String[] {"Doug", "Mike", "Janet", "Matt"};

        // Looping through an array with a for loop
        for (int i = 0; i < myArray.length; i++)
        {
            System.out.println("Hello, " + myArray[i]);
        }

        // Looping through an array with a for each loop
        for (String element : myArray)
        {
            System.out.println("Good bye, " + element);
        }
    }
}
