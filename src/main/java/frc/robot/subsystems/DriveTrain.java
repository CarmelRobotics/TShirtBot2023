// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj.motorcontrol.Victor;
import edu.wpi.first.wpilibj.motorcontrol.VictorSP;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class DriveTrain extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */
  private VictorSP DT_L1;
  private VictorSP DT_L2;
  private VictorSP DT_R1;
  private VictorSP DT_R2;
  private MotorControllerGroup left;
  private MotorControllerGroup right;
  private DifferentialDrive drive;
  public DriveTrain() {
    DT_L1 = new VictorSP(Constants.Drivetrain.PWM_L1);
    DT_L2 = new VictorSP(Constants.Drivetrain.PWM_L2);
    DT_R1 = new VictorSP(Constants.Drivetrain.PWM_R1);
    DT_R2 = new VictorSP(Constants.Drivetrain.PWM_R2);
    left = new MotorControllerGroup(DT_L1, DT_L2);
    right = new MotorControllerGroup(DT_R1, DT_R2);
    drive = new DifferentialDrive(left, right);

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
  public void arcadeDrive(double x, double y, double z){
    drive.arcadeDrive(-x, -y);
  }
  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
