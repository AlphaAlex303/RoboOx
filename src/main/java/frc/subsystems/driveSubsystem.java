package frc.subsystems;

import java.util.function.Supplier;

import edu.wpi.first.wpilibj.motorcontrol.PWMVictorSPX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotMap;

public class driveSubsystem extends SubsystemBase{
    private final static PWMVictorSPX m_leftMotor = new PWMVictorSPX(RobotMap.LeftMotorPWMPort);
        private final static PWMVictorSPX m_rightMotor = new PWMVictorSPX(RobotMap.RightMotorPWMPort);
}
    
    
public setDefaultCommand LeftTrackControl(Supplier<Double>Speed){
    m_leftMotor.set(Speed.get());
}
public setDefaultCommand RightTrackControl(Supplier<Double>Speed){
    m_rightMotor.set(Speed.get());
}