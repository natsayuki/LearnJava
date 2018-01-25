package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Album album1 = new Album();
        album1.addSong("song1");
        album1.addSong("song2");

        Playlist playlist = new Playlist();
        playlist.addAlbum(album1);

        playlist.start();
    }
}
