package by.jrr.serialization.io.objects.bean;

import lombok.Data;
import lombok.ToString;

@Data
@ToString(callSuper = true)
public class Person extends Human {

    private static final long serialVersionUID = 1L;

    int age;
    String name;
    public Individual individual;

    public Person(String race, String continent) {
        super(race, continent);
    }
}
