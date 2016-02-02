package org.usfirst.frc.team68.robot.commands;
import edu.wpi.first.wpilibj.command.CommandGroup;

public class Auton2 extends CommandGroup {

    public Auton2() {
    	//Motors are inverted, so forward is negative and reverse is positive
        addSequential(new DriveAtSpeed(-.5,4));
        addParallel(new ReverseCurrentIntakePosition());
        addParallel(new ReverseCurrentLatchPosition());
        addSequential(new DriveAtSpeed(.6,2));
    } 
}


