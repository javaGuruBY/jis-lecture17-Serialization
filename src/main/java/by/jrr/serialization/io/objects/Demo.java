package by.jrr.serialization.io.objects;

import by.jrr.serialization.io.objects.bean.Human;
import by.jrr.serialization.io.objects.bean.Individual;
import by.jrr.serialization.io.objects.bean.Person;
import by.jrr.serialization.io.objects.service.Serializer;

public class Demo {
    public static void main(String[] args) {
        serializePersonAsPersonWithIndividual();
    }

    private static void humanSynaxDemo() {
        Serializer.writeHuman(new Human("Belarus", "Europe"), 1);
        Serializer.writeHuman(new Human("German", "Europe"), 2);
        Serializer.writeHuman(new Human("Italy", "Europe"), 3);
        Serializer.writeHuman(new Human("Russia", "Asia"), 4);

        Serializer.readHuman(2);
        Serializer.readHuman(4);
        Serializer.readHuman(1);
        Serializer.readHuman(3);
    }

    public static void serializePersonAsHuman()  {
        Person person = new Person("Belarus", "Europe");
        person.setAge(44);
        person.setName("Vladimir");
        Serializer.writeHuman(person, 10);
        Serializer.readHuman( 10);
    }

    public static void serializePersonAsPerson()  {
        Person person = new Person("Belarus", "Europe");
        person.setAge(44);
        person.setName("Vladimir");
        Serializer.writePerson(person, 10);
        Serializer.readPerson( 10);
    }

    public static void serializeWithStatic() {
        Human human = new Human("Belarus", "Europe");
        human.setVersion("df");
        System.out.println(human);
        Serializer.writeHuman(human, 5);
        Serializer.readHuman(5);

    }

    public static void serializePersonAsPersonWithIndividual()  {
//        Person person = new Person("Belarus", "Europe");
//        person.setAge(44);
//        person.setName("Vladimir");
//        person.setIndividual(new Individual("human"));
//        Serializer.writePerson(person, 11);

        Serializer.readPerson( 11);
    }
}
