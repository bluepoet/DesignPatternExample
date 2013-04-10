package com.example.builder.kyh;

import java.util.List;

import com.google.common.collect.Lists;

/**
 * �׶����� ������ ������ �����ϴ� ���̾� �۽Ǹ�Ƽ Ŭ����
 * 
 * @author bluepoet
 * 
 */
public class ScienceFacility extends Building {
	private List<Building> previousBuildings;

	public ScienceFacility() {
		super("���̾𽺺���", "���������� ���̾� ������ �����ϴ� �ǹ��Դϴ�.");
		previousBuildings = Lists.newArrayList();
	}

	public void addPreviousBuilding(Building building) {
		previousBuildings.add(building);
	}

	public String descriptionPreviousBuildings() {
		StringBuilder builder = new StringBuilder();

		builder.append("#### ���̾� �۽Ǹ�Ƽ �Ǽ� �� ����� �� �ǹ���  ####\n");

		for (Building building : previousBuildings) {
			builder.append(building.getName() + " : "
					+ building.getDescription());
			builder.append("\n");
		}

		builder.append("#################################################");

		return builder.toString();
	}
}