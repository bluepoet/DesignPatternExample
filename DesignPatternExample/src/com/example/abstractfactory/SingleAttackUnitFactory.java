package com.example.abstractfactory;

public class SingleAttackUnitFactory extends AttackUnitFactory {

	@Override
	AttackUnit createAttackPeople() {
		return new Marine();
	}

	@Override
	AttackUnit createAttackMachine() {
		return new Vulture();
	}
}
