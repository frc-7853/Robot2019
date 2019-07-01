/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.RobotMap;
import frc.robot.commands.ManualDriveCommand;

/**
 * Add your docs here.
 */
public class DriveSubsystem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  public Victor rightMotorTop = new Victor(RobotMap.rightMotorPortTop);
  public Victor rightMotorBottom = new Victor(RobotMap.rightMotorPortBottom);
  public SpeedControllerGroup right = new SpeedControllerGroup(rightMotorTop, rightMotorBottom);

  public Victor leftMotorTop = new Victor(RobotMap.leftMotorPortTop);
  public Victor leftMotorBottom = new Victor(RobotMap.leftMotorPortBottom);
  public SpeedControllerGroup left = new SpeedControllerGroup(leftMotorTop, leftMotorBottom);

  // Differential Drive Object
  public DifferentialDrive drive = new DifferentialDrive(left, right);
  
  // Differential Drive Constructor

  /*public void DriveSubsytem(){


  }
  */

  public void manualDrive(double move, double turn) {

    drive.arcadeDrive(move, turn);

  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new ManualDriveCommand());
  }
}
