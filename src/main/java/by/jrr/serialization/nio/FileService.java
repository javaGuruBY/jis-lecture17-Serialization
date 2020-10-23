package by.jrr.serialization.nio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.*;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

import static by.jrr.serialization.io.service.FileService.loaderTextFile;
import static by.jrr.serialization.nio.Nio.log;
import static java.nio.file.Files.isReadable;

public class FileService {

    public static void copyFiles(String left, String right) {
        Path from = Paths.get(left);
        Path to = Paths.get(right);
        ;
        try {
            Files.copy(from, to, StandardCopyOption.COPY_ATTRIBUTES, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void pathProperties() {
        Path loaderFile = Paths.get("./src/main/resources/loader.txt");
        Path fileName = loaderFile.getFileName();
        Path elementName = loaderFile.getName(0);
        FileSystem fileSystem = loaderFile.getFileSystem();
        Path root = loaderFile.getRoot();

        log.info(fileName.toString());
        log.info(elementName.toString());
        log.info(fileSystem.toString());
        log.info("value of root: " + root);

        Iterator<Path> result = loaderFile.iterator();
        result.forEachRemaining(path -> log.info(path.toString()));
        result.forEachRemaining(FileService::myAccept);
        result.forEachRemaining(Nio::toLog);
        System.out.println(result.hasNext());

        while (result.hasNext()) {
            Path path = result.next();
        }

        Files.isReadable(loaderFile);
        Files.isDirectory(loaderFile);
        Files.isExecutable(loaderFile);
        Files.isWritable(loaderFile);
        Files.exists(loaderFile);

        try {
            Files.deleteIfExists(loaderFile);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            Files.isHidden(loaderFile);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void myAccept(Path path) {
        log.info(path.toString());
    }

    public static void readDataPreExample() throws IOException {
        Path myLoaderTextFile = Paths.get(loaderTextFile);
        if (isReadable(myLoaderTextFile)) {
            Reader reader = new FileReader(myLoaderTextFile.toString()); //this replaced in Files
            int byteOfData = reader.read();
            while (byteOfData != -1) {
                System.out.print(byteOfData);
                byteOfData = reader.read();
            }
            reader.close();
        }
    }

    public static void readDataExample() throws IOException {
        Path myLoaderTextFile = Paths.get(loaderTextFile);
        BufferedReader reader = Files.newBufferedReader(myLoaderTextFile);
        int byteOfData = reader.read();
        while (byteOfData != -1) {
            System.out.print(byteOfData);
            byteOfData = reader.read();
        }
        reader.close();
    }

    public static void readData() throws IOException {
        Path myLoaderTextFile = Paths.get(loaderTextFile);
        List<String> resultAsList = Files.readAllLines(myLoaderTextFile);
        Stream<String> resultAsStream = Files.lines(myLoaderTextFile);

        resultAsStream.forEach(Nio::toLog);
    }

    public static void readDirectoryTree() throws IOException {
        Stream<Path> resultAsStream = Files.walk(Paths.get("."));
    }
}
