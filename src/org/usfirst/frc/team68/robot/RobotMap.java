package org.usfirst.frc.team68.robot;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // DriveTrain Port Mapping Constants
    public static final int DRIVE_LEFT_FRONT = 1;		// CAN bus port 1
    public static final int DRIVE_RIGHT_FRONT = 2;		// CAN bus port 2
    public static final int DRIVE_LEFT_REAR = 3;		// CAN bus port 3
    public static final int DRIVE_RIGHT_REAR = 4;		// CAN bus port 4
    
    // Intake Port Mapping Constants
    public static final int INTAKE_FORWARD = 4;
    public static final int INTAKE_REVERSE = 5;
    public static final int INTAKE_LF_MOTOR = 4;		// PWM port 4
    public static final int INTAKE_RF_MOTOR = 5;		// PWM port 5


    // Latches Port Mapping Constants
    public static final int LATCH_FORWARD = 0;
    public static final int LATCH_REVERSE = 1;
    
    // Gate Port Mapping Constants
    public static final int GATE_FORWARD = 6;
    public static final int GATE_REVERSE = 7;   
    
    // Can Holder Port Mapping Constants
    public static final int CANHOLDER_FORWARD = 2;
    public static final int CANHOLDER_RELEASE = 3;

    // Joystick Port Mapping Constants
    public static final int LEFT_JOYSTICK = 0;			// USB port 0
    public static final int RIGHT_JOYSTICK = 1;			// USB port 1
    public static final int JOYSTICK_Y = 1;				// This works for both joysticks
    
    // xBoxController Button & Axis Mapping Constants
    // Buttons
    public static final int XBOX_CONTROLLER = 2;		// USB port 2
    public static final int XBOX_A = 1;
    public static final int XBOX_B = 2;
    public static final int XBOX_X = 3;
    public static final int XBOX_Y = 4;
    public static final int XBOX_LB = 5;
    public static final int XBOX_RB = 6;
    // Axis
    public static final int XBOX_LY = 1;
    public static final int XBOX_RY = 5;

    
    // Pneumatics Port Mapping Constants
    public static final int PCM_MAIN = 0;
    public static final int PCM_AUX = 1;    
}
