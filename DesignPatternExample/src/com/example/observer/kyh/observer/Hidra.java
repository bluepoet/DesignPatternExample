package com.example.observer.kyh.observer;

import com.example.observer.kyh.subject.ScienceVessle.ScienceVessleAttackType;

public class Hidra implements DefenseUnit {
	
	@Override
	public String action(ScienceVessleAttackType attackType) {
		
		switch (attackType) {
		case RADIOACTIVITY:
			System.out.println("["+toString()+"]빨리 산개하자!~ 죽을수도 있어 ㅠㅠ");
			break;
		case MATRIX:
			System.out.println("["+toString()+"]몸빵은 하겠지만 넌 결국 죽을껄 ㅋ");
			break;
		case EMP:
			System.out.println("["+toString()+"]나하곤 별로 상관없지~ ");
			break;
		default:
			break;
		}
		
		return null;
	}
	
	@Override
	public String toString() {
		return "히드라";
	}
}