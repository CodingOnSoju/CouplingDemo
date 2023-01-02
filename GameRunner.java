package com.accenture.springframeworks.game;


//the GameRunner class is TIGHLTLY coupled to the MarioGame

public class GameRunner {
	//instance of MarioGame
//	MarioGame game;
	
	
	//GamingConsole uses the interface instead of the direct class
	private GamingConsole game;
	
	//instantiate the 
	public GameRunner(GamingConsole game) {
		this.game=game;
	}

	public void run() {
		System.out.println("Running Game: " + game);
		game.up();
		game.down();
		game.left();
		game.right();
		
	}

}
