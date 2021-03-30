package com.cognizant.springlearn;

import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@RequestMapping(method=RequestMethod.GET,value="/hello")
	public String sayHello() {
		SpringHandson2Application springrest= new SpringHandson2Application();
		return("Hello World!");
	}
	@RequestMapping(method = RequestMethod.GET,value ="/countries")			
	public List<Country> getallCountries(){
		SpringHandson2Application springrest= new SpringHandson2Application();
		return springrest.displayCountries();
	}
	@RequestMapping(method = RequestMethod.GET,value ="/country")			
	public Country getCountryIndia(){
		SpringHandson2Application springrest= new SpringHandson2Application();
		return springrest.displayCountry();
	}
}