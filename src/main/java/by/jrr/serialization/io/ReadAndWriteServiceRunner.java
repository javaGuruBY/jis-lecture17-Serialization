package by.jrr.serialization.io;

import by.jrr.serialization.io.service.IODecoration;
import by.jrr.serialization.io.service.ReadAndWriteFileService;

import java.io.File;
import java.io.IOException;
import java.time.Instant;

import static by.jrr.serialization.AppS.log;
import static by.jrr.serialization.io.service.FileService.resources;

public class ReadAndWriteServiceRunner {

    public static void main(String[] args) throws IOException {
//        ReadAndWriteFileService.readFileAsBytes();
//        ReadAndWriteFileService.writeFileAsBytes();
//        ReadAndWriteFileService.readFileAsSymbols();
        ReadAndWriteFileService.writeFileAsSymbols();
//        ReadAndWriteFileService.readFileAsBytesArray();

//        IODecoration.buffered();
        IODecoration.typedWrite();
        IODecoration.typedRead();
    }
}
