package org.usfirst.frc.team5426.robot;

import utils.LogitechController;

public class OI {
	
	private LogitechController controller;
	
	public OI () {
		
		controller = new LogitechController(0);
	}
	
	public void registerControls() {
		
		Robot.log("Controls successfully registered");
	}
	
	public LogitechController getController() {
		
		return controller;
	}
	
	public double getXAxis() {
		
		return controller.getLeftAxisX();
	}
		
	public double getYAxis() {
			
			return controller.getLeftAxisY();
		}
	
	public double getZAxis() {
		
		return controller.getRightAxisX();
	}

}
