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
		System.out.println("[" + defenseUnit.toString() + "]사이언스 베슬 공격에 대한 옵저빙을 시작하였습니다.");
	}

	@Override
	public void removeDefenseUnit(DefenseUnit defenseUnit) {
		defenseUnits.remove(defenseUnit);
		System.out.println("[" + defenseUnit.toString() + "]사이언스 베슬 공격에 대한 옵저빙을 중지하였습니다.");
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
			System.out.println("사이언스베슬이 이레데이트를 쓰려합니다.");
			break;
		case MATRIX:
			System.out.println("사이언스베슬이 디펜시브 매트릭스를 쓰려합니다.");
			break;
		case EMP:
			System.out.println("사이언스베슬이 EMP 쇼크웨이브를 쓰려합니다.");
			break;
		default:
			break;
		}
	}

	public enum ScienceVessleAttackType {
		RADIOACTIVITY("방사능"), MATRIX("디펜시브 매트릭스"), EMP("쇼크웨이브");

		private String type;

		ScienceVessleAttackType(String type) {
			this.type = type;
		}

		public String getType() {
			return type;
		}
	}
}