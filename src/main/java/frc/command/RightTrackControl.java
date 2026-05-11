package frc.command;

import frc.subsystems.driveSubsystem;

import java.util.function.Supplier;

import edu.wpi.first.wpilibj2.command.Command;

public class RightTrackControl extends Command {
    public driveSubsystem driveSubsystem;
    public Supplier<Double> power;
    public RightTrackControl(driveSubsystem driveSubsystem, Supplier<Double> power) {
        this.driveSubsystem = driveSubsystem;
    }

    public void initialize(){
        //put things that need to be initialized here (such as a timer). No need to @Override.
    }

    @Override
    public void execute() {
        //This gets called when the command does. 
        driveSubsystem.RightTrack(power);
    }

    @Override
    public void end(boolean interrupted) {
        //this gets called when the input stops being given. 
        driveSubsystem.LeftTrack(()->0.0);
    }
}
