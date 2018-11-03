package pl.samouczekprogramisty.dip.before;

import java.util.Random;

public class Thermometer {
    public float measure() {
        return new Random().nextFloat();
    }
}
