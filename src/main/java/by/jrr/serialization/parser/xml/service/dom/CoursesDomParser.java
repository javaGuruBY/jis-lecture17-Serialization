package by.jrr.serialization.parser.xml.service.dom;

import by.jrr.serialization.parser.xml.XmlParser;
import lombok.NoArgsConstructor;
import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static by.jrr.serialization.parser.xml.XmlParser.*;

public class CoursesDomParser {

    public static void run() throws ParserConfigurationException, IOException, SAXException {
        File input = new File("./src/main/resources/parser/courses.xml");
        DocumentBuilderFactory factory
                = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse(input);

        NodeList courses = doc.getElementsByTagName("course");

        for (int i= 0; i < courses.getLength(); i++) {
            Node course = courses.item(i);
            NamedNodeMap attr = course.getAttributes();
            log.info("id " + attr.getNamedItem("id").getTextContent());
            log.info("students " + attr.getNamedItem("students").getTextContent());

            NodeList courseFields = course.getChildNodes();

            for (int k= 0; k < courseFields.getLength(); k++) {

                Node field = courseFields.item(k);

                if(field.getNodeType() == Node.ELEMENT_NODE) {
                    if(field.getNodeName().equals("name")) {
                        log.info("name " + field.getTextContent());
                    }
                    if(field.getNodeName().equals("description")) {
                        log.info("description " + field.getTextContent());
                    }
                }
            }
        }
    }

    public static List<Course> getCourses() throws IOException, SAXException, ParserConfigurationException {
        List<Course> courseList = new ArrayList<>();
        NodeList courses = readCoursesAsNodes();
        for (int i= 0; i < courses.getLength(); i++) {
            courseList.add(getCourseFromNode(courses.item(i)));
        }
        return courseList;
    }

    private static NodeList readCoursesAsNodes() throws ParserConfigurationException, IOException, SAXException {
        File input = new File("./src/main/resources/parser/courses.xml");

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse(input);

        NodeList courses = doc.getElementsByTagName("course");

        return courses;
    }

    private static Course getCourseFromNode(Node courseNode) {
        Course course = new Course();
        NamedNodeMap attr = courseNode.getAttributes();
        course.setId(Integer.valueOf(attr.getNamedItem("id").getTextContent()));
        course.setStudents(Integer.valueOf(attr.getNamedItem("students").getTextContent()));

        NodeList courseFields = courseNode.getChildNodes();
        for (int k= 0; k < courseFields.getLength(); k++) {
            Node field = courseFields.item(k);
            if(field.getNodeType() == Node.ELEMENT_NODE) {
                if(field.getNodeName().equals("name")) {
                    course.setName(field.getTextContent());
                }
                if(field.getNodeName().equals("description")) {
                    course.setDescription(field.getTextContent());
                }
            }
        }
        return course;
    }

    public static void write() throws IOException, ParserConfigurationException, TransformerException, SAXException {
        File input = new File("./src/main/resources/parser/courses.xml");
        DocumentBuilderFactory factory
                = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse(input);

        Element element = doc.createElement("In_the_end");
        element.setTextContent("text in new Tag");

        Element elementInside = doc.createElement("Inside");
        elementInside.setTextContent("text in new Tag");

        doc.appendChild(element);

        NodeList courses = doc.getElementsByTagName("course");
        Node lastNode = courses.item(courses.getLength()-1);
        lastNode.appendChild(elementInside);


        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new File("./src/main/resources/parser/courses.xml"));
        transformer.transform(source, result);
    }
}
