package pl.samouczekprogramisty.dip.after2.jar1;

import pl.samouczekprogramisty.dip.after2.jar2.Sensor;

import java.util.Random;

public class Thermometer implements Sensor {
    @Override
    public float measure() {
        return new Random().nextFloat();
    }
}
