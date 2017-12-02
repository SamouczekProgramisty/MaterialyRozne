package pl.samouczekprogramisty.misc.solid.ocp.after;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PDFMetadata {

    public final List<String> metadata;

    public PDFMetadata(String... metadata) {
        this.metadata = Arrays.asList(metadata);
    }

    public List<String> getMetadata() {
        return Collections.unmodifiableList(metadata);
    }
}
