package by.jrr.serialization.properties.service;

import by.jrr.serialization.properties.PropRunner;

import java.io.*;
import java.util.Properties;

import static by.jrr.serialization.properties.PropRunner.*;

public class PropTxtRW {

    public static void read() {
        Properties appProp = new Properties();
        try {
            appProp.load(new FileInputStream("./src/main/resources/proprunner.properties"));
        }catch (IOException ex) {
            log.error("prof file not loaded");
        }

        log.info(appProp.getProperty("user"));
    }

    public static void write(){
        Properties appProp = new Properties();
        try {
            appProp.load(new FileReader("./src/main/resources/proprunner.properties"));
        }catch (IOException ex) {
            log.error("prof file not loaded");
        }

        appProp.setProperty("password", "2342");
        try {
        appProp.store(new FileWriter("./src/main/resources/proprunner.properties"), "save password");
        }catch (IOException ex) {
            log.error("prof file not stored");
        }
    }

    public static Properties getProperties() {
        Properties appProp = new Properties();
        try {
            appProp.load(new FileInputStream("./src/main/resources/proprunner.properties"));
        }catch (IOException ex) {
            log.error("prof file not loaded");
        }

        return appProp;
    }
}
