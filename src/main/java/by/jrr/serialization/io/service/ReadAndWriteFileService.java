package by.jrr.serialization.io.service;

import java.io.*;

import static by.jrr.serialization.io.service.FileService.loaderTextFile;

public class ReadAndWriteFileService {

    public static void readFileAsBytesArray() throws IOException {
        InputStream input = new FileInputStream(loaderTextFile);
        byte[] byteOfData = input.readAllBytes();
        for (byte dataByte : byteOfData) {
            System.out.print(dataByte + " ");
        }
        input.close();
    }

    public static void readFileAsBytes() throws IOException {
        InputStream input = new FileInputStream(loaderTextFile);
        int byteOfData = input.read();
        while (byteOfData != -1) {
            System.out.print(byteOfData + " ");
            byteOfData = input.read();
        }
        input.close();
    }

    public static void writeFileAsBytes() throws IOException {
        OutputStream out = new FileOutputStream(loaderTextFile);
        String data = "Maxim=ADMIN";
        out.write(data.getBytes());
        out.close();
    }

    public static void readFileAsSymbols() throws IOException {
        Reader reader = new FileReader(loaderTextFile);
        int byteOfData = reader.read();
        while (byteOfData != -1) {
            System.out.print(byteOfData);
            byteOfData = reader.read();
        }
        reader.close();
    }

    public static void readFileAsSymbols(InputStream stream) throws IOException {
        int byteOfData = stream.read();
        while (byteOfData != -1) {
            System.out.print((char)byteOfData + " ");
            byteOfData = stream.read();
        }
        stream.close();
    }

    public static void writeFileAsSymbols() throws IOException {
        Writer writer = new FileWriter(loaderTextFile);
        String data = "Maxim=USER";
        writer.write(data);
        writer.close();
    }

    public static void workWithExceptionsOldBadUgly() {
        Writer writer = null;
        try {
            writer = new FileWriter(loaderTextFile);
            String data = "Maxim=USER";
            writer.write(data);
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void workWithExceptionsNew() {
        try (Writer writer = new FileWriter(loaderTextFile)) {
            String data = "Maxim=USER";
            writer.write(data);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
