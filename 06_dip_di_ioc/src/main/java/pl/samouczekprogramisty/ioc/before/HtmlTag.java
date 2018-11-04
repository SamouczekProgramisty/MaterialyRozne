package pl.samouczekprogramisty.ioc.before;

public class HtmlTag {

    private final String tag;
    private final String body;

    public HtmlTag(String tag, String body) {
        this.tag = tag;
        this.body = body;
    }

    @Override
    public String toString() {
        return String.format("<%s>%s</%s>", tag, body, tag);
    }
}
