package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // Creating an array
        String[] myArray = new String [] {"Doug", "Mike", "Janet", "Matt"};
        for (String element : myArray) System.out.println(element);

        // Change an element
        myArray[0] = "Tim";
        for (String element : myArray) System.out.println(element);

        // Creating an ArrayList
        ArrayList<String> myList = new ArrayList<String>();
        myList.add("Rocket");
        myList.add("Scout");
        System.out.println(myList);

        // Looping through an ArrayList
        for (String element : myList) System.out.println(element);
        System.out.println(myList.size());

        // Inserting an element in an ArrayList
        myList.add(1,"Hoover");
        System.out.println(myList);

        // Remove elements by value from an ArrayList
        myList.remove("Scout");
        System.out.println(myList);

        // Remove elements by index number from an ArrayList
        myList.remove(1);
        System.out.println(myList);
    }
}
