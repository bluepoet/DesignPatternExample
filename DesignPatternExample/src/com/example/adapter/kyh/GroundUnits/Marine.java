package com.example.adapter.kyh.GroundUnits;

import com.example.adapter.kyh.UnitInterface.TerranUnitInterface;

public class Marine implements TerranUnitInterface {

	public void attack() {
		System.out.println("Go Go Go!");
	}

	public void clickInAction() {
		System.out.println("You want a piece of me, boy!");
	}

}
