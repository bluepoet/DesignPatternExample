package com.example.observer.kyh;

import com.example.observer.kyh.observer.DefenseUnit;
import com.example.observer.kyh.observer.Hidra;
import com.example.observer.kyh.observer.Templer;
import com.example.observer.kyh.observer.Wraith;
import com.example.observer.kyh.subject.ScienceVessle;
import com.example.observer.kyh.subject.ScienceVessle.ScienceVessleAttackType;

public class ScienceVessleAttackTest {

	public static void main(String[] args) {
		ScienceVessle vessle = new ScienceVessle();

		DefenseUnit hidra = new Hidra();
		DefenseUnit templer = new Templer();
		DefenseUnit wraith = new Wraith();

		vessle.registerDefenseUnit(hidra);
		vessle.registerDefenseUnit(templer);

		vessle.changeAttackType(ScienceVessleAttackType.RADIOACTIVITY);

		vessle.removeDefenseUnit(templer);
		vessle.registerDefenseUnit(wraith);

		vessle.changeAttackType(ScienceVessleAttackType.EMP);
	}
}