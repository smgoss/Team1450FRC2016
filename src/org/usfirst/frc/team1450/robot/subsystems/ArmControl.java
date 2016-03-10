
package org.usfirst.frc.team1450.robot.subsystems;

import org.usfirst.frc.team1450.robot.RobotMap;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class ArmControl extends Subsystem {
    
	CANTalon leftArmMotor;
	CANTalon rightArmMotor;
	public void Init() {
		if (leftArmMotor == null)
		{
			leftArmMotor = new CANTalon(RobotMap.leftArmMotor);
			leftArmMotor.ConfigFwdLimitSwitchNormallyOpen(true);
			leftArmMotor.ConfigRevLimitSwitchNormallyOpen(true);
			leftArmMotor.enableBrakeMode(true);
			leftArmMotor.enableLimitSwitch(true, true);
//			leftArmMotor.reverseOutput(false);	//closed loop method
			leftArmMotor.setInverted(false);
		}
		if (rightArmMotor == null)
		{
			rightArmMotor = new CANTalon(RobotMap.rightArmMotor);
			rightArmMotor.ConfigFwdLimitSwitchNormallyOpen(true);
			rightArmMotor.ConfigRevLimitSwitchNormallyOpen(true);
			rightArmMotor.enableBrakeMode(true);
			rightArmMotor.enableLimitSwitch(true, true);
//			rightArmMotor.reverseOutput(true);	//closed loop method
			rightArmMotor.setInverted(true);
		}
		OffCommand();
	}
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void UpCommand() {
        leftArmMotor.set(1.0);
        rightArmMotor.set(1.0);
    }
    
    public void DownCommand() {
    	leftArmMotor.set(-1.0);
    	rightArmMotor.set(-1.0);
    }
    
    public void OffCommand() {
    	leftArmMotor.set(0.0);
    	rightArmMotor.set(0.0);
    }

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
	}
}

