package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code herek
        // Creating a while loop
        int myValue = 0;

        // Loop to find numbers that are multiples of nine that are less than 100
        while (myValue < 100)
        {
            if (myValue % 9 == 0)
            {
                System.out.println(myValue);
            }

            myValue++;
        }

        // A do while loop that will run at least one time
        int myBadValue = 0;

        do
        {
            System.out.println("This will run at least once.");
        } while (myBadValue != 0);
    }
}
