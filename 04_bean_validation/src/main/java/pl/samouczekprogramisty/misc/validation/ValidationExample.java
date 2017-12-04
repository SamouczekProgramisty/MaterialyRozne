package pl.samouczekprogramisty.misc.validation;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Calendar;
import java.util.Set;

public class ValidationExample {

    private final Validator validator;

    public ValidationExample() {
        ValidatorFactory validationFactory = Validation.buildDefaultValidatorFactory();
        validator = validationFactory.getValidator();
    }

    public static void main(String[] args) {
        ValidationExample example = new ValidationExample();
//        example.showSimpleValidation();
//        example.showNestedValidation();
        example.showCustomValidation();
    }

    private void showSimpleValidation() {
        PaidAccount account = new PaidAccount("mp", Calendar.getInstance().getTime());
        Set<ConstraintViolation<PaidAccount>> validationErrors = validator.validate(account);
        for (ConstraintViolation<PaidAccount> validationError : validationErrors) {
            System.out.println(validationError.getPropertyPath().toString() + " " + validationError.getMessage());
        }
    }

    private void showNestedValidation() {
        PaidAccount account = new PaidAccount("mp", Calendar.getInstance().getTime());
        MembershipBonus bonus = new MembershipBonus(account, null);

        Set<ConstraintViolation<MembershipBonus>> validationErrors = validator.validate(bonus);
        for (ConstraintViolation<MembershipBonus> validationError : validationErrors) {
            System.out.println(validationError.getPropertyPath().toString() + " " + validationError.getMessage());
        }
    }

    private void showCustomValidation() {
        Address address = new Address("00-000", "Wroclaw", "Ruska", "123");

        Set<ConstraintViolation<Address>> validationErrors = validator.validate(address);
        for (ConstraintViolation<Address> validationError : validationErrors) {
            System.out.println(validationError.getPropertyPath().toString() + " " + validationError.getMessage());
        }
    }
}
