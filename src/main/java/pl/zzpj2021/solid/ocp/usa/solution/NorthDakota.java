package pl.zzpj2021.solid.ocp.usa.solution;

public class NorthDakota implements SpeedLimitFine {
    private static final int MAX_SPEED = 90;
    private static final double FINE_COEFFICIENT = 0.46;

    @Override
    public double calcSpeedLimitFine(int speed) {
        return (speed > MAX_SPEED) ? speed * FINE_COEFFICIENT : 0;
    }

}
