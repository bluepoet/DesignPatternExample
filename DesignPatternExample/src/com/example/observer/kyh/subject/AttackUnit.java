package com.example.observer.kyh.subject;

import com.example.observer.kyh.observer.DefenseUnit;
import com.example.observer.kyh.subject.ScienceVessle.ScienceVessleAttackType;

/**
 * ��Ÿũ����Ʈ �������� Subject�� ���� �߻�ȭ �������̽�
 * 
 * @author bluepoet
 * 
 */
public interface AttackUnit {

	void notifyDefenseUnit(ScienceVessleAttackType attackType);

	void registerDefenseUnit(DefenseUnit defenseUnit);

	void removeDefenseUnit(DefenseUnit defenseUnit);
}
