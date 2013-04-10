package com.example.builder.kyh;

/**
 * 스타크래프트 생산건물을 표시하는 건물 클래스
 * @author bluepoet
 *
 */
public class Building {
	private String name;
	private String description; 
	
	Building(String name, String description) {
		this.name = name;
		this.description = description;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
