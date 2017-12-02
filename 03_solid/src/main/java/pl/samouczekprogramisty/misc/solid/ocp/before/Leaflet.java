package pl.samouczekprogramisty.misc.solid.ocp.before;

public class Leaflet {

    private final String title;

    private final String location;

    public Leaflet(String title, String location) {
        this.title = title;
        this.location = location;
    }

    public String getTitle() {
        return title;
    }

    public String getLocation() {
        return location;
    }
}
