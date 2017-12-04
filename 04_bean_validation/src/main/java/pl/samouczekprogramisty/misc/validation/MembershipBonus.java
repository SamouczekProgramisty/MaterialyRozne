package pl.samouczekprogramisty.misc.validation;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;

public class MembershipBonus {

    @Valid
    private PaidAccount userAccount;

    @NotEmpty
    private String bonusName;

    public MembershipBonus(@Valid PaidAccount userAccount, @NotEmpty String bonusName) {
        this.userAccount = userAccount;
        this.bonusName = bonusName;
    }

    public PaidAccount getUserAccount() {
        return userAccount;
    }

    public String getBonusName() {
        return bonusName;
    }
}
