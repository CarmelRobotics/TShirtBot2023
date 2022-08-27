// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Pneumatics extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */
  private DoubleSolenoid lifter;
  private Timer time;
  private Relay cannon;
  public Pneumatics() {
    lifter = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, Constants.Pneumatics.PNEUMATICS_LIFTER_UP, Constants.Pneumatics.PNEUMATICS_LIFTER_DN);
    time = new Timer();
    cannon = new Relay(3);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void fire(){
    cannon.set(Relay.Value.kOn);
    }
  
  public void stop(){
    cannon.set(Relay.Value.kOff);
  }
  public void liftUp(){
    lifter.set(Value.kForward);
  }

  public void liftDn(){
    lifter.set(Value.kReverse);
  }
  public void disable(){
    lifter.set(Value.kOff);
  }
  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
