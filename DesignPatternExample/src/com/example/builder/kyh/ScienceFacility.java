package com.example.builder.kyh;

import java.util.List;

import com.google.common.collect.Lists;

/**
 * 테란종족 디텍팅 유닛을 생산하는 사이언스 퍼실리티 클래스
 * 
 * @author bluepoet
 * 
 */
public class ScienceFacility extends Building {
	private List<Building> previousBuildings;

	public ScienceFacility() {
		super("사이언스베슬", "디텍팅유닛 사이언스 베슬을 생산하는 건물입니다.");
		previousBuildings = Lists.newArrayList();
	}

	public void addPreviousBuilding(Building building) {
		previousBuildings.add(building);
	}

	public String descriptionPreviousBuildings() {
		StringBuilder builder = new StringBuilder();

		builder.append("#### 사이언스 퍼실리티 건설 전 지어야 할 건물들  ####\n");

		for (Building building : previousBuildings) {
			builder.append(building.getName() + " : "
					+ building.getDescription());
			builder.append("\n");
		}

		builder.append("#################################################");

		return builder.toString();
	}
}