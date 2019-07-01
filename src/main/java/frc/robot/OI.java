/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.RampDown;
import frc.robot.commands.RampUp;
import frc.robot.commands.HatchIntake;
import frc.robot.commands.HatchRelease;
import frc.robot.commands.MotorOff;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
  //// CREATING BUTTONS
  // One type of button is a joystick button which is any button on a
  //// joystick.
  // You create one by telling it which joystick it's on and which button
  // number it is.
  public Joystick stick = new Joystick(0);
  Button rampDown = new JoystickButton(stick, RobotMap.rampDownButton);
  Button rampUp = new JoystickButton(stick, RobotMap.rampUpButton);
  Button hatchIntake = new JoystickButton(stick, RobotMap.sReverseButton);
  Button hatchRelease = new JoystickButton(stick, RobotMap.sForwardButton);
  Button motorOff = new JoystickButton(stick, RobotMap.motorOffButton);

  public OI() {
    motorOff.whenPressed(new MotorOff());
    // hatchIntake = button 12
    hatchIntake.whenPressed(new HatchIntake());
    // hatchRelease = button 11
    hatchRelease.whenPressed(new HatchRelease());
    // button5 = up

    rampDown.whileHeld(new RampDown());
    rampDown.whenReleased(new MotorOff());
    // button3 = down
    rampUp.whileHeld(new RampUp());
    rampUp.whenReleased(new MotorOff());
    // button 6 = stopotor
    motorOff.whenPressed(new MotorOff());
    
  }
  

  // Button button = new JoystickButton(stick, buttonNumber);

  // There are a few additional built in buttons you can use. Additionally,
  // by subclassing Button you can create custom triggers and bind those to
  // commands the same as any other Button.

  //// TRIGGERING COMMANDS WITH BUTTONS
  // Once you have a button, it's trivial to bind it to a button in one of
  // three ways:

  // Start the command when the button is pressed and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenPressed(new ExampleCommand());

  // Run the command while the button is being held down and interrupt it once
  // the button is released.
  // button.whileHeld(new ExampleCommand());

  // Start the command when the button is released and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenReleased(new ExampleCommand());
}
