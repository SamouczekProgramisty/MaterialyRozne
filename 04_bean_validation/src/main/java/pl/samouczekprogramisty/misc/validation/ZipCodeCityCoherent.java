package pl.samouczekprogramisty.misc.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target(TYPE)
@Retention(RUNTIME)
@Constraint(validatedBy = ZipCodeCityCoherentValidator.class)
public @interface ZipCodeCityCoherent {
    String cityAttribute();

    String zipCodeAttribute();

    String message() default "{pl.samouczekprogramisty.misc.validation.ZipCodeCityCoherent.message}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
