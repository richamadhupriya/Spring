package com.meetu.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		//load
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve beans
//		Coach coach = context.getBean("baseballCoach", Coach.class);
		BaseballCoach coach = context.getBean("baseballCoach", BaseballCoach.class);
		
		//call bean method
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyDiets());
		coach.display();
		
		//close
		context.close();
	}

}
