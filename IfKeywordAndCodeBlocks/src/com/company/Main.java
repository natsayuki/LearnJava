package com.company;

public class Main {

    public static void main(String[] args) {
	    boolean gameOver = true;
	    int score = 5000;
	    int levelCompleted = 5;
	    int bonus = 100;
//	    if (score < 5000 && score > 1000) {
//			System.out.println("Your score was 5000");
//		} else if (score < 1000) {
//			System.out.println("Your score is less then 1000");
//
//		}
//
//		else {
//			System.out.println("bad");
//		}
		if(gameOver){
			int finalScore = score + (levelCompleted * bonus);
			System.out.println("final score: " + finalScore);
		}
		score = 10000;
		levelCompleted = 8;
		bonus = 200;
		if(gameOver){
			int finalScore = score + (levelCompleted * bonus);
			System.out.println("final score: " + finalScore);
		}
	}
}

