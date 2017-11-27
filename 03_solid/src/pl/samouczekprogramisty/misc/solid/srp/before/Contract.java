package pl.samouczekprogramisty.misc.solid.srp.before;

import java.math.BigDecimal;
import java.util.Date;

public class Contract {

    private final Date start;

    private final Date end;

    public Contract(Date start, Date end) {
        this.start = start;
        this.end = end;
    }

    public BigDecimal getMonthlySubscriptionFee() {
        // compute based on end and start
        return BigDecimal.ONE;
    }

    public byte[] formatAsPDF() {
        // prepare PDF version of the contract
        return new byte[]{};
    }
}
