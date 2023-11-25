# Lesson 1: Motors

In FRC we use a type of motor controller called a SparkMax. These motor controllers are controlled by a protocol called CAN. CAN is a protocol that allows us to control multiple devices on the same wire. This is useful because it allows us to use less wires and therefore less weight.

## Defining a Motor Controller Object

Motor Controllers are objects, and therefore are defined the same way as any other object.

When defining a SparkMax, we need to specify the CAN ID and the type of motor. The CAN ID is the number that is assigned to the motor controller. We use Neos, which are brushless motors, so we need to specify that the motor is brushless.

```kotlin
val motorController: CANSparkMax = CANSparkMax(0, MotorType.kBrushless)
```

## Controlling the Motor

To control the motor, we need to set the power of the motor. The power is a number between -1 and 1. A power of 1 is full speed forward, and a power of -1 is full speed backwards. A power of 0 is no movement.

Controlling the motor is as simple as using the `.set()` method.

```kotlin
motorController.set(0.5) // Sets the motor to half speed forward
```

## Stopping the Motor

To stop the motor, we need to set the power to 0. This will stop the motor.

```kotlin
motorController.set(0) // Stops the motor
```

## Complex Configurations

SparkMaxes have a couple of options that can be configured. These options are configured using methods on the motor controller object. After changing motor settings you must call the `.burnFlash()` method to save the settings to the motor controller.

### Inverting the Motor

To invert the motor, we need to use the `.setInverted()` method. This method takes a boolean as an argument. If the boolean is true, the motor will be inverted. If the boolean is false, the motor will not be inverted.

```kotlin
motorController.setInverted(true) // Inverts the motor

motorController.burnFlash() // Saves the settings to the motor controller
```

### Setting the idle mode

The idle mode is what the motor does when it's not being told to move. The two options are `kBrake` and `kCoast`. `kBrake` will cause the motors to stop and lock their rotation. `kCoast` will cause the motors to continue spinning with the momentum they had before they were stopped.

```kotlin
motorController.setIdleMode(IdleMode.kBrake) // Sets the idle mode to brake

motorController.burnFlash() // Saves the settings to the motor controller
```

## Now go practice!

Contained within the [MotorSubsystem](src/main/java/frc/robot/subsystems/MotorSubsystem.kt)


