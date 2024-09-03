package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to SocialPlatform!\nEnter the details of your post below.");
        System.out.print("Title: ");
        String title = scanner.nextLine();
        System.out.print("Description: ");
        String description = scanner.nextLine();
        System.out.print("Type (text/image/video): ");
        String type = scanner.nextLine();

        Post post = new Post(title, description, TypeEnum.valueOf(type.toUpperCase()));

        MyBook myBook = new MyBook();
        try {
        myBook.sharePost(post);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        Photogram photogram = new Photogram();
        try {
            photogram.shareImage(post);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        AnyTube anyTube = new AnyTube();
        try {
            anyTube.shareVideo(post);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}