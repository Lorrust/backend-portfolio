package org.example;

import java.util.ArrayList;

public class Ticket {
    private Client client;
    private Movie movie;
    private SeatsEnum seat;

    public Ticket(Client client, Movie movie, SeatsEnum seat, ArrayList<SeatsEnum> occupiedSeats) {
        if (client.getAge() < movie.getMinAge()) {
            throw new IllegalArgumentException("Idade deve ser maior ou igual a " + movie.getMinAge());
        }
        if (occupiedSeats.contains(seat)) {
            throw new IllegalArgumentException("Seat unavailable");
        }

        this.client = client;
        this.movie = movie;
        this.seat = seat;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public SeatsEnum getSeat() {
        return seat;
    }

    public void setSeat(SeatsEnum seat) {
        this.seat = seat;
    }
}
