package org.example;

import java.rmi.NoSuchObjectException;
import java.util.ArrayList;

public class Cinema {
    private ArrayList<Movie> availableMovies;
    private ArrayList<Ticket> soldTickets;

    public Movie searchMovie(String title) throws NoSuchObjectException {
        for (Movie movie : availableMovies) {
            if (movie.getTitle().toLowerCase().contains(title.toLowerCase())) {
                return movie;
            }
        }
        throw new NoSuchObjectException("Movie not found");
    }

    public Cinema() {
        availableMovies = new ArrayList<Movie>();
        soldTickets = new ArrayList<Ticket>();
    }

    public ArrayList<Movie> getAvailableMovies() {
        return availableMovies;
    }

    public void setAvailableMovies(ArrayList<Movie> availableMovies) {
        this.availableMovies = availableMovies;
    }

    public ArrayList<Ticket> getSoldTickets() {
        return soldTickets;
    }

    public void setSoldTickets(ArrayList<Ticket> soldTickets) {
        this.soldTickets = soldTickets;
    }
}
