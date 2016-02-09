
package org.usfirst.frc.team1450.robot.subsystems;

import org.usfirst.frc.team1450.robot.RobotMap;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class ArmControl extends Subsystem {
    
	CANTalon armMotor;
	public void Init() {
		if (armMotor == null)
		{
			armMotor = new CANTalon(RobotMap.armMotor);
		}
	}
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void UpCommand() {
        armMotor.set(1.0);
    }
    
    public void DownCommand() {
    	armMotor.set(-1.0);
    }
    
    public void OffCommand() {
    	armMotor.set(0.0);
    }

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
	}
}

