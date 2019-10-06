package pl.samouczekprogramisty.misc.validation.exercise;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class BirthDayValidator implements ConstraintValidator<AtLeast4YearsOld, LocalDateTime> {

    private static final int DAYS_IN_YEAR = 365;

    @Override
    public boolean isValid(LocalDateTime value, ConstraintValidatorContext context) {
        LocalDateTime fourYearsAgo = LocalDateTime.now().minus(Duration.of(4 * DAYS_IN_YEAR, ChronoUnit.DAYS));
        return value.isBefore(fourYearsAgo);
    }
}
