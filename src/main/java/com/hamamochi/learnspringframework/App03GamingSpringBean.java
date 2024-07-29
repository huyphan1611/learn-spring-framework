package com.hamamochi.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hamamochi.learnspringframework.game.GameRunner;
import com.hamamochi.learnspringframework.game.GamingConsole;

public class App03GamingSpringBean {

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)) {
			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
		}

	}

}
