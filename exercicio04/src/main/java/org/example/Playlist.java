package org.example;

import java.util.List;

public class Playlist {
    private String name;
    private List<Song> songs;

    public Playlist(String name, List<Song> songs) {
        this.name = name;
        this.songs = songs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

    public void addSong(Song song) {
        if (this.songs.contains(song)) {
            System.out.println("This song is already in the playlist.");
        } else {
        this.songs.add(song);
        }
    }
}
