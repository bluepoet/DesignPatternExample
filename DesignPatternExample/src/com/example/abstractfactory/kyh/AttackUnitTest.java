package com.example.abstractfactory.kyh;

public class AttackUnitTest {
	public static void main(String[] args) {
		if (args.length < 1) {
			throw new IllegalArgumentException("실행시 인자값이 필요합니다");
		}

		AttackUnitFactory factory = AttackUnitFactory.getFactory(args[0]);

		AttackUnit peopleAttackUnit = factory.createAttackPeople();
		AttackUnit machineAttackUnit = factory.createAttackMachine();

		System.out.println("공격하는 사람 : " + peopleAttackUnit.getName() + " " + peopleAttackUnit.attack());
		System.out.println("공격하는 기계 : " + machineAttackUnit.getName() + " " + machineAttackUnit.attack());
	}
}
