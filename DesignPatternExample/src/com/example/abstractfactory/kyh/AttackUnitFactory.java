package com.example.abstractfactory.kyh;

/**
 * 공격유닛 객체를 생산하는 추상 팩토리 클래스
 * 
 * @author bluepoet
 * 
 */
public abstract class AttackUnitFactory {

	abstract AttackUnit createAttackPeople();

	abstract AttackUnit createAttackMachine();

	static AttackUnitFactory getFactory(String type) {
		if (type.equals("single")) {
			return new SingleAttackUnitFactory();
		}

		return new MultiAttackUnitFactory();
	}
}