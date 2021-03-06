package com.example.builder.kyh;

public class Director {
	private Builder builder;

	public Director(Builder builder) {
		this.builder = builder;
	}

	public void constructAllPreviousBuildings() {
		builder.buildPreviousBuildings();
	}

	public String getPreviousBuildingsDescription() {
		return builder.getPreviousBuildingsDescription();
	}
}
