package com.cognizant.springlearn;

import java.util.ArrayList;
import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringHandson2Application {
	public static void main(String[] args) {
		SpringApplication.run(SpringHandson2Application.class, args);

	}

	public Country displayCountry() {
		ApplicationContext context = new ClassPathXmlApplicationContext("india.xml");
		Country country = (Country) context.getBean("in");
		return country;
	}

	public List<Country> displayCountries() {
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		ArrayList<Country> list = (ArrayList<Country>) context.getBean("countryList");
		return list;

	}

}

