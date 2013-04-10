package com.example.builder;

public class ScienceFacilityBuilder implements Builder {
	private ScienceFacility scienceFacility;
	
	ScienceFacilityBuilder() {
		scienceFacility = new ScienceFacility();
	}
	
	@Override
	public void buildPreviousBuildings() {
		scienceFacility.addPreviousBuilding(new Factory());
		scienceFacility.addPreviousBuilding(new StarPort());
	}

	@Override
	public String getPreviousBuildingsDescription() {
		return scienceFacility.descriptionPreviousBuildings();
	}
}
