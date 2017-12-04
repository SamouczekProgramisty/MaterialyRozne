package pl.samouczekprogramisty.misc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ZipCodeCityCoherentValidator implements ConstraintValidator<ZipCodeCityCoherent, Address> {

    @Override
    public boolean isValid(Address address, ConstraintValidatorContext context) {
        return "00-000".equals(address.getZipCode()) && "Warszawa".equals(address.getPostOfficeCity());
    }

}
