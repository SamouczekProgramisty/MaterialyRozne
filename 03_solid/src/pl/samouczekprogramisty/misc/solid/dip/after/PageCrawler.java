package pl.samouczekprogramisty.misc.solid.dip.after;

import java.io.IOException;
import java.util.List;

public class PageCrawler {

    private final HTTPFetcher fetcher;

    private final HTMLTokenizer tokenizer;

    public PageCrawler(HTTPFetcher fetcher, HTMLTokenizer tokenizer) {
        this.fetcher = fetcher;
        this.tokenizer = tokenizer;
    }

    public List<String> findLinks(String url) throws IOException {
        String response = fetcher.fetch(url);
        List<String> tokens = tokenizer.tokenize(response);
        return findLinks(tokens);
    }

    private List<String> findLinks(List<String> tokens) {
        return tokens; // pick only links here
    }
}
