package com.cognizant.springlearn;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringLearnApplication4 {
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(SpringLearnApplication4.class, args);
		displayCountry(); 
	}
	private static void displayCountry() {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		Country country=(Country)context.getBean("country");
		
		String count=country.toString();
		LOGGER.debug("country",count);
		LOGGER.debug("Country : {}", country.toString());
	}

	

}
