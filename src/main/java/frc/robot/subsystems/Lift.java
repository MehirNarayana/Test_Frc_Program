// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.VictorSP;
import frc.robot.RobotMap;


/** Add your docs here. */
public class Lift extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  VictorSP liftMotor = new VictorSP(RobotMap.Lift_Motor_ID);
  
  Encoder encoder = new Encoder(0, 1);
  
  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
  public void liftWeight(double height) {
    double totalDistance = encoder.get() * RobotMap.Count_Distance; 
    
    if (totalDistance != height) {
      if (totalDistance > height){
        liftMotor.set(-0.2);
      } 

      else{
        liftMotor.set(0.2);
      }
      
      
    } 

    else {
      encoder.reset();
    }
  }

}
