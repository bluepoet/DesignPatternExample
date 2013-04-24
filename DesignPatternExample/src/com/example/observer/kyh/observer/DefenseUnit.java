package com.example.observer.kyh.observer;

import com.example.observer.kyh.subject.ScienceVessle.ScienceVessleAttackType;

/**
 * 스타크래프트 방어유닛에 대한 추상화 인터페이스
 * @author bluepoet
 *
 */
public interface DefenseUnit {
	
	String action(ScienceVessleAttackType attackType);
}
