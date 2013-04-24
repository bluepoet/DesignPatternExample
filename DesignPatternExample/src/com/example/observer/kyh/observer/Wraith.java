package com.example.observer.kyh.observer;

import com.example.observer.kyh.subject.ScienceVessle.ScienceVessleAttackType;

public class Wraith implements DefenseUnit {

	@Override
	public String action(ScienceVessleAttackType attackType) {
		switch (attackType) {
		case RADIOACTIVITY:
			System.out.println("["+toString()+"]���ϰ� ���� �������~");
			break;
		case MATRIX:
			System.out.println("["+toString()+"]���� ü���� �����ڱ�~ ������");
			break;
		case EMP:
			System.out.println("["+toString()+"]��~ ���� ������ Ŭ��ŷ�� �� �� ���ݾ�~ ���ؾ���!");
			break;
		default:
			break;
		}

		return null;
	}

	@Override
	public String toString() {
		return "���̽�";
	}
}