package com.example.observer.kyh.observer;

import com.example.observer.kyh.subject.ScienceVessle.ScienceVessleAttackType;

/**
 * ��Ÿũ����Ʈ ������ֿ� ���� �߻�ȭ �������̽�
 * @author bluepoet
 *
 */
public interface DefenseUnit {
	
	String action(ScienceVessleAttackType attackType);
}
