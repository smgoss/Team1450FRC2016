package org.usfirst.frc.team1450.robot.commands;

import org.usfirst.frc.team1450.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class FeedBoulder extends Command {

	public FeedBoulder() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.feeder);
    }
	
	@Override
	protected void end() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void execute() {
		Robot.feeder.Feed();
	}

	@Override
	protected void initialize() {
		// TODO Auto-generated method stub

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
