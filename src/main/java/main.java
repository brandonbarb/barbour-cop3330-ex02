/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Brandon Barbour
 */

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("What is the input string?");
        Scanner input = new Scanner(System.in);
        String string = input.next();
        int length = string.length();
        System.out.println(string + " has " + length + " characters.");
    }
}
