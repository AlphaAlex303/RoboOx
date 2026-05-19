package frc.command;

import java.util.function.Supplier;

import edu.wpi.first.wpilibj2.command.Command;
import frc.subsystems.driveSubsystem;

public class driveCommand extends Command {
    public driveSubsystem driveSubsystem;
    public Supplier<Double> LeftDrivePower;
    public Supplier<Double> RightDrivePower;
    public driveCommand(driveSubsystem driveSubsystem, Supplier<Double> LeftDrivePower, Supplier<Double> RightDrivePower) {
        this.driveSubsystem = driveSubsystem;
        this.LeftDrivePower = LeftDrivePower;
        this.RightDrivePower = RightDrivePower;
        addRequirements(driveSubsystem);
    }

    public void initialize(){
        //put things that need to be initialized here (such as a timer). No need to @Override.
    }

    @Override
    public void execute() {
        //This gets called when the command does. 
        driveSubsystem.JointDriveTracks(LeftDrivePower.get(),RightDrivePower.get());
    }

    @Override
    public void end(boolean interrupted) {
        //this gets called when the input stops being given. 
        driveSubsystem.JointDriveTracks(0.0,0.0);
    }
}
