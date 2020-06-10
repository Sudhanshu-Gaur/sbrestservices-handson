package com.cognizant.springlearn;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringLearnApplication2 {
	
	public static void main(String[] args) throws ParseException {
		SpringApplication.run(SpringLearnApplication2.class, args);
		displayDate();
	}

	private static void displayDate() throws ParseException {
		// TODO Auto-generated method stub
		
		 ApplicationContext context = new ClassPathXmlApplicationContext("date-format.xml");
		 SimpleDateFormat format = context.getBean("dateFormat", SimpleDateFormat.class);
		 Date date=format.parse("31/12/2018");
		 
		 String d=format.format(date);
		   
		 
		System.out.println(d);
		
	}

}
