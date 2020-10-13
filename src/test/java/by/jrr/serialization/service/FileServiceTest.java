package by.jrr.serialization.service;

import org.junit.Test;

import static org.junit.Assert.*;

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
