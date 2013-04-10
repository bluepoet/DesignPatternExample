package com.example.abstractfactory.kyh;

public class Vulture extends AttackUnit {

	@Override
	String getName() {
		return "나는 벌쳐입니다";
	}

	@Override
	String attack() {
		return "나는 콩알탄으로 공격합니다.";
	}

}
