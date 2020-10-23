package by.jrr.serialization.properties;

import by.jrr.serialization.properties.service.PropTxtRW;
import by.jrr.serialization.properties.service.PropXmlRW;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Enumeration;
import java.util.Properties;

public class PropRunner {
    public static Logger log = LoggerFactory.getLogger(PropRunner.class);
    public static void main(String[] args) {
//        PropTxtRW.read();
//        PropTxtRW.write();
//        PropXmlRW.read();
//        PropXmlRW.write();

        Properties properties = PropTxtRW.getProperties();

        Enumeration<Object> valuesEnum = properties.elements();
        while (valuesEnum.hasMoreElements()) {
            Object result = valuesEnum.nextElement();
            log.info("prop: " + result);
        }

        properties.forEach((a, b) -> log.debug(a+"="+b));
    }
}
