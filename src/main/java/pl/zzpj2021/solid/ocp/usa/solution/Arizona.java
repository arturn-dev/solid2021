package pl.zzpj2021.solid.ocp.usa.solution;

public class Arizona implements SpeedLimitFine {
    private static final int MAX_SPEED = 110;

    @Override
    public double calcSpeedLimitFine(int speed) {
        if (speed > MAX_SPEED * 1.75) {
            return 250;
        } else if (speed > MAX_SPEED * 1.3) {
            return 150;
        } else if (speed > MAX_SPEED) {
            return 100;
        }

        return 0;
    }
}
