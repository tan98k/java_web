package tan.xml.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

public class demo03 {
    public static void main(String[] args) throws IOException {
        String path = demo03.class.getClassLoader().getResource("student.xml").getPath();
        Document document = Jsoup.parse(new File(path), "utf-8");
        Elements name = document.getElementsByTag("name");
        System.out.println(name.size());
        System.out.println(name.get(0));
        System.out.println("------------------------");
        System.out.println(name.text());
        System.out.println("------------------------");
        System.out.println(name.get(0).text());
        System.out.println("------------------------");
        System.out.println(document.getElementById("tt"));
        System.out.println("------------------------");
        System.out.println(document.getElementsByTag("name").text());
        System.out.println("------------------------");



    }
}
