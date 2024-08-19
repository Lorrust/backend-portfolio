package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] movies = {
                {"Men in Black", "Arrival"},
                {"Shrek", "Gladiator"}
        };

        System.out.println("Welcome to Movie Recommender!");

        System.out.println("Question 1: What is your favorite ambience?");
        System.out.println("1 - Sci-Fi");
        System.out.println("2 - Medieval");
        int ambience = scanner.nextInt();

        System.out.println("Question 2: What is your favorite genre?");
        System.out.println("1 - Comedy");
        System.out.println("2 - Drama");
        int genre = scanner.nextInt();

        System.out.println("Your recommended movie is " + movies[ambience - 1][genre - 1] + "!");

    }
}