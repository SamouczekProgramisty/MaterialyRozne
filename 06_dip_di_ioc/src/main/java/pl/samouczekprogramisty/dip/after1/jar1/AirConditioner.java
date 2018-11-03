package pl.samouczekprogramisty.dip.after1.jar1;

import java.util.concurrent.TimeUnit;

public class AirConditioner {
    private static final float THRESHOLD = 3;

    private final float desiredTemperature;
    private Sensor temperatureSensor;

    public AirConditioner(float desiredTemperature, Sensor temperatureSensor) {
        this.desiredTemperature = desiredTemperature;
        this.temperatureSensor = temperatureSensor;
    }

    public void start() throws InterruptedException {
        while (true) {
            if (temperatureSensor.measure() > desiredTemperature) {
                coolDown();
            }
            System.out.println("It's cool.");
            TimeUnit.SECONDS.sleep(5);
        }
    }

    private void coolDown() throws InterruptedException {
        while (temperatureSensor.measure() > desiredTemperature - THRESHOLD) {
            System.out.println("Cooling down");
            // cooling down somehow ;)
            TimeUnit.SECONDS.sleep(5);
        }
    }
}
