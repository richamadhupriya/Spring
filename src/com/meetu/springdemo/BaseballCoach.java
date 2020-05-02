package com.meetu.springdemo;


public class BaseballCoach implements Coach {
	
	private DietService dietService;
	private String team;
	private String email;

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	@Override
	public String getDailyWorkout() {
		return "baseball";
	}

	@Override
	public String getDailyDiets() {
		return dietService.getDiet();
	}	

	public void setDietService(DietService dietService) {
		this.dietService = dietService;
	}
	
	public void display() {
		System.out.println(team + " - " + email);
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
