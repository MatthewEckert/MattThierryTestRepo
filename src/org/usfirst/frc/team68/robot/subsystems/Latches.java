package org.usfirst.frc.team68.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team68.robot.RobotMap;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;

public class Latches extends Subsystem {
	
	private DoubleSolenoid p01;
	private static Latches latches;
	
	public static Latches getLatches(){
		if (latches == null) {
			latches = new Latches();
		}
		return latches;
	}
	
	private Latches(){
		p01 = new DoubleSolenoid(RobotMap.PCM_MAIN,RobotMap.LATCH_FORWARD,RobotMap.LATCH_REVERSE);
		this.openLatches();
	}
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new OpenLatches());
    }
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	public void openLatches(){
		p01.set(Value.kForward);
	}
	
	public void closeLatches(){
		p01.set(Value.kReverse);
	}
	
    public void reverseCurrentLatchPosition() {
    	if (p01.get() == Value.kForward) {
    		this.closeLatches();
    	} else {
        	this.openLatches();
    	}
    }
}

