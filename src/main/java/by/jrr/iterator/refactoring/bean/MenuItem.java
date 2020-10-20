package by.jrr.iterator.refactoring.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class MenuItem {
    private String name;
    private String description;
    private boolean vegetarian;
    private double price;
}
