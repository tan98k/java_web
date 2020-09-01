package tan.xml.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class demo02 {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://www.baidu.com/s?tn=80035161_2_dg&wd=jsoup");
        Document parse = Jsoup.parse(url, 10000);
        System.out.println(parse);
    }
}
