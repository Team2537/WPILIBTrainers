package frc.robot.subsystems

import com.revrobotics.CANSparkMax
import com.revrobotics.CANSparkMaxLowLevel
import com.revrobotics.RelativeEncoder
import edu.wpi.first.wpilibj2.command.SubsystemBase;

/*
- Create an instance of a sparkmax encoder
- Log the encoder position and velocity to the dashboard
- Spin the wheel/motor in real life, and watch the encoder position and velocity change on the dashboard
 */

object MotorSubsystem : SubsystemBase() {

    val motor: CANSparkMax = CANSparkMax(0, CANSparkMaxLowLevel.MotorType.kBrushless)
    // Initialize the encoder here

    override fun periodic() {
        // Put encoder position and velocity on the dashboard here
    }



}