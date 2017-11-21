package com.company;

public class Main {

    public static double subtotal;

    // main function of the program
    public static void main(String[] args) {
        subtotal = 15.00;

        System.out.println("Subtotal: " + subtotal);

        double total = subtotal + calculateTax(0.08, subtotal);

        System.out.println("Total: " + total);
    }

    public static double calculateTax(double taxRate, double amountToTax){
        double tax = amountToTax * taxRate;
        System.out.println("Tax: " + tax);
        return tax;
    }
}