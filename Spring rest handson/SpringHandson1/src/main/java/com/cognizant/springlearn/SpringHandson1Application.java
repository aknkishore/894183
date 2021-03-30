package com.cognizant.springlearn;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

@SpringBootApplication
@ImportResource({"classpath:Country.xml"})
public class SpringHandson1Application {

	
	public static void main(String[] args) {
		SpringApplication.run(SpringHandson1Application.class, args);
		displayCountry();
		displayCountries();
		
		}
	
	public static void displayCountry() {
		
		
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");

		Country country = context.getBean("country", Country.class);
		Country anotherCountry = context.getBean("country", Country.class);
		
		System.out.println("Handson(1)");
		System.out.println(country);
		System.out.println("Handson(2)");
		System.out.println(anotherCountry);
	}
	
	
	public static void displayCountries() {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");

		@SuppressWarnings("unchecked")
		List<Country> list= (List<Country>)context.getBean("countryList");
		System.out.println("Handson(3)");
		for (Country country : list) {
			System.out.println(country);
		}
		
	}

}