// Java program to demonstrate return statement
package com.returnstatement;

// Main class
public class Main {

    // Method main to run java program
    public static void main(String[] args) {

        // Creating boolean variable to always pass condition
        boolean b_true = true;

        System.out.println("Before the return");

        if (b_true)
            return;

        // Compiler will bypass every statement after return
        System.out.println("Will never execute");
    }
}