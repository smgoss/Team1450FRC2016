
package org.usfirst.frc.team1450.robot.subsystems;

import org.usfirst.frc.team1450.robot.RobotMap;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Drives extends Subsystem {
	CANTalon leftDrive;
	CANTalon rightDrive;
	public void Init() {
		if (leftDrive == null)
		{
			leftDrive = new CANTalon(RobotMap.leftDrive);
		}
		if (rightDrive == null)
		{
			rightDrive = new CANTalon(RobotMap.rightDrive);
		}
	}
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	protected void Drive(double leftSpeed, double rightSpeed)
	{
		//
	}

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
	}
}
