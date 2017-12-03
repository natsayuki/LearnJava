package com.company;

public class Main {

    public static void main(String[] args) {
        String name = "name";
        displayHighScore(name, calculateHighScorePosition(1500));
        displayHighScore(name, calculateHighScorePosition(900));
        displayHighScore(name, calculateHighScorePosition(400));
        displayHighScore(name, calculateHighScorePosition(50));
    }
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }
        return -1;
    }
    public static void displayHighScore(String name, int pos) {
        System.out.println(name + " got into " + pos + " place.");
    }
    public static int calculateHighScorePosition(int score) {
        if(score >= 1000)
            return 1;
        else if(score >= 500 && score < 1000)
            return 2;
        else if(score >= 100 && score < 500)
            return 3;
        else
            return 4;
    }
}
