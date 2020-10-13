package by.jrr.serialization;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;

public class AppS {
    public static Logger log = LoggerFactory.getLogger(AppS.class);
    public static final String l = System.getProperty("file.separator");
    public static final String I = File.separator;
    public static final String osName = System.getProperty("os.name");

    public static void main(String[] args) {
//        printSystemProps();
        System.out.println("osName = " + osName);
    }

    public static void printSystemProps() {
        System.getProperties().forEach((k, v) -> System.out.println(k +"="+ v));
        System.getenv().forEach((k, v) -> System.out.println(k +"="+ v));
    }
}
