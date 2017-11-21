package com.company;

public class Main {

    // create the score variable for the game
    public static int myScore;

    // main function of the program
    public static void main(String[] args) {
        // Create a variable
        myScore = 1000;
        changeScore();
    }

    // change the score of the game and output to the console
    public static void changeScore() {
        myScore = myScore + 100;
        System.out.println("Player score: " + myScore);
    }
}
