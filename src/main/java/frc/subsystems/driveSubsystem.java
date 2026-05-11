package frc.subsystems;

import java.util.function.Supplier;

import edu.wpi.first.wpilibj.motorcontrol.PWMVictorSPX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotMap;

public class driveSubsystem extends SubsystemBase{
    private static PWMVictorSPX m_leftMotor = new PWMVictorSPX(RobotMap.LeftMotorPWMPort);
    private static PWMVictorSPX m_rightMotor = new PWMVictorSPX(RobotMap.RightMotorPWMPort);
    
    public driveSubsystem() {
        m_leftMotor = new PWMVictorSPX(RobotMap.LeftMotorPWMPort);
        m_rightMotor = new PWMVictorSPX(RobotMap.LeftMotorPWMPort);
        
    }

    public void LeftTrack(Supplier<Double>Speed){
        m_leftMotor.set(Speed.get());
    }
    public void RightTrack(Supplier<Double>Speed){
        m_rightMotor.set(Speed.get());
    }
}
    
    
