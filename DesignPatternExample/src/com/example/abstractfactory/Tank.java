package com.example.abstractfactory;

public class Tank extends AttackUnit {

	@Override
	String getName() {
		return "나는 탱크입니다";
	}

	@Override
	String attack() {
		return "나는 대포로 공격합니다";
	}

}
