package com.example.abstractfactory;

public class MultiAttackUnitFactory extends AttackUnitFactory {

	@Override
	AttackUnit createAttackPeople() {
		return new FireBat();
	}

	@Override
	AttackUnit createAttackMachine() {
		return new Tank();
	}
}
