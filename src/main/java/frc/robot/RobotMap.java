// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into to a variable name.
 * This provides flexibility changing wiring, makes checking the wiring easier and significantly
 * reduces the number of magic numbers floating around.
 */
public class RobotMap {
  //Notes: Constant defined here
  // Notes: Port number of the Victor SP motor
  //public static final int Example_Motor_ID = 9;
  public static final int front_Right_Motor_ID = 9;
  public static final int front_Left_Motor_ID = 2;
  public static final int back_Right_Motor_ID = 3;
  public static final int back_Left_Motor_ID = 4;
  public static final int Controller_Input = 8; //Gotta change this after 
  public static final int Right_Trigger = 3;
  public static final int Left_Trigger = 2;
  public static final int Counts_Per_Rev = 1024;
  public static final double Count_Distance = 2 * Math.PI / Counts_Per_Rev;
  public static final int Lift_Motor_ID = 6; //Gotta change this after as well
  // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.
  // public static int leftMotor = 1;
  // public static int rightMotor = 2;

  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;
}
