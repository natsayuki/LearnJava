package com.company;


import java.util.Collections;
import java.util.LinkedList;

public class Team<T extends Player> implements Comparable<Team<T>> {
    private LinkedList<T> players = new LinkedList<>();
    private String name;
    private int wins;
    private int ties;
    private int losses;

    public Team(String name) {
        this.name = name;
    }

    public void addPlayer(T player){
        this.players.add(player);
    }

    public LinkedList<T> getPlayers() {
        return players;
    }

    public String getName() {
        return name;
    }

    public void scoreMatch(Team<T> team, int ourScore, int theirScore){
        if(ourScore > theirScore){
            this.wins++;
        }else if(ourScore == theirScore){
            this.ties++;
        }else{
            this.losses++;
        }

        if(team != null){
            team.scoreMatch(null, theirScore, ourScore);
        }
    }

    public int rank(){
        return (this.wins*2) + this.ties;
    }

    @Override
    public int compareTo(Team<T> team) {
        if(this.rank() > team.rank()){
            return -1;
        }else if(this.rank() < team.rank()){
            return 1;
        }else{
            return 0;
        }
    }
}
