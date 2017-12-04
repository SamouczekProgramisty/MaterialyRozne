package pl.samouczekprogramisty.misc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ZipCodeCityCoherentValidatorReflection implements ConstraintValidator<ZipCodeCityCoherent, Object> {

    private String cityGetterName;

    private String zipCodeGetterName;

    @Override
    public void initialize(ZipCodeCityCoherent constraintAnnotation) {
        String cityAttribute = constraintAnnotation.cityAttribute();
        cityGetterName = getterName(cityAttribute);
        String zipCodeAttribute = constraintAnnotation.zipCodeAttribute();
        zipCodeGetterName = getterName(zipCodeAttribute);
    }

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
        String city = getFieldValue(value, getterMethod(value, cityGetterName));
        String zipCode = getFieldValue(value, getterMethod(value, zipCodeGetterName));

        return "00-000".equals(zipCode) && "Warszawa".equals(city);
    }

    private String getFieldValue(Object object, Method getter) {
        try {
            return (String) getter.invoke(object);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    private Method getterMethod(Object value, String getterName) {
        try {
            return value.getClass().getMethod(getterName);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    private String getterName(String attributeName) {
        return "get" + attributeName.substring(0, 1).toUpperCase() + attributeName.substring(1);
    }
}
