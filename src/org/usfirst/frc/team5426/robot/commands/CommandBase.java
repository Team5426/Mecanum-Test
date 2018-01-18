package org.usfirst.frc.team5426.robot.commands;

import org.usfirst.frc.team5426.robot.subsystems.DriveTrain;

import edu.wpi.first.wpilibj.command.Command;

public class CommandBase extends Command {
	
	private static DriveTrain driveTrain;
	
	public static void init() {
		
		driveTrain = new DriveTrain();
	}
	
	@Override
	protected boolean isFinished() {
		
		return false;
	}
	
	public static DriveTrain getDrive() {
		
		return driveTrain;
	}
}
