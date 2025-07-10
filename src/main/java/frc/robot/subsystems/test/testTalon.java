package frc.robot.subsystems.test;

import com.ctre.phoenix6.hardware.TalonFX;
import edu.wpi.first.wpilibj.DigitalInput;

public class testTalon implements testIO {
    private TalonFX motor = new TalonFX(1);
    private DigitalInput limit = new DigitalInput(1);

    public testTalon() {

    }

    @Override
    public void run(double v) {
        motor.setVoltage(v);
    }

    @Override
    public void updateInputs(testInputs inputs) {
        inputs.limit = limit.get();
    }
}
