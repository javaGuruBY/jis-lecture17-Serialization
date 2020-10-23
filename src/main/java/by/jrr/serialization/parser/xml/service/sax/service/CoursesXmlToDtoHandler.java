package by.jrr.serialization.parser.xml.service.sax.service;

import by.jrr.serialization.parser.xml.service.sax.bean.Course;
import by.jrr.serialization.parser.xml.service.sax.bean.CoursesXmlDto;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;

public class CoursesXmlToDtoHandler extends DefaultHandler {

    private CoursesXmlDto coursesXmlDto;
    private String elementValue;

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        elementValue = new String(ch, start, length);
    }

    @Override
    public void startDocument() throws SAXException {
        coursesXmlDto = new CoursesXmlDto();
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
       switch (qName) {
           case "courses":
               coursesXmlDto.setCourses(new ArrayList<>());
               break;
           case "course":
               var course = new Course();
               course.setId(Integer.valueOf(attributes.getValue("id")));
               course.setStudents(Integer.valueOf(attributes.getValue("students")));
               coursesXmlDto.getCourses().add(course);
       }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        switch (qName) {
            case "name":
                lastElement().setName(elementValue);
                break;
            case "description":
                lastElement().setDescription(elementValue);
        }
    }

    private Course lastElement() {
        return coursesXmlDto.getCourses().get(
                coursesXmlDto.getCourses().size()-1);
    }

    public List<Course> getCourses() {
        return this.coursesXmlDto.getCourses();
    }
}
