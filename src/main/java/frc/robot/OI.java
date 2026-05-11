package frc.robot;

import com.pathplanner.lib.commands.PathPlannerAuto;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.command.LeftTrackControl;
import frc.command.RightTrackControl;
import frc.subsystems.driveSubsystem;


public class OI {
    //Define controller ports | DO NOT TOUCH |
    final CommandXboxController driveController = new CommandXboxController(0);

    //Define all subsystems
    final driveSubsystem driveSubsystem = new driveSubsystem();
    //Creates Bindings for controllers
    public OI() {
        configureBindings();
    }


    private void configureBindings() {
        driveSubsystem.setDefaultCommand(new LeftTrackControl(driveSubsystem, ()-> driveController.getLeftY()));
        driveSubsystem.setDefaultCommand(new RightTrackControl(driveSubsystem, ()-> driveController.getRightY()));
    }

    public Command getAutonomousCommand() {
        // AUTOS not PATHS in path planner should be called here
        return new PathPlannerAuto("AutoName");
    }


}