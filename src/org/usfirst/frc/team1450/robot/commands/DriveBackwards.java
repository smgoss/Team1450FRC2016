package org.usfirst.frc.team1450.robot.commands;

import org.usfirst.frc.team1450.robot.Robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

public class DriveBackwards extends Command {

	public DriveBackwards() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.drives);
    }
	
	@Override
	protected void end() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void execute() {
		
	}

	@Override
	protected void initialize() {
		Robot.drives.Drive(-0.5, 0.0);
    	Timer.delay(3.0);
    	Robot.drives.Drive(0.0, 0.0);
	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub

	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

}
