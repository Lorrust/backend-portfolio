package org.example;

import java.math.BigDecimal;
import java.rmi.NoSuchObjectException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NoSuchObjectException {
        Scanner scanner = new Scanner(System.in);

        Cinema cinema = new Cinema();
        cinema.getAvailableMovies().add(new Movie("Oppenheimer", BigDecimal.valueOf(25.5), 14));
        cinema.getAvailableMovies().add(new Movie("Atlas", BigDecimal.valueOf(23.0), 15));
        cinema.getAvailableMovies().add(new Movie("Deadpool & Wolverine", BigDecimal.valueOf(29.5), 18));
        cinema.getAvailableMovies().add(new Movie("The Astronaut", BigDecimal.valueOf(21.0), 10));
        cinema.getAvailableMovies().add(new Movie("The Man Who Knew Infinity", BigDecimal.valueOf(26.0), 12));

        System.out.println("Available Movies\n");
        cinema.getAvailableMovies().forEach(System.out::println);
        System.out.println("\nWhich movie would you like to watch?");
        String movieName = scanner.nextLine();
        System.out.println("Which seat would you like between A1 and F5?");
        SeatsEnum seat = SeatsEnum.valueOf(scanner.nextLine().toUpperCase());
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("How old are you?");
        Integer age = scanner.nextInt();

        Client client = new Client(name, age);

        Movie movie = cinema.searchMovie(movieName);

        try {
            Ticket ticket = new Ticket(client, movie, seat, movie.getOccupiedSeats());
            System.out.println("Sucessfully bought ticket for " + movie.getTitle() + ", seat " + seat + ".");
            movie.getOccupiedSeats().add(seat);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}