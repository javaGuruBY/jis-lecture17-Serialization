package by.jrr.serialization.io.service;

import org.junit.Test;

public class FileServiceTest {

    @Test
    public void baseSyntax() {
        FileService.baseSyntax();
    }

    @Test
    public void createDirectory() {
        FileService.createDirectory("maximSettings");
    }


    @Test
    public void listDirectory() {
        FileService.listDirectory(".");
    }
}
