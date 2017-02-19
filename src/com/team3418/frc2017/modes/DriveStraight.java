package com.team3418.frc2017.modes;

import com.team3418.frc2017.auto.AutoModeBase;
import com.team3418.frc2017.auto.AutoModeEndedException;
import com.team3418.frc2017.auto.actions.DriveStraightAction;

public class DriveStraight extends AutoModeBase {

	@Override
	protected void routine() throws AutoModeEndedException {
		new DriveStraightAction(5.0);
	}

}