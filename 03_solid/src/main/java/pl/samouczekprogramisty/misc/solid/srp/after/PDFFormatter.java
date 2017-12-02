package pl.samouczekprogramisty.misc.solid.srp.after;

public class PDFFormatter {

    private final Contract contract;

    public PDFFormatter(Contract contract) {
        this.contract = contract;
    }

    public byte[] format() {
        return "...".getBytes();
    }

}
