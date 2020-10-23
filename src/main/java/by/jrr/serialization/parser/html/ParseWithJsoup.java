package by.jrr.serialization.parser.html;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Map;

import static by.jrr.serialization.io.service.FileService.loaderTextFile;

public class ParseWithJsoup {

    private static Logger log = LoggerFactory.getLogger(ParseWithJsoup.class);

//    public static void main(String[] args) throws IOException {
//        Document doc = Jsoup.connect("https://en.wikipedia.org/").get();
//        log.info(doc.title());
//        Elements newsHeadlines = doc.select("#mp-itn b a");
//        for (Element headline : newsHeadlines) {
//            log.info(String.format("%s\n\t%s",
//                    headline.attr("title"), headline.absUrl("href")));
//        }
//
//        Element element = doc.getElementById("mp-tfa");
//        Elements paragraphs = element.getElementsByTag("p");
//        for (Element paragraph : paragraphs) {
//            log.info(paragraph.text());
//        }
//    }

    public static void main(String[] args) throws IOException {
        Document doc = Jsoup.connect("https://google.com/").get();
        System.out.println(doc);
        Writer writer = new FileWriter("./src/main/resources/google.html");
        String data = doc.toString();
        writer.write(data);
        writer.close();
    }
}
