package com.hamamochi.learnspringframework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

// What is record??
// Eliminate verbosity in creating Java Beans
// Public accessor methods, construtor,
// equals, hashcode and toString are automatically created.
// Released in JDK 16

record Person(String name, int age, Address address) {
};

record Address(String firstLine, String city) {
};

@Configuration
public class HelloWorldConfiguration {

	@Bean
	public String name() {
		return "Ranga";
	}

	@Bean
	public int age() {
		return 15;
	}

	@Bean
	public Person person() {
		return new Person("Huy", 24, new Address("Quang Trung", "HCM"));
	}

	@Bean
	public Person person2MethodCall() {
		return new Person(name(), age(), address());
	}

	@Bean
	public Person person3Parameters(String name, int age, Address address3) {
		return new Person(name, age, address3);
	}

	@Bean
	@Primary
	public Person person4Parameters(String name, int age, Address address) {
		return new Person(name, age, address);
	}

	@Bean
	public Person person5Qualifier(String name, int age, @Qualifier("address3qualifier") Address address) {
		return new Person(name, age, address);
	}

	@Bean(name = "address2")
	@Primary
	public Address address() {
		return new Address("Cong Hoa", "HCM");
	}

	@Bean(name = "address3")
	@Qualifier("address3qualifier")
	public Address address3() {
		return new Address("Truong Chinh", "HCM");
	}

}
