package by.jrr.serialization.parser.xml;

import by.jrr.serialization.parser.xml.service.dom.Course;
import by.jrr.serialization.parser.xml.service.dom.CoursesDomParser;
import by.jrr.serialization.parser.xml.service.sax.CoursesSaxParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.IOException;
import java.util.List;

public class XmlParser {

    public static final Logger log = LoggerFactory.getLogger(XmlParser.class);

    public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException, TransformerException {
//        CoursesSaxParser.run();
//        CoursesDomParser.run();
        List<Course> courses = CoursesDomParser.getCourses();
//        log.info("coursers: " + courses);
        CoursesDomParser.write();
    }
}
