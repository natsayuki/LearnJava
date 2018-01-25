package com.company;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    Player player1 = new Player("Player 1");
	    Player player2 = new Player("Player 2");

	    Team<Player> team1 = new Team("Team 1");
	    Team<Player> team2 = new Team("Team 2");

	    team1.addPlayer(player1);
	    team2.addPlayer(player2);

	    League league = new League("League");

	    league.addTeam(team1);
	    league.addTeam(team2);

        team1.scoreMatch(team2, 0, 1);

        LinkedList ranks = league.rank();

    }
}
