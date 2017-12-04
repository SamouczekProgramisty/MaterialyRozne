package pl.samouczekprogramisty.misc.validation;

import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

public class PaidAccount {

    @NotNull
    @Size(min=3)
    private String owner;

    @Future
    private Date validUntil;

    public PaidAccount(@NotNull @Size(min = 3) String owner, @Future Date validUntil) {
        this.owner = owner;
        this.validUntil = validUntil;
    }

    public String getOwner() {
        return owner;
    }

    public Date getValidUntil() {
        return validUntil;
    }
}
