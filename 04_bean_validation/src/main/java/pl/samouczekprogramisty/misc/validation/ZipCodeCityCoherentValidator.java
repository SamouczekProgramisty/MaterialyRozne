package pl.samouczekprogramisty.misc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ZipCodeCityCoherentValidator implements ConstraintValidator<ZipCodeCityCoherent, Address> {

    @Override
    public boolean isValid(Address address, ConstraintValidatorContext context) {
                PostCodeService postCodeService = new PostCodeService();
        List<String> cityName = postCodeService.getCity(address.getZipCode());

        return cityName.contains(address.getPostOfficeCity());    }
    }

}
