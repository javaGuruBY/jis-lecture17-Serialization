package by.jrr.serialization.properties.service;

import java.io.*;
import java.util.Properties;

import static by.jrr.serialization.properties.PropRunner.log;

public class PropXmlRW {

    public static void read() {
        Properties appProp = new Properties();
        try {
            appProp.loadFromXML(new FileInputStream("./src/main/resources/proprunner.xml"));
        }catch (IOException ex) {
            log.error("prof file not loaded");
        }

        log.info(appProp.getProperty("user"));
    }

    public static void write(){
        Properties appProp = new Properties();
        try {
            appProp.loadFromXML(new FileInputStream("./src/main/resources/proprunner.xml"));
        }catch (IOException ex) {
            log.error("prof file not loaded");
        }

        appProp.setProperty("password", "2342");
        try {
            appProp.storeToXML(new FileOutputStream("./src/main/resources/proprunner.xml"), "save password");
        }catch (IOException ex) {
            log.error("prof file not stored");
        }
    }
}
