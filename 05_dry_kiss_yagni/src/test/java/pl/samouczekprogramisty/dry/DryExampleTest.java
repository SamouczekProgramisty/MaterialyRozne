package pl.samouczekprogramisty.dry;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.junit.MatcherAssert.assertThat;

class DryExampleTest {

    private static class TestCaseData {
        private final int input;
        private final int base;
        private final String output;

        TestCaseData(int input, int base, String output) {
            this.input = input;
            this.base = base;
            this.output = output;
        }
    }

    private static Stream<TestCaseData> testCases() {
        return Stream.of(
                new TestCaseData(123, 2, "1111011"),
                new TestCaseData(-123, 2, "-1111011"),
                new TestCaseData(4, 2, "100"),
                new TestCaseData(-4, 2, "-100"),
                new TestCaseData(0, 2, "0")
        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void shouldConvertDecimalToBinaryBeforeRefactoring(TestCaseData testCaseData) {
        assertThat(DryExample.convertWET(testCaseData.input, testCaseData.base), is(testCaseData.output));
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void shouldConvertDecimalToBinaryAfterRefactoring(TestCaseData testCaseData) {
        assertThat(DryExample.convertDRY(testCaseData.input, testCaseData.base), is(testCaseData.output));
    }

}