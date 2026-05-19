package frc.subsystems;

import java.util.function.Supplier;

import edu.wpi.first.wpilibj.motorcontrol.VictorSP;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotMap;

public class driveSubsystem extends SubsystemBase{
    public VictorSP m_leftMotor;
    public VictorSP m_rightMotor;
    Supplier<Double>speed;
    
    public driveSubsystem() {
        m_leftMotor = new VictorSP(RobotMap.LeftMotorPWMPort);
        m_rightMotor = new VictorSP(RobotMap.RightMotorPWMPort);
    }

    public void LeftTrack(double Speed){
        m_leftMotor.set(Speed);
    }
    public void RightTrack(double Speed){
        m_rightMotor.set(Speed);
    } 

    public void JointDriveTracks(double LeftSpeed, double RightSpeed){
        m_leftMotor.set(LeftSpeed);
        m_rightMotor.set(RightSpeed);
    }
}
    
    
