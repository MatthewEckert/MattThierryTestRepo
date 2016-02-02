package org.usfirst.frc.team68.robot.commands;
import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;

public class Auton1 extends CommandGroup {

    public Auton1() {
    	//Motors are inverted, so forward is negative and reverse is positive
        addSequential(new DriveAtSpeed(-.6,4)); 
        addSequential(new ReverseCurrentIntakePosition());
        addSequential(new WaitCommand(3));
        addSequential(new ReverseCurrentLatchPosition());
        addSequential(new DriveAtSpeed(.6,2));  
    } 
}


