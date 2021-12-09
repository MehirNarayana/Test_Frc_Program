// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.VictorSP;
import frc.robot.RobotMap;

 
/** Add your docs here. */
public class DriveTrain extends Subsystem {
  //Notes: instance of the VictorSP class
  VictorSP exampleMotor = new VictorSP(RobotMap.Example_Motor_ID);  
   
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }

  public void setMotor(){
    //Notes: sets motor to full speed
    exampleMotor.set(1);
  }


}
