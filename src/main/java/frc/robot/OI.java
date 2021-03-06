// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;
import edu.wpi.first.wpilibj.buttons.Trigger;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import frc.robot.RobotMap;
import edu.wpi.first.wpilibj.Joystick;


/**
 * This class is the glue that binds the controls on the physical operator interface to the commands
 * and command groups that allow control of the robot.
 */
public class OI {
  XboxController driverController = new XboxController(RobotMap.Controller_Input);
  
  public double Get_Trigger(){
    double positive = driverController.getRawAxis(RobotMap.Right_Trigger);
    double negative = driverController.getRawAxis(RobotMap.Left_Trigger);
    return positive - negative; 


  }


  public int Get_Button(){
    if (driverController.getAButton()){
      return 5;  
    }

    else if (driverController.getBButton()){
      return 10;
    }
    
    else if (driverController.getYButton()){
      return 15;
    }

    else{
      return 0;
    }
    
  }

  //public double Get_Left_Trigger(){
    //return driverController.getRawAxis(RobotMap.Left_Trigger);

  //}


}


  //// CREATING BUTTONS
  // One type of button is a joystick button which is any button on a
  //// joystick.
  // You create one by telling it which joystick it's on and which button
  // number it is.
  // Joystick stick = new Joystick(port);
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

