package pl.samouczekprogramisty.dip.before;

import java.util.concurrent.TimeUnit;

public class AirConditioner {
    private static final float THRESHOLD = 3;

    private final float desiredTemperature;
    private Thermometer thermometer;

    public AirConditioner(float desiredTemperature, Thermometer thermometer) {
        this.desiredTemperature = desiredTemperature;
        this.thermometer = thermometer;
    }

    public void start() throws InterruptedException {
        while (true) {
            if (thermometer.measure() > desiredTemperature) {
                coolDown();
            }
            System.out.println("It's cool.");
            TimeUnit.SECONDS.sleep(5);
        }
    }

    private void coolDown() throws InterruptedException {
        while (thermometer.measure() > desiredTemperature - THRESHOLD) {
            System.out.println("Cooling down");
            // cooling down somehow ;)
            TimeUnit.SECONDS.sleep(5);
        }
    }
}
