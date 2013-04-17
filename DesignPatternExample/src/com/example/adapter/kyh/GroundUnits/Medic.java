package com.example.adapter.kyh.GroundUnits;

import com.example.adapter.kyh.UnitInterface.MedicUnitInterface;

public class Medic implements MedicUnitInterface {

	public void healOthers() {
		System.out.println("I'm no Attack! I heal other people");
	}

	public void clickInAction() {
		System.out.println("Prepped and ready!");
	}

}
