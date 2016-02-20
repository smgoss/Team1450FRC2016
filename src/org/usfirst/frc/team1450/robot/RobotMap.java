package org.usfirst.frc.team1450.robot;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
	public static int leftDrive=10;
    public static int rightDrive=11;
    public static int leftArmMotor=12;
    public static int rightArmMotor=13;
    public static int leftTowerMotor=14;
    public static int rightTowerMotor=15;
	public static int feederMotor1 = 16;
	public static int feederMotor2 = 17;
	public static int xBoxLeftX = 0;
	public static int xBoxLeftY = 1;
	public static int xBoxLeftTrigger = 2;
	public static int xBoxRightTrigger = 3;
	public static int xBoxRightX = 4;
	public static int xBoxRightY = 5;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
}
