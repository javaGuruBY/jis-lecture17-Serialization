package by.jrr.serialization.nio;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class Nio {
    public static final Logger log = LoggerFactory.getLogger(Nio.class);

    public static void main(String[] args) throws IOException {
//        FileService.copyFiles("./src/main/resources/loader.txt","./src/main/resources/loaderCopy.txt" );
//        FileService.pathProperties();
        FileService.readData();
    }

    public static void toLog(Object obj) {
        log.info(obj.toString());
    }
}
