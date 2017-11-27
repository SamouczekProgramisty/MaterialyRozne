package pl.samouczekprogramisty.misc.solid.ocp.before;

public class LeafletPDFFormatter {

    private final Leaflet leaflet;

    public LeafletPDFFormatter(Leaflet leaflet) {
        this.leaflet = leaflet;
    }

    public byte[] format() {
        return "...".getBytes();
    }

}
