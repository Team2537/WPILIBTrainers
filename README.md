# Lesson 2: Encoders
<hr>
## Introduction

An encoder is a sensor that measures the rotation of a motor. It's very useful for determining things like the speed of a motor, or the distance it has rotated.

## Syntax

Encoders are an object like most other sensors.
You can get the `RelativeEncoder` object from a SparkMax motor controller by calling the `getEncoder()` method on the motor controller object.

```kotlin
val motor: CANSparkMax = CANSparkMax(1, MotorType.kBrushless)
val encoder: RelativeEncoder = motor.getEncoder()
```

## Methods

### `getVelocity()`

Returns the velocity of the encoder in rotations per minute (RPM).

```kotlin
val motor: CANSparkMax = CANSparkMax(1, MotorType.kBrushless)
val encoder: RelativeEncoder = motor.getEncoder()

val velocity: Double = encoder.getVelocity()
```

### `getPosition()`

Returns the position of the encoder in rotations.

```kotlin
val motor: CANSparkMax = CANSparkMax(1, MotorType.kBrushless)
val encoder: RelativeEncoder = motor.getEncoder()

val position: Double = encoder.getPosition()
```

### SmartDashboard

As a quick note, you can display values (such as the encoder's velocity) on the SmartDashboard using the `SmartDashboard.putNumber()` method.
This method takes two parameters: the name of the value, and the value itself, and must be called every time you want to update the value.
This can be done using the `Periodic()` method.

```kotlin
val motor: CANSparkMax = CANSparkMax(1, MotorType.kBrushless)
val encoder: RelativeEncoder = motor.getEncoder()

SmartDashboard.putNumber("Encoder Velocity", encoder.getVelocity())
```

## Now go practice!

Use the template contained within [MotorSubsystem](src/main/kotlin/frc/robot/subsystems/MotorSubsystem.kt) to learn how to use encoders.


