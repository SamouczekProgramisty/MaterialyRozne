package pl.samouczekprogramisty.di.after;

import java.util.Random;

public class RandomString {

    private final Random generator;

    public RandomString(Random generator) {
        this.generator = generator;
    }

    public String getString(int length) {
        return generator.ints(length, 'a', 'z' + 1)
                .mapToObj(i -> (char) i)
                .reduce(new StringBuilder(), StringBuilder::append, StringBuilder::append)
                .toString();
    }
}
