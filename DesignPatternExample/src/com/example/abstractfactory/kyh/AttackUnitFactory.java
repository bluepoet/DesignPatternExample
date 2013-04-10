package com.example.abstractfactory.kyh;

/**
 * �������� ��ü�� �����ϴ� �߻� ���丮 Ŭ����
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