package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Playlist {
    private LinkedList<Album> albumlist = new LinkedList<Album>();
    private LinkedList<String> playlist = new LinkedList<String>();

    public void addAlbum(Album album){
        ArrayList<String> songs = album.getSongs();
        for(int i = 0; i<songs.size(); i++){
            this.playlist.add(songs.get(i));
            System.out.println("added " + songs.get(i) + " to playlist");
        }
    }

    public void start(){
        System.out.println("Starting playlist");
        Scanner scanner = new Scanner(System.in);
        ListIterator<String> playlistIterator = playlist.listIterator();
        boolean quit = false;
        while(!quit){
            System.out.println("What do you want to do?");
            String answer = scanner.next();
            scanner.nextLine();
            switch(answer){
                case "next":
                    if(playlistIterator.hasNext()){
                        System.out.println("Now playing " + playlistIterator.next());
                    }else{
                        System.out.println("end of playlist");
                    }
                    break;
                case "previous":
                    if(playlistIterator.hasPrevious()){
                        playlistIterator.previous();
                        System.out.println("Now playing " + playlistIterator.previous());
                    }else{
                        System.out.println("Beginning of playlist");
                        playlistIterator.next();
                    }
                    break;
                case "repeat":
                    playlistIterator.previous();
                    System.out.println("Now replaying " + playlistIterator.next());
                    break;
                case "stop":
                    System.out.println("Stopping");
                    quit = true;
                    break;
            }
        }
    }
}
