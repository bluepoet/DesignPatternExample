package com.example.adapter.kyh.Excute;

import java.util.ArrayList;

import com.example.adapter.kyh.GroundUnits.Marine;
import com.example.adapter.kyh.GroundUnits.Medic;
import com.example.adapter.kyh.GroundUnits.MedicAdapter;
import com.example.adapter.kyh.GroundUnits.SiegeTank;
import com.example.adapter.kyh.UnitInterface.MedicUnitInterface;
import com.example.adapter.kyh.UnitInterface.TerranUnitInterface;

public class Test {
	public static void main(String[] args) {

		ArrayList<TerranUnitInterface> unitList = new ArrayList<TerranUnitInterface>();

		TerranUnitInterface marine = new Marine();
		TerranUnitInterface tank = new SiegeTank();
		MedicUnitInterface medic = new Medic();

		TerranUnitInterface adapter = new MedicAdapter(medic);

		unitList.add(marine);
		unitList.add(tank);
		unitList.add(adapter);

		Test.testMethod(unitList);
	}

	public static void testMethod(ArrayList<TerranUnitInterface> unitList) {
		for (TerranUnitInterface unit : unitList) {
			unit.clickInAction();
			unit.attack();
		}
	}
}