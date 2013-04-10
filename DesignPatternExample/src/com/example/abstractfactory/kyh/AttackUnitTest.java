package com.example.abstractfactory.kyh;

public class AttackUnitTest {
	public static void main(String[] args) {
		if (args.length < 1) {
			throw new IllegalArgumentException("����� ���ڰ��� �ʿ��մϴ�");
		}

		AttackUnitFactory factory = AttackUnitFactory.getFactory(args[0]);

		AttackUnit peopleAttackUnit = factory.createAttackPeople();
		AttackUnit machineAttackUnit = factory.createAttackMachine();

		System.out.println("�����ϴ� ��� : " + peopleAttackUnit.getName() + " " + peopleAttackUnit.attack());
		System.out.println("�����ϴ� ��� : " + machineAttackUnit.getName() + " " + machineAttackUnit.attack());
	}
}
