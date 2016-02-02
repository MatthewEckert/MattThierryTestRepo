package org.usfirst.frc.team68.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team68.robot.RobotMap;
import org.usfirst.frc.team68.robot.commands.IntakeWithJoysticks;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.VictorSP;

public class Intake extends Subsystem {
	
	private DoubleSolenoid p45;
    private VictorSP intakeLF;
    private VictorSP intakeRF;
  
	
	private static Intake intake;
	
	public static Intake getIntake(){
		if (intake == null) {
			intake = new Intake();
		}
		return intake;
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new IntakeWithJoysticks());
    }
	
	private Intake(){
		p45 = new DoubleSolenoid(RobotMap.PCM_MAIN,RobotMap.INTAKE_FORWARD,RobotMap.INTAKE_REVERSE);
		this.openIntake();
		intakeLF = new VictorSP(RobotMap.INTAKE_LF_MOTOR);
		intakeRF = new VictorSP(RobotMap.INTAKE_RF_MOTOR);
	}
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	public void openIntake(){
		p45.set(Value.kForward);
	}
	
	public void closeIntake(){
		p45.set(Value.kReverse);
	}
	
	public void reverseCurrentIntakePosition() {
		if (p45.get() == Value.kForward) {
			this.closeIntake();
		} else {
	    	this.openIntake();
		}
	}

	public void setLeftIntakeMotor(double speed) {
		intakeLF.set(speed);
	}

	public void setRightIntakeMotor(double speed) {
		intakeRF.set(speed);
	}

	public void stopIntakeMotors() {
		this.setLeftIntakeMotor(0);
		this.setRightIntakeMotor(0);
	}

	public void setIntakeMotors(double leftSpeed, double rightSpeed) {
		this.setLeftIntakeMotor(leftSpeed);
		this.setRightIntakeMotor(rightSpeed);
	}

	public void intakeWithXboxJoysticks(double leftXboxJoystickValue, double rightXboxJoystickValue) {
		this.setIntakeMotors(leftXboxJoystickValue, rightXboxJoystickValue);
	}
}





