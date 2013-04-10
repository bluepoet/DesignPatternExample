package com.example.builder.kyh;

/**
 * ��Ÿũ����Ʈ ����ǹ��� ǥ���ϴ� �ǹ� Ŭ����
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
