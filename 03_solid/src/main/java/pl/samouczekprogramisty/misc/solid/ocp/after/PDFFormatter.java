package pl.samouczekprogramisty.misc.solid.ocp.after;

public class PDFFormatter {

    private final PDFMetadata metadata;

    public PDFFormatter(PDFMetadata metadata) {
        this.metadata = metadata;
    }

    public byte[] format() {
        return metadata.toString().getBytes();
    }

}
