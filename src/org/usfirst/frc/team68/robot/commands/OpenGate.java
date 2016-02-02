
package org.usfirst.frc.team68.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team68.robot.Robot;

/**
 *
 */
public class OpenGate extends Command {
	
	private boolean isFinished = false;

    public OpenGate() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.gate);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.gate.openGate();
    	isFinished = true;
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isFinished;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}