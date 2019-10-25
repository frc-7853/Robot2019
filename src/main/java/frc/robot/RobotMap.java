/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.
 
  // Drive
  public static double maxTurnSpeed = 0.75;
  
  // Motor Ports
  public static int leftMotorPortTop = 0; //before 2
  public static int leftMotorPortBottom = 1;//before 3

  public static int rightMotorPortTop = 2; //before 0
  public static int rightMotorPortBottom = 3;  //before 1
  // Ramp Motor Ports
  public static int rampMotorPort = 4;
  // Ramp Controls
  public static int rampUpButton = 5; //UP
  public static int rampDownButton = 3; //DOWN
  public static int motorOffButton =  6;
  //Motor Speed
  public static double initialRampMotorSpeed = 1;
  // Solenoid Ports
  public static int forwardSolenoidPort = 0;
  public static int backwardSolenoidPort = 1;

  public static int sForwardButton = 11;
  public static int sReverseButton = 12;
  public static int sOffButton = 7;

  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;
}
