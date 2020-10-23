package by.jrr.serialization.parser.xml.service.dom.bean;

import lombok.Data;

@Data
public class Course {
    int id;
    int students;
    String name;
    String description;
}
