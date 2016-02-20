
package org.usfirst.frc.team1450.robot.subsystems;

import org.usfirst.frc.team1450.robot.RobotMap;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Drives extends Subsystem {
	CANTalon leftDrive;
	CANTalon rightDrive;
	RobotDrive robotDrive;
	public void Init() {
		if (leftDrive == null)
		{
			leftDrive = new CANTalon(RobotMap.leftDrive);
			leftDrive.enableBrakeMode(true);
			leftDrive.reverseOutput(false);	//closed loop method
		}
		if (rightDrive == null)
		{
			rightDrive = new CANTalon(RobotMap.rightDrive);
			rightDrive.enableBrakeMode(true);
			rightDrive.reverseOutput(false);	//closed loop method
		}
		if (robotDrive == null)
		{
			robotDrive = new RobotDrive(leftDrive,rightDrive);
			robotDrive.setSafetyEnabled(false);
		}
		Off();
	}
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	public void ArcadeDrive(double yAxis, double xAxis)
	{
		robotDrive.arcadeDrive(yAxis, xAxis, true);
	}
	
	public void Off()
	{
		robotDrive.stopMotor();
	}
	
	public void Drive(double magnitude, double curve)
	{
		robotDrive.drive(magnitude, curve);
	}

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
	}
}
