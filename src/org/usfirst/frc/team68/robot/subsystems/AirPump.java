
package org.usfirst.frc.team68.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team68.robot.RobotMap;
import edu.wpi.first.wpilibj.Compressor;

public class AirPump extends Subsystem {
	
	private Compressor compressor;
	private static AirPump airPump;
	
	public static AirPump getAir(){
		if (airPump == null) {
			airPump = new AirPump();
		}
		return airPump;
	}
	
	private AirPump(){
		compressor = new Compressor(RobotMap.PCM_MAIN);
	}
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

