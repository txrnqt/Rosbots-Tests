package frc.robot.subsystems.test;

import org.littletonrobotics.junction.Logger;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class test extends SubsystemBase {
    testIO io;
    private testInputsAutoLogged inputs = new testInputsAutoLogged();

    public test(testIO io) {
        this.io = io;
        io.updateInputs(inputs);
    }

    @Override
    public void periodic() {
        io.updateInputs(inputs);
        Logger.processInputs("test", inputs);
    }

    public Command CMD() {
        return runEnd(() -> io.run(2), () -> io.run(0));
    }
}
