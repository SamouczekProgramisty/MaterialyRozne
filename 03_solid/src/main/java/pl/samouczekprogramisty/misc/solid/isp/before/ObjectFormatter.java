package pl.samouczekprogramisty.misc.solid.isp.before;

public interface ObjectFormatter {

    byte[] toPDF(Object someObject);

    String toXML(Object someObject);

    String toJSON(Object someObject);

}
