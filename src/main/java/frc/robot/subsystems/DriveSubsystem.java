/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import frc.robot.RobotMap;
import frc.robot.commands.ManualDriveCommand;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;


public class DriveSubsystem extends Subsystem {
  //Defining both right motor objects
  public Victor rightMotorTop = new Victor(RobotMap.rightMotorPortTop);
  public Victor rightMotorBottom = new Victor(RobotMap.rightMotorPortBottom);
  //Linking the right motors
  public SpeedControllerGroup right = new SpeedControllerGroup(rightMotorTop, rightMotorBottom);

  //Defining both left motor objects
  public Victor leftMotorTop = new Victor(RobotMap.leftMotorPortTop);
  public Victor leftMotorBottom = new Victor(RobotMap.leftMotorPortBottom);
  //Linking the left motors
  public SpeedControllerGroup left = new SpeedControllerGroup(leftMotorTop, leftMotorBottom);

  // Differential Drive Object with the two SpeedControllerGroups
  public DifferentialDrive drive = new DifferentialDrive(left, right);
  
  // Differential Drive Constructor

  /*public void DriveSubsytem(){


  }
  */
  
  //Drive function to use the inputs of the controller
  public void manualDrive(double move, double turn) {
    drive.arcadeDrive(move, turn * RobotMap.maxTurnSpeed);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new ManualDriveCommand());
  }
}
