# Lesson 1: Motors

In FRC we use a type of motor controller called a SparkMax. These motor controllers are controlled by a protocol called CAN. CAN is a protocol that allows us to control multiple devices on the same wire. This is useful because it allows us to use less wires and therefore less weight.

## Defining a Motor Controller Object

Motor Controllers are objects, and therefore are defined the same way as any other object.

```kotlin
val motorController = CANSparkMax(0, MotorType.kBrushless)
```
