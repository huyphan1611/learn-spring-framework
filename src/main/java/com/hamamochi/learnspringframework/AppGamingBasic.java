package com.hamamochi.learnspringframework;

import com.hamamochi.learnspringframework.game.GameRunner;
import com.hamamochi.learnspringframework.game.MarioGame;
import com.hamamochi.learnspringframework.game.PacManGame;
import com.hamamochi.learnspringframework.game.SuperContraGame;

public class AppGamingBasic {

	public static void main(String[] args) {
//		var game = new MarioGame();
//		var game = new SuperContraGame();
		var game = new PacManGame(); // 1: Object creation
		
		var gameRunner = new GameRunner(game); 
			// 2: Object creation + Wiring of Dependencies
			// game is dependency of GameRunner class
		gameRunner.run();

	}

}
