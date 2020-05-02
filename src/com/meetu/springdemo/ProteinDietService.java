package com.meetu.springdemo;

public class ProteinDietService implements DietService{
	@Override
	public String getDiet() {
		String [] diet = {"murgi ka anda","ostrich ka anda","machi ka anda"};				
		return diet[(int) Math.floor(Math.random()*diet.length)];
	}
	
	
}
