package org.usfirst.frc.team3596.robot.subsystems;

//import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Cylinder extends Subsystem {
	Solenoid pistonExtend = new Solenoid(1, 0);
	Solenoid pistonRetract = new Solenoid(1, 1);

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    
    
    
    public void extend() {
    	pistonExtend.set(true);
    }
    public void extendOff(){
    	pistonExtend.set(false);//turns off piston after actuated^
    }
    
    
    public void retract(){
    	pistonRetract.set(true);
    }
    public void retractOff(){
    	pistonRetract.set(false);
    }
    
}
