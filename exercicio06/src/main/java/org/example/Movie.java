package org.example;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Movie {
    private String title;
    private BigDecimal price;
    private Integer minAge;
    private ArrayList<SeatsEnum> occupiedSeats;

    public Movie(String title, BigDecimal price, Integer minAge) {
        this.title = title;
        this.price = price;
        this.minAge = minAge;
        this.occupiedSeats = new ArrayList<>();
    }

    public ArrayList<SeatsEnum> getOccupiedSeats() {
        return occupiedSeats;
    }

    public void setOccupiedSeats(ArrayList<SeatsEnum> occupiedSeats) {
        this.occupiedSeats = occupiedSeats;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getMinAge() {
        return minAge;
    }

    public void setMinAge(Integer minAge) {
        this.minAge = minAge;
    }

    @Override
    public String toString() {
        return title + ", $" + price + " (" + minAge + " Years)";
    }
}
