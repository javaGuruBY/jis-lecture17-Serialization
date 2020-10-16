package by.jrr.serialization.io.objects.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class Individual implements Serializable {

    String soul;
}
