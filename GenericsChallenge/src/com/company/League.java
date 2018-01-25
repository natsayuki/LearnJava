package com.company;

import java.util.Collections;
import java.util.LinkedList;

public class League<T extends Team> {
    private String name;
    private LinkedList<T> teams = new LinkedList<>();

    public League(String name) {
        this.name = name;
    }

    public void addTeam(T team){
        this.teams.add(team);
    }

    public LinkedList<T> rank(){
        Collections.sort(teams);
        for(T team: this.teams){
            System.out.println(team.getName());
        }
        return this.teams;
    }
}
