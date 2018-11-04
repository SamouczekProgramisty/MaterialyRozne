package pl.samouczekprogramisty.di.before;

import java.util.Random;

public class RandomString {

    private final Random generator = new Random();

    public String getString(int length) {
        return generator.ints(length, 'a', 'z' + 1)
                .mapToObj(i -> (char) i)
                .reduce(new StringBuilder(), StringBuilder::append, StringBuilder::append)
                .toString();
    }
}
