package com.cognizant.springlearn;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringLearnApplication6 {
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(SpringLearnApplication4.class, args);
		displayCountry(); 
	}
	private static void displayCountry() {
		// TODO Auto-generated method stub
		LOGGER.info("START");
		ApplicationContext context = new ClassPathXmlApplicationContext("country3.xml");
		List<Country> countryList=(List<Country>)context.getBean("countryList");
		LOGGER.debug("Country : {}", countryList.toString());
		LOGGER.info("END");
	}

	

}
