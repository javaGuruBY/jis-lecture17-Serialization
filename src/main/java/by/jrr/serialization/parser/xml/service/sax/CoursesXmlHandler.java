package by.jrr.serialization.parser.xml.service.sax;

import by.jrr.serialization.parser.xml.XmlParser;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static by.jrr.serialization.parser.xml.XmlParser.log;

public class CoursesXmlHandler extends DefaultHandler {


    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        log.info("Tag " + qName);
        log.info("Tag " + uri);
        log.info("Tag " + localName);
        log.info("Tag " + attributes);
        if (qName.equals("course")) {
            log.info("course id: " + attributes.getValue("id"));
            log.info("students: " + attributes.getValue("students"));
        }
        if (qName.equals("name")) {

        }
        if (qName.equals("description")) {
            log.info("description : " + attributes.getValue("id"));
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        log.info(String.format("characters %s, %s, %s", buildString(ch), start, length));
    }

    private String buildString(char[] ch) {
        return Stream.of(ch)
                .map(String::valueOf)
                .collect(Collectors.joining("", "{", "}"));
    }
}
