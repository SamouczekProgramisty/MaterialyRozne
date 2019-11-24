package pl.samouczekprogramisty.misc.validation.exercise;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import javax.validation.constraints.Email;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Objects;
import java.util.Scanner;

public class User {

    @Size(min = 3)
    @Pattern(regexp = "[A-Z][a-z]+")
    private String name;

    @Past
    @AtLeast4YearsOld
    private LocalDateTime birthday;

    @Email
    private String email;

    public User() {
    }

    public User(String name, LocalDateTime birthday, String email) {
        this.name = name;
        this.birthday = birthday;
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                ", email='" + email + '\'' +
                '}';
    }

    public static void main(String[] args) {
        ValidatorFactory validationFactory = Validation.buildDefaultValidatorFactory();
        Validator validator = validationFactory.getValidator();

        User user = getUserFromInput();

        for (ConstraintViolation<User> cv : validator.validate(user)) {
            System.err.println(cv.getPropertyPath().toString() + " " + cv.getMessage());
        }
    }

    private static User getUserFromInput() {
        Scanner input = new Scanner(System.in);
        input.useDelimiter(System.lineSeparator());
        System.out.println("Podaj imię: ");
        String name = input.next();

        System.out.println("Podaj datę urodzenia (YYYY-MM-dd hh:mm): ");
        LocalDateTime birthday = LocalDateTime.parse(
                input.next("\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}"),
                new DateTimeFormatterBuilder()
                        .append(DateTimeFormatter.ISO_LOCAL_DATE)
                        .appendLiteral(' ')
                        .append(DateTimeFormatter.ISO_LOCAL_TIME)
                        .toFormatter()
        );

        System.out.println("Podaj adres email: ");
        String email = input.next();

        return new User(name, birthday, email);
    }

}
