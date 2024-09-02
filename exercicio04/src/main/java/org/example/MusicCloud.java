package org.example;

import java.util.LinkedList;
import java.util.List;

public class MusicCloud {
    private List<Song> availableSongs;

    public MusicCloud(List<Song> availableSongs) {
        this.availableSongs = availableSongs;
    }

    public List<Song> getAvailableSongs() {
        return availableSongs;
    }

    public void setAvailableSongs(List<Song> availableSongs) {
        this.availableSongs = availableSongs;
    }
}
