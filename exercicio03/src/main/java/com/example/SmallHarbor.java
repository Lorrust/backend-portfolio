package com.example;

public class SmallHarbor extends Harbor {

    public SmallHarbor(String name) {
        super(name);
    }

    @Override
    public void dockBoat(Boat boat) {
        if (boat.size <= 10) {
            dockedBoats.add(boat);
            System.out.println(boat.name + " (" + boat.size + ")" + " has docked at " + this.name + ".");
        } else {
            System.out.println(boat.name + " is too big to dock at " + this.name + ".");
        }
    }
}
