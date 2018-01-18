package org.usfirst.frc.team5426.robot;

import org.usfirst.frc.team5426.robot.commands.CommandBase;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Scheduler;

public class Robot extends IterativeRobot {
	
	public static OI controls;
	
	@Override
	public void robotInit() {
		
		CommandBase.init();
		
		controls = new OI();
		controls.registerControls();
	}
	
	@Override
	public void teleopPeriodic() {
		
		Scheduler.getInstance().run();
	}
	
	public static void log(String message) {
		
		DriverStation.reportWarning("[EVENT] " + message, false);
	}
	
	public static void warn(String message) {
		
		DriverStation.reportWarning("[WARNING] " + message, false);
	}
	
	public static void error(String message) {
		
		DriverStation.reportWarning("[ERROR] " + message, false);
	}
}
