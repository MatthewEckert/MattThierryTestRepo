package org.usfirst.frc.team68.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team68.robot.RobotMap;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;

public class Gate extends Subsystem {
	
	private DoubleSolenoid p67;
  
	private static Gate gate;
	
	public static Gate getGate(){
		if (gate == null) {
			gate = new Gate();
		}
		return gate;
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
    }
	
	private Gate(){
		p67 = new DoubleSolenoid(RobotMap.PCM_MAIN,RobotMap.GATE_FORWARD,RobotMap.GATE_REVERSE);
		this.openGate();
	}
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	public void openGate(){
		p67.set(Value.kForward);
	}
	
	public void closeGate(){
		p67.set(Value.kReverse);
	}
	
	public void reverseCurrentGatePosition() {
		if (p67.get() == Value.kForward) {
			this.closeGate();
		} else {
	    	this.openGate();
		}
	}
	
}





