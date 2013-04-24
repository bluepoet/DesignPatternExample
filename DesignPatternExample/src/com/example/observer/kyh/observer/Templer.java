package com.example.observer.kyh.observer;

import com.example.observer.kyh.subject.ScienceVessle.ScienceVessleAttackType;

public class Templer implements DefenseUnit {

	@Override
	public String action(ScienceVessleAttackType attackType) {
		switch (attackType) {
		case RADIOACTIVITY:
			System.out.println("["+toString()+"]나하곤 별로 상관없지~");
			break;
		case MATRIX:
			System.out.println("["+toString()+"]번개가 있지만 널 죽이긴 나도 힘들어");
			break;
		case EMP:
			System.out.println("["+toString()+"]윽~ 저걸 맞으면 번개를 쓸 수 없으니 빨리 피하자!");
			break;
		default:
			break;
		}
		
		return null;
	}
	
	@Override
	public String toString() {
		return "템플러";
	}
}