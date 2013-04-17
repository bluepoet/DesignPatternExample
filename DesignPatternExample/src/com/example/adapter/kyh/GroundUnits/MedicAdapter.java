package com.example.adapter.kyh.GroundUnits;

import com.example.adapter.kyh.UnitInterface.MedicUnitInterface;
import com.example.adapter.kyh.UnitInterface.TerranUnitInterface;

public class MedicAdapter implements TerranUnitInterface {
	MedicUnitInterface unit;

	public MedicAdapter(MedicUnitInterface unit) {
		this.unit = unit;
	}

	public void attack() {
		unit.healOthers();
	}

	public void clickInAction() {
		unit.clickInAction();
	}
}
