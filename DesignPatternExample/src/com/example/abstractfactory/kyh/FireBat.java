package com.example.abstractfactory.kyh;

public class FireBat extends AttackUnit {

	@Override
	String getName() {
		return "나는 파이어뱃입니다";
	}

	@Override
	String attack() {
		return "나는 불로 공격합니다";
	}

}
