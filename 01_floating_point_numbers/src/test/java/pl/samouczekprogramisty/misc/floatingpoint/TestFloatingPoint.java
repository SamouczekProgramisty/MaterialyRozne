package pl.samouczekprogramisty.misc.floatingpoint;

import org.junit.Test;
import pl.samouczekprogramisty.misc.floatingpoint.FloatingPoint.Format;

import java.math.BigDecimal;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

public class TestFloatingPoint {

    @Test
    public void shouldBeAbleToParseSinglePrecisionFloatingPointNumber() {
        assertThat(FloatingPoint.instantiate(Format.SINGLE_PRECISION, "0.1").toString(), is(equalTo("0 01111011 10011001100110011001101")));
    }

    @Test
    public void shouldBeAbleToParseSinglePrecisionFloatingPointNumber2() {
        assertThat(FloatingPoint.instantiate(Format.SINGLE_PRECISION, "270.125").toString(), is(equalTo("0 10000111 00001110001000000000000")));
    }

    @Test
    public void shouldBeAbleToParseDoublePrecisionFloatingPointNumber() {
        assertThat(FloatingPoint.instantiate(Format.DOUBLE_PRECISION, "0.1").toString(), is(equalTo("0 01111111011 1001100110011001100110011001100110011001100110011010")));
    }

    @Test
    public void shouldBeAbleToParseDoublePrecisionFloatingPointNumber2() {
        assertThat(FloatingPoint.instantiate(Format.DOUBLE_PRECISION, "270.125").toString(), is(equalTo("0 10000000111 0000111000100000000000000000000000000000000000000000")));
    }

    @Test
    public void shouldBeAbleToShowErrorDuringConversion() {
        assertThat(FloatingPoint.instantiate(Format.SINGLE_PRECISION, "0.1").getError(), is(greaterThan(BigDecimal.ZERO)));
    }

}
