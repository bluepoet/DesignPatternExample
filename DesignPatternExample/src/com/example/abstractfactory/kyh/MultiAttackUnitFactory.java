package com.example.abstractfactory.kyh;

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
