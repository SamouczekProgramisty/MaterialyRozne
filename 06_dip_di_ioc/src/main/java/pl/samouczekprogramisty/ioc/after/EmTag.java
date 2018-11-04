package pl.samouczekprogramisty.ioc.after;

public class EmTag extends HtmlTag {

    private String body;

    public EmTag(String body) {
        this.body = body;
    }

    @Override
    protected String getTag() {
        return "em";
    }

    @Override
    protected String getBody() {
        return body;
    }
}
