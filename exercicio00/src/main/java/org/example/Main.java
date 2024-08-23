package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Username Generator!");
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        int number = random.nextInt(100);
        System.out.println("Generating a random number: " + number);

        String username = firstName + lastName + number;
        System.out.println("Your username is " + username + "!");

    }
}