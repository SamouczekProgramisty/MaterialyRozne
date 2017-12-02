package pl.samouczekprogramisty.misc.solid.ocp.before;


import java.math.BigDecimal;
import java.util.Date;

public class Contract {

    private final Date start;

    private final Date end;

    public Contract(Date start, Date end) {
        this.start = start;
        this.end = end;
    }

    public Date getStart() {
        return start;
    }

    public Date getEnd() {
        return end;
    }

    public BigDecimal getMonthlySubscriptionFee() {
        // compute based on end and start
        return BigDecimal.ONE;
    }
}