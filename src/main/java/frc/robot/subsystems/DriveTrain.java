// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.Encoder;
import frc.robot.RobotMap;

 
/** Add your docs here. */
public class DriveTrain extends Subsystem {
  //Notes: instance of the VictorSP class
  //VictorSP exampleMotor = new VictorSP(RobotMap.Example_Motor_ID);  
  VictorSP frontRight = new VictorSP(RobotMap.front_Right_Motor_ID );
  VictorSP frontLeft = new VictorSP(RobotMap.front_Left_Motor_ID );
  VictorSP liftMotor = new VictorSP(RobotMap.Lift_Motor_ID);
  
  Encoder encoder = new Encoder(0, 1);

   
  
  //VictorSP backRight = new VictorSP(RobotMap.back_Right_Motor_ID );
  //VictorSP backLeft = new VictorSP(RobotMap.back_Left_Motor_ID );
   
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }




  public void setMotor(){
    //Notes: sets motor to full speed
    frontRight.set(1);
    frontLeft.set(-1);
  }

  public void setController(double speed){
    frontRight.set(speed);
    frontLeft.set(speed*-1);
  }

  

 
//Moving the Robot Forward
  public void moveForward(){
    //frontRight.set(-1);
    //frontLeft.set(1);
    //backRight.set(-1);
    //backLeft.set(1);

  }
//Turning the Robot to the Right
  public void turnRight(){
    //frontLeft.set(1);
    //backLeft.set(1);
    //frontRight.set(1);                    
    //backRight.set(1);


  }


  public void liftWeight(int height) {
    if (encoder.get() * RobotMap.Count_Distance != height) {
      liftMotor.set(0.2);
    } 

    else {
      encoder.reset();
    }

    


  }

}
