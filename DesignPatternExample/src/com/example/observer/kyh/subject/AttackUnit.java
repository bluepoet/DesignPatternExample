package com.example.observer.kyh.subject;

import com.example.observer.kyh.observer.DefenseUnit;
import com.example.observer.kyh.subject.ScienceVessle.ScienceVessleAttackType;

/**
 * 스타크래프트 공격유닛 Subject에 대한 추상화 인터페이스
 * 
 * @author bluepoet
 * 
 */
public interface AttackUnit {

	void notifyDefenseUnit(ScienceVessleAttackType attackType);

	void registerDefenseUnit(DefenseUnit defenseUnit);

	void removeDefenseUnit(DefenseUnit defenseUnit);
}
