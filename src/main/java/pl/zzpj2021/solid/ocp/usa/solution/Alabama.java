package pl.zzpj2021.solid.ocp.usa.solution;

public class Alabama implements SpeedLimitFine {
    private static final int MAX_SPEED = 60;
    private static final double FINE_COEFFICIENT = 0.78;

    @Override
    public double calcSpeedLimitFine(int speed) {
        return (speed > MAX_SPEED) ? speed * FINE_COEFFICIENT : 0;
    }
}
