package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        MusicCloud musicCloud = new MusicCloud(new ArrayList<>());

        musicCloud.getAvailableSongs().add(new Song("give it back", "Cö Shu Nie"));
        musicCloud.getAvailableSongs().add(new Song("Moonlight Sonata", "Ludwig van Beethoven"));
        musicCloud.getAvailableSongs().add(new Song("Let You Down", "Dawid Podsiadło"));
        musicCloud.getAvailableSongs().add(new Song("Shape of You", "Ed Sheeran"));
        musicCloud.getAvailableSongs().add(new Song("Clair de Lune", "Johann Debussy"));
        musicCloud.getAvailableSongs().add(new Song("Blinding Lights", "The Weeknd"));
        musicCloud.getAvailableSongs().add(new Song("Sweden", "C418"));
        musicCloud.getAvailableSongs().add(new Song("The Most Beautiful Thing", "Bruno Major"));
        musicCloud.getAvailableSongs().add(new Song("Bohemian Rhapsody", "Queen"));
        musicCloud.getAvailableSongs().add(new Song("Titanium", "David Guetta ft. Sia"));
        musicCloud.getAvailableSongs().add(new Song("Smells Like Teen Spirit", "Nirvana"));
        musicCloud.getAvailableSongs().add(new Song("Lofi Chill", "Kuma"));
        musicCloud.getAvailableSongs().add(new Song("Hotel California", "Eagles"));

        System.out.println("Welcome to MusicCloud!");
        System.out.print("Enter the name of the playlist: ");
        String playlistName = scanner.nextLine();

        Playlist playlist = new Playlist(playlistName, new ArrayList<>());

        boolean addSong = true;
        System.out.println("Now let's add some music to your playlist. Type 'all' to see available songs or 'done' to complete your playlst.");
        while (addSong) {
            System.out.print("Enter the name of the song: ");
            String songName = scanner.nextLine();
            if (songName.equals("done")) {
                addSong = false;
            } else if (songName.equals("all")) {
                musicCloud.getAvailableSongs().forEach(System.out::println);

            }
            else {
                try {
                    Song song = musicCloud.searchSong(songName);
                    playlist.addSong(song);
                    System.out.println(song + " was added to playlist.");
                } catch (IllegalArgumentException e) {
                    System.out.println("Song not found.");
                }
            }

        }

        System.out.println("Your playlist is ready.\n");
        System.out.println(playlist.getName());
        playlist.getSongs().forEach(System.out::println);

    }
}