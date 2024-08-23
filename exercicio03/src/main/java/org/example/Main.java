package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Boat> boats = new ArrayList<>();
        Boat voyager = new Boat("Voyager", 5);
        boats.add(voyager);
        Boat horizon = new Boat("Horizon", 15);
        boats.add(horizon);
        Boat vortex = new Boat("Vortex", 10);
        boats.add(vortex);
        Boat eclipse = new Boat("Eclipse", 25);
        boats.add(eclipse);
        Boat breeze = new Boat("Breeze", 5);
        boats.add(breeze);

        Harbor smallHarbor = new SmallHarbor("Small Harbor");
        Harbor bigHarbor = new BigHarbor("Big Harbor");

        for (Boat boat : boats) {
            if (boat.size <= 10) {
                smallHarbor.dockBoat(boat);
            } else {
                bigHarbor.dockBoat(boat);
            }
        }

    }
}