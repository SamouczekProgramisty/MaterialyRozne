package pl.samouczekprogramisty.dip.after1.jar2;

import pl.samouczekprogramisty.dip.after1.jar1.Sensor;

import java.util.Random;

public class Thermometer implements Sensor {
    @Override
    public float measure() {
        return new Random().nextFloat();
    }
}
