# Lesson 1: Timed Robot
<hr>

In FRC there are a few ways we can control a robot, but the simplest way is a "Timed" Robot. So we'll start with that.

## What is a Timed Robot?
<hr>

TimedRobot is a structure for programming a robot where the code runs in a loop and is executed at a regular refresh rate.
In our case the refresh rate is 50 times per second, or 50Hz. This leads to our code being executed every 20ms.

## How do we use it?

When the robot is running, there are several modes it can be in, the three important ones at the moment are the following:
- Disabled
  - The robot is powered on, but not enabled. This is the state the robot is in when it is first powered on.
- Autonomous
  - The robot is enabled and running autonomously. This is the state the robot is in when the match starts.
- Teleop
  - The robot is enabled and being controlled by a driver. This is the state the robot is in when the match is not in autonomous mode.

In each of these modes (and a few others) there is an Init method and a Periodic method.
The Init method is called when the robot enters the mode,
and the Periodic method is called every 20ms while the robot is in the mode.

There is also a robot-wide Init and Periodic method that are called when the robot is first powered on and every 20ms while the robot is powered on, respectively.

## What do we do with it?

In the Init methods we set up the robot for the mode it is entering.
This could be setting the initial state of some logic statement, or configuring a motor

In the Periodic methods we update the state of the robot.
This usually involves reading sensors, and the driver controls, and updating the state of the robot accordingly.


