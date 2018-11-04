package pl.samouczekprogramisty.ioc.after;

public abstract class HtmlTag {

    @Override
    public String toString() {
        String tag = getTag();
        String body = getBody();
        return String.format("<%s>%s</%s>", tag, body, tag);
    }

    protected abstract String getTag();

    protected abstract String getBody();
}
