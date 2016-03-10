package org.usfirst.frc.team1450.robot.subsystems;

import org.usfirst.frc.team1450.robot.RobotMap;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Feeder extends Subsystem {
	CANTalon feederMotor1;
	CANTalon feederMotor2;
	
	public void Init() {
		if (feederMotor1 == null)
		{
			feederMotor1 = new CANTalon(RobotMap.feederMotor1);
			feederMotor1.ConfigFwdLimitSwitchNormallyOpen(true);
			feederMotor1.ConfigRevLimitSwitchNormallyOpen(true);
			feederMotor1.enableBrakeMode(true);
			feederMotor1.enableLimitSwitch(true, true);
//			feederMotor1.reverseOutput(false);	//closed loop method
			feederMotor1.setInverted(false);
		}
		if (feederMotor2 == null)
		{
			feederMotor2 = new CANTalon(RobotMap.feederMotor2);
			feederMotor2.ConfigFwdLimitSwitchNormallyOpen(true);
			feederMotor2.ConfigRevLimitSwitchNormallyOpen(true);
			feederMotor2.enableBrakeMode(true);
			feederMotor2.enableLimitSwitch(true, true);
//			feederMotor2.reverseOutput(true);	//closed loop method
			feederMotor2.setInverted(true);
		}
		Off();
	}
	
	public void Feed()
	{
		feederMotor1.set(1.0);
		feederMotor2.set(1.0);
	}
	
	public void Release()
	{
		feederMotor1.set(-1.0);
		feederMotor2.set(-1.0);
	}
	
	public void Off()
	{
		feederMotor1.set(0.0);
		feederMotor2.set(0.0);
	}

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}
}
