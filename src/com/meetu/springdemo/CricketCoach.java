package com.meetu.springdemo;

public class CricketCoach implements Coach {
	
	private DietService dietService;
	
	public CricketCoach(DietService dietService) {
		this.dietService = dietService;
	}


	@Override
	public String getDailyWorkout() {
		return "criccket coach";
	}


	@Override
	public String getDailyDiets() {
		return this.dietService.getDiet();
	}

}
