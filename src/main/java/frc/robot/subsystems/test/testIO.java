package frc.robot.subsystems.test;

import org.littletonrobotics.junction.AutoLog;

public interface testIO {

    @AutoLog
    public static class testInputs {
        public boolean limit = true;
    }

    public void run(double v);

    public void updateInputs(testInputs inputs);

}
