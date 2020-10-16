package by.jrr.serialization.io.objects.bean;

import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

@Data
@NoArgsConstructor
public class Human implements Serializable {

    private static final long serialVersionUID = 1L;

    public static String version = "Serial1";

    String race;
    transient String continent;

    public Human(String race, String continent) {
        this.race = race;
        this.continent = continent;
    }

    public void setVersion(String newVersion) {
        version = newVersion;
    }


    @Override
    public String toString() {
        return "Human version " + version + " {" +
                "race='" + race + '\'' +
                ", continent='" + continent + '\'' +
                '}';
    }

    public Human readHuman(ObjectOutputStream oos) {
        return null;
    }
    public void writeHuman(ObjectInputStream ois) {

    }


}
