package by.jrr.serialization.parser.xml.service.sax;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;

public class CoursesSaxParser {

    public static void run() throws ParserConfigurationException, SAXException, IOException {
        File input = new File("./src/main/resources/parser/courses.xml");
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();
        parser.parse(input, new CoursesXmlHandler());
    }
}
