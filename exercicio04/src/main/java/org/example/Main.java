package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Song> songs = new ArrayList<>();
        songs.add(new Song("give it back", "Cö Shu Nie"));
        songs.add(new Song("Let You Down", "Dawid Podsiadło"));
        songs.add(new Song("Clair de Lune", "Johann Debussy"));
        songs.add(new Song("Sweden", "C418"));
        songs.add(new Song("The Most Beautiful Thing", "Bruno Major"));

        MusicCloud musicCloud = new MusicCloud(songs);
        System.out.println(musicCloud.getAvailableSongs());


    }
}