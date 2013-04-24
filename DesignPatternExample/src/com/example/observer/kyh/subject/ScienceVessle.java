package com.example.observer.kyh.subject;

import java.util.List;

import com.example.observer.kyh.observer.DefenseUnit;
import com.google.common.collect.Lists;

public class ScienceVessle implements AttackUnit {
	private List<DefenseUnit> defenseUnits;
	private ScienceVessleAttackType attackType;

	public ScienceVessle() {
		this.defenseUnits = Lists.newArrayList();
	}

	@Override
	public void notifyDefenseUnit(ScienceVessleAttackType attackType) {
		for (DefenseUnit defenseUnit : defenseUnits) {
			defenseUnit.action(attackType);
		}
	}

	@Override
	public void registerDefenseUnit(DefenseUnit defenseUnit) {
		defenseUnits.add(defenseUnit);
		System.out.println("[" + defenseUnit.toString() + "]���̾� ���� ���ݿ� ���� �������� �����Ͽ����ϴ�.");
	}

	@Override
	public void removeDefenseUnit(DefenseUnit defenseUnit) {
		defenseUnits.remove(defenseUnit);
		System.out.println("[" + defenseUnit.toString() + "]���̾� ���� ���ݿ� ���� �������� �����Ͽ����ϴ�.");
	}

	public void changeAttackType(ScienceVessleAttackType attackType) {
		display(attackType);
		notifyDefenseUnit(attackType);
	}

	public void display(ScienceVessleAttackType attackType) {
		System.out.println();

		System.out.println("=======================================");

		switch (attackType) {
		case RADIOACTIVITY:
			System.out.println("���̾𽺺����� �̷�����Ʈ�� �����մϴ�.");
			break;
		case MATRIX:
			System.out.println("���̾𽺺����� ����ú� ��Ʈ������ �����մϴ�.");
			break;
		case EMP:
			System.out.println("���̾𽺺����� EMP ��ũ���̺긦 �����մϴ�.");
			break;
		default:
			break;
		}
	}

	public enum ScienceVessleAttackType {
		RADIOACTIVITY("����"), MATRIX("����ú� ��Ʈ����"), EMP("��ũ���̺�");

		private String type;

		ScienceVessleAttackType(String type) {
			this.type = type;
		}

		public String getType() {
			return type;
		}
	}
}