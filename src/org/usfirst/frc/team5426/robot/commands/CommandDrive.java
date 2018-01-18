package org.usfirst.frc.team5426.robot.commands;

import org.usfirst.frc.team5426.robot.Robot;

public class CommandDrive extends CommandBase {
	
	public CommandDrive() {
		
		this.requires(getDrive());
	}
	
	@Override
    protected void initialize() {
    	
    }

    @Override
    protected void execute() {
    		
    	getDrive().drive(Robot.controls.getXAxis(), Robot.controls.getYAxis(), Robot.controls.getZAxis());
    }

    @Override
    protected boolean isFinished() {

        return false;
    }

    @Override
    protected void end() {

    }

    @Override
    protected void interrupted() {
    	
    }
}
