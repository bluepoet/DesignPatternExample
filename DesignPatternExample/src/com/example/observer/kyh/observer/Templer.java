package com.example.observer.kyh.observer;

import com.example.observer.kyh.subject.ScienceVessle.ScienceVessleAttackType;

public class Templer implements DefenseUnit {

	@Override
	public String action(ScienceVessleAttackType attackType) {
		switch (attackType) {
		case RADIOACTIVITY:
			System.out.println("["+toString()+"]���ϰ� ���� �������~");
			break;
		case MATRIX:
			System.out.println("["+toString()+"]������ ������ �� ���̱� ���� �����");
			break;
		case EMP:
			System.out.println("["+toString()+"]��~ ���� ������ ������ �� �� ������ ���� ������!");
			break;
		default:
			break;
		}
		
		return null;
	}
	
	@Override
	public String toString() {
		return "���÷�";
	}
}