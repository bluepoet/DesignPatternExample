package com.example.builder;

public class BuilderPatternTest {
	
	public static void main(String[] args) {
		Builder builder = new ScienceFacilityBuilder();
		
		Director director = new Director(builder);
		
		director.constructAllPreviousBuildings();
		
		System.out.println(director.getPreviousBuildingsDescription());
	}
}
