package com.example.abstractfactory;

public class Marine extends AttackUnit {

	@Override
	String getName() {
		return "나는 마린입니다";
	}

	@Override
	String attack() {
		return "나는 총으로 공격한다";
	}

}
