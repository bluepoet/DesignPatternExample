package com.example.observer.kyh.observer;

import com.example.observer.kyh.subject.ScienceVessle.ScienceVessleAttackType;

public class Wraith implements DefenseUnit {

	@Override
	public String action(ScienceVessleAttackType attackType) {
		switch (attackType) {
		case RADIOACTIVITY:
			System.out.println("["+toString()+"]나하곤 별로 상관없지~");
			break;
		case MATRIX:
			System.out.println("["+toString()+"]내가 체력이 딸리겠군~ 피하자");
			break;
		case EMP:
			System.out.println("["+toString()+"]윽~ 저걸 맞으면 클로킹을 쓸 수 없잖아~ 피해야지!");
			break;
		default:
			break;
		}

		return null;
	}

	@Override
	public String toString() {
		return "레이스";
	}
}