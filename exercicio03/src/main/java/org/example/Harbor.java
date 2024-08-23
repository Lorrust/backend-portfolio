package org.example;

import java.util.ArrayList;
import java.util.List;

public class Harbor {
    String name;
    List<Boat> dockedBoats;

    public void dockBoat(Boat boat) {
        dockedBoats.add(boat);
        System.out.println(boat.name + " (" + boat.size + ")" + " has docked at " + this.name + ".");
    }

    public void undockBoat(Boat boat) {
        dockedBoats.remove(boat);
        System.out.println(boat.name + " (" + boat.size + ")" + " has docked at " + this.name + ".");
    }

    public Harbor(String name) {
        this.name = name;
        this.dockedBoats = new ArrayList<>();
    }
}
