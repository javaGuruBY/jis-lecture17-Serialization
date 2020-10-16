package by.jrr.serialization.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class Nio {
    public static void main(String[] args) throws IOException {
        List<Path> result = Files.walk(Paths.get(".")).collect(Collectors.toList());
        System.out.println();
    }
}
