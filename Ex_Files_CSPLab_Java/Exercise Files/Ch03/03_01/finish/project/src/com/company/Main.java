package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.print("Enter your name: ");

        Scanner in = new Scanner(System.in);
        String name = in.next();

        String greeting = "Hello, " + name + "!";
        System.out.println(greeting);
    }
}
