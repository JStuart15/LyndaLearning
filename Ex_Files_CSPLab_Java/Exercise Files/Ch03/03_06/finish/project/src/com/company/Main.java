package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code herek
        // Creating a for loop
        for (int i = 0; i < 25; i++) {
            System.out.println("The square of " + i + " is " + Math.pow(i,2));
        }

        /*
        1   2   3   4   5   6   7   8   9   10  11  12
        2   4   6   8   10  12  14  16  18  20  22  24
        3   6   9   12  15  18  21  24  27  30  33  36
        etc...
        */

        // Creating a nested for loop
        for (int a = 1; a <= 12; a++) {
            String tableRow = "";

            for (int b = 1; b <= 12; b++) {
                int product = a*b;
                String productString = Integer.toString(product) + "\t";
                tableRow += productString;
            }

            System.out.println(tableRow);
        }
    }
}
