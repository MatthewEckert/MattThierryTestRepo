package org.usfirst.frc.team68.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import org.usfirst.frc.team68.robot.commands.*;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS 2
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
	
	private Joystick leftJoy;
	private Joystick rightJoy;
	private Joystick xboxController;
	private Button xboxA;
	private Button xboxB;
	private Button xboxX;
	private Button xboxY;
	private Button xboxRB;
	private Button xboxLB;
	
	private static OI oi;
	
	public static OI getOI(){
		if (oi == null) {
			oi = new OI();
		}
		return oi;	
	}
	
	private OI(){
		leftJoy = new Joystick(RobotMap.LEFT_JOYSTICK);
		rightJoy = new Joystick(RobotMap.RIGHT_JOYSTICK);
		xboxController = new Joystick(RobotMap.XBOX_CONTROLLER);
		
		xboxRB = new JoystickButton(xboxController, RobotMap.XBOX_RB);
		xboxRB.whenPressed(new ReverseCurrentIntakePosition());
		xboxLB = new JoystickButton(xboxController, RobotMap.XBOX_LB);
		xboxLB.whenPressed(new ReverseCurrentLatchPosition());
		xboxA = new JoystickButton(xboxController, RobotMap.XBOX_A);
		xboxA.whenPressed(new ReverseCurrentGatePosition());
		
		SmartDashboard.putData("Open Latches", new OpenLatches());
		SmartDashboard.putData("Open Intake", new OpenIntake());
		SmartDashboard.putData("Close Latches", new CloseLatches());
		SmartDashboard.putData("Close Intake", new CloseIntake());
	    SmartDashboard.putData("Reverse Intake", new ReverseCurrentIntakePosition());
	    SmartDashboard.putData("Reverse Latches", new ReverseCurrentLatchPosition());
	}
	
    public double getLeftJoystickValue() {
		double leftAxis;
		leftAxis = leftJoy.getY();
		// Allow for up to 10% of joystick noise
		leftAxis = (Math.abs(leftAxis) < 0.1) ? 0 : leftAxis;
    	return leftAxis;
    }
    
    public double getRightJoystickValue() {
		double rightAxis;
		rightAxis = rightJoy.getY();
		// Allow for up to 10% of joystick noise
		rightAxis = (Math.abs(rightAxis) < 0.1) ? 0 : rightAxis;
    	return rightAxis;
    }
    
    public double getLeftXboxJoystickValue() {
		double leftAxis;
		leftAxis = xboxController.getRawAxis(RobotMap.XBOX_LY);
		// Allow for up to 10% of joystick noise
		leftAxis = (Math.abs(leftAxis) < 0.1) ? 0 : leftAxis;
    	return leftAxis*-1;
    }
    
    public double getRightXboxJoystickValue() {
		double rightAxis;
		rightAxis = xboxController.getRawAxis(RobotMap.XBOX_RY);
		// Allow for up to 10% of joystick noise
		rightAxis = (Math.abs(rightAxis) < 0.1) ? 0 : rightAxis;
    	return rightAxis;
    }

}

