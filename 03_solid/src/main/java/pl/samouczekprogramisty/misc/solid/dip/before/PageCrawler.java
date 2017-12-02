package pl.samouczekprogramisty.misc.solid.dip.before;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Collections;
import java.util.List;

public class PageCrawler {

    public List<String> findLinks(String url) throws IOException {
        HttpURLConnection connection = makeRequest(url);
        validateResponse(connection);
        String content = getResponse(connection);
        return parseLinks(content);
    }

    private List<String> parseLinks(String content) {
        return Collections.emptyList(); // do some magic with content
    }

    private String getResponse(HttpURLConnection connection) throws IOException {
        return connection.getContent().toString();
    }

    private HttpURLConnection makeRequest(String url) {
        return null; //
    }

    private void validateResponse(HttpURLConnection connection) throws IOException {
        if (connection.getResponseCode() != 200) {
            throw new IllegalStateException("Wrong response code!");
        }
        if (connection.getContentLength() < 100) {
            throw new IllegalStateException("Too small response!");
        }
    }

}
