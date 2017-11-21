package com.company;

public class Main {

    // create the score variable for the game
    public static int myScore;

    // main function of the program
    public static void main(String[] args) {
        // Create a variable
        myScore = 1000;
        System.out.println("Setting the score to : " + myScore);
        displayScore();
        changeScore(100);
        changeScore(50);
        changeScore(-250);
        changeScore(125);
    }

    // change the score of the game and output to the console
    public static void changeScore(int scoreDelta) {
        System.out.println("Changing the score by: " + scoreDelta);
        myScore = myScore + scoreDelta;
        displayScore();
    }

    public static void displayScore() {
        System.out.println("Player score: " + myScore);
    }
}
