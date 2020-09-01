package tan.xml.jsoup;



import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

public class jsoupDemo01 {
    public static void main(String[] args) throws IOException {
        String path = jsoupDemo01.class.getClassLoader().getResource("student.xml").getPath();
        Document parse = Jsoup.parse(new File(path), "utf-8");
        Elements name = parse.getElementsByTag("name");
        for(int i = 0; i < name.size(); i++){
            System.out.println(name.get(i));
        }
        System.out.println("---------------------------");
        Elements id = parse.getElementsByAttribute("id");
        System.out.println(id);

        System.out.println("---------------------------");
        Elements number = parse.getElementsByAttributeValue("number","one");
        System.out.println(number);
    }
}
