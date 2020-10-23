package by.jrr.serialization.parser.xml;

import by.jrr.serialization.parser.xml.service.sax.service.CoursesSaxParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.IOException;

public class XmlParser {

    public static final Logger log = LoggerFactory.getLogger(XmlParser.class);

    public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException, TransformerException {
//        CoursesSaxParser.run();
//        CoursesSaxParser.printDtoFromXml();
        CoursesSaxParser.printCourseListFromXml();
//        CoursesDomParser.run();
//        List<Course> courses = CoursesDomParser.getCourses();
//        log.info("coursers: " + courses);
//        CoursesDomParser.write();

    }
}
