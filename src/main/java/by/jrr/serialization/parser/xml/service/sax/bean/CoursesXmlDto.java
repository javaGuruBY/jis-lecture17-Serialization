package by.jrr.serialization.parser.xml.service.sax.bean;

import lombok.Data;

import java.util.List;

@Data
public class CoursesXmlDto {
    private List<Course> courses;
}
