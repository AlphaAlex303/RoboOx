package frc.robot;

import com.pathplanner.lib.commands.PathPlannerAuto;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;


public class OI {
    //Define controller ports | DO NOT TOUCH |
    final CommandXboxController driveController = new CommandXboxController(0);

  
    //Creates Bindings for controllers
    public OI() {
        configureBindings();
    }


    private void configureBindings() {
       

    }

    public Command getAutonomousCommand() {
        // AUTOS not PATHS in path planner should be called here
        return new PathPlannerAuto("AutoName");
    }


}