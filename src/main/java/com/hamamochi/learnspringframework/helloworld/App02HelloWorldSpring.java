package com.hamamochi.learnspringframework.helloworld;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hamamochi.learnspringframework.game.GameRunner;
import com.hamamochi.learnspringframework.game.MarioGame;
import com.hamamochi.learnspringframework.game.PacManGame;
import com.hamamochi.learnspringframework.game.SuperContraGame;

public class App02HelloWorldSpring {

	public static void main(String[] args) {

		// 1: Launch a Spring Context

		try (var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {
			// 2: Configure the things that we want Spring to manage - @Configuration
			// HelloWorldConfiguration - @Configuration
			// name - @Bean

			// 3: Retrieving Beans managed by Spring
			System.out.println(context.getBean("name"));
			System.out.println(context.getBean("age"));
			System.out.println(context.getBean("person"));
			System.out.println(context.getBean("person2MethodCall"));
			System.out.println(context.getBean("person3Parameters"));
			System.out.println(context.getBean("address2"));
			System.out.println(context.getBean(Person.class));
			System.out.println(context.getBean(Address.class));
			System.out.println(context.getBean("person5Qualifier"));

//			String[] beanDefination = context.getBeanDefinitionNames();
//			List<String> beanList = new ArrayList<>(Arrays.asList(beanDefination));
//			beanList.forEach(System.out::println);
		}

	}

}
