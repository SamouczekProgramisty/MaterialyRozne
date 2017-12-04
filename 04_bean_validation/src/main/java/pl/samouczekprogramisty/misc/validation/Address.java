package pl.samouczekprogramisty.misc.validation;

import javax.validation.constraints.NotEmpty;

@ZipCodeCityCoherent(zipCodeAttribute="zipCode", cityAttribute="postOfficeCity")
public class Address {

    @NotEmpty
    private String zipCode;

    @NotEmpty
    private String postOfficeCity;

    @NotEmpty
    private String street;

    @NotEmpty
    private String number;

    public Address(@NotEmpty String zipCode, @NotEmpty String postOfficeCity, @NotEmpty String street, @NotEmpty String number) {
        this.zipCode = zipCode;
        this.postOfficeCity = postOfficeCity;
        this.street = street;
        this.number = number;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getPostOfficeCity() {
        return postOfficeCity;
    }

    public String getStreet() {
        return street;
    }

    public String getNumber() {
        return number;
    }
}
