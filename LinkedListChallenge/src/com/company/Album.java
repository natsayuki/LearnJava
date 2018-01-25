package com.company;

import java.util.ArrayList;

public class Album {
    private ArrayList<String> songs = new ArrayList<String>();

    public Album(ArrayList<String> songs) {
        this.songs = songs;
    }

    public Album(){
        return;
    }

    public void addSong(String song){
        this.songs.add(song);
    }

    public ArrayList<String> getSongs(){
        return this.songs;
    }

    public void removeSong(String song){
        this.songs.remove(song);
    }


}
