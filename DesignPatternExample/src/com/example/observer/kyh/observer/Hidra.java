package com.example.observer.kyh.observer;

import com.example.observer.kyh.subject.ScienceVessle.ScienceVessleAttackType;

public class Hidra implements DefenseUnit {
	
	@Override
	public String action(ScienceVessleAttackType attackType) {
		
		switch (attackType) {
		case RADIOACTIVITY:
			System.out.println("["+toString()+"]���� �갳����!~ �������� �־� �Ф�");
			break;
		case MATRIX:
			System.out.println("["+toString()+"]������ �ϰ����� �� �ᱹ ������ ��");
			break;
		case EMP:
			System.out.println("["+toString()+"]���ϰ� ���� �������~ ");
			break;
		default:
			break;
		}
		
		return null;
	}
	
	@Override
	public String toString() {
		return "�����";
	}
}