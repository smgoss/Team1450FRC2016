package org.usfirst.frc.team1450.robot.subsystems;

import org.usfirst.frc.team1450.robot.RobotMap;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Tower extends Subsystem {
	CANTalon leftTowerMotor;
	CANTalon rightTowerMotor;
	
	public void Init() {
		if (leftTowerMotor == null)
		{
			leftTowerMotor = new CANTalon(RobotMap.leftTowerMotor);
			leftTowerMotor.ConfigFwdLimitSwitchNormallyOpen(true);
			leftTowerMotor.ConfigRevLimitSwitchNormallyOpen(true);
			leftTowerMotor.enableBrakeMode(true);
			leftTowerMotor.enableLimitSwitch(true, true);
//			leftTowerMotor.reverseOutput(false);	//closed loop method
			leftTowerMotor.setInverted(false);
		}
		if (rightTowerMotor == null)
		{
			rightTowerMotor = new CANTalon(RobotMap.rightTowerMotor);
			rightTowerMotor.ConfigFwdLimitSwitchNormallyOpen(true);
			rightTowerMotor.ConfigRevLimitSwitchNormallyOpen(true);
			rightTowerMotor.enableBrakeMode(true);
			rightTowerMotor.enableLimitSwitch(true, true);
//			rightTowerMotor.reverseOutput(true);	//closed loop method
			rightTowerMotor.setInverted(true);
		}
		Off();
	}
	
	public void Move(double setPoint)
	{
		leftTowerMotor.set(setPoint);
		rightTowerMotor.set(setPoint);
		SmartDashboard.putNumber("towerOut", setPoint);
	}
	
	public void Up()
	{
		leftTowerMotor.set(1.0);
		rightTowerMotor.set(1.0);
	}
	
	public void Down()
	{
		leftTowerMotor.set(-1.0);
		rightTowerMotor.set(-1.0);
	}
	
	public void Off()
	{
		leftTowerMotor.set(0.0);
		rightTowerMotor.set(0.0);
	}
	
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub

	}

}
