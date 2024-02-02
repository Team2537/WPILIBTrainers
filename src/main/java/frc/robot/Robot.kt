package frc.robot

import edu.wpi.first.wpilibj.TimedRobot

/**
 * The VM is configured to automatically run this object (which basically functions as a singleton class),
 * and to call the functions corresponding to each mode, as described in the TimedRobot documentation.
 * This is written as an object rather than a class since there should only ever be a single instance, and
 * it cannot take any constructor arguments. This makes it a natural fit to be an object in Kotlin.
 *
 * If you change the name of this object or its package after creating this project, you must also update
 * the `Main.kt` file in the project. (If you use the IDE's Rename or Move refactorings when renaming the
 * object or package, it will get changed everywhere.)
 */
object Robot : TimedRobot()
{

    /**
     * This method is run when the robot is first started up and should be used for any
     * initialization code.
     */
    override fun robotInit()
    {

    }

    /**
     * This method is called every 20 ms, no matter the mode. Use this for items like
     * diagnostics that you want ran during disabled, autonomous, teleoperated and test.
     *
     * This runs after the mode specific periodic methods, but before LiveWindow and
     * SmartDashboard integrated updating.
     */
    override fun robotPeriodic()
    {

    }

    /** This method is called once each time the robot enters Disabled mode.  */
    override fun disabledInit()
    {

    }

    override fun disabledPeriodic()
    {

    }

    override fun autonomousInit()
    {

    }

    /** This method is called periodically during autonomous.  */
    override fun autonomousPeriodic()
    {
    }

    override fun teleopInit()
    {

    }

    /** This method is called periodically during operator control.  */
    override fun teleopPeriodic()
    {

    }

    override fun testInit()
    {

    }

    /** This method is called periodically during test mode.  */
    override fun testPeriodic()
    {

    }

    /** This method is called once when the robot is first started up.  */
    override fun simulationInit()
    {

    }

    /** This method is called periodically whilst in simulation.  */
    override fun simulationPeriodic()
    {

    }
}