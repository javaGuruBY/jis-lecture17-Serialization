package by.jrr.serialization.io.objects.service;

import by.jrr.serialization.io.objects.bean.Human;
import by.jrr.serialization.io.objects.bean.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.stream.Stream;

import static by.jrr.serialization.AppS.l;
import static java.util.stream.Collectors.joining;

public class Serializer {
    public static final String resources =
            Stream.of("src", "main", "resources", "objects")
                    .collect(joining(l, ".".concat(l), l));
    public static final String HUMAN = resources.concat("Human");
    public static final String PERSON = resources.concat("Person");
    public static final Logger log = LoggerFactory.getLogger("");

    public static void writeHuman(Human human, int id) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(HUMAN + "_" + id))) {
            oos.writeObject(human);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void readHuman(int id) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(HUMAN + "_" + id))) {
            Human human = (Human) ois.readObject();
            log.info(human.toString());
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void readPerson(int id) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(PERSON + "_" + id))) {
            Person person = (Person) ois.readObject();
            log.info(person.toString());
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void writePerson(Person person, int id) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(PERSON + "_" + id))) {
            oos.writeObject(person);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
