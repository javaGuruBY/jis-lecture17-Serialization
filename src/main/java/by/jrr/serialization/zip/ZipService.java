package by.jrr.serialization.zip;

import by.jrr.serialization.io.service.FileService;
import by.jrr.serialization.io.service.ReadAndWriteFileService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.Enumeration;
import java.util.stream.Stream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

import static by.jrr.serialization.AppS.l;
import static java.util.stream.Collectors.joining;

public class ZipService {
    public static final String resources =
            Stream.of("src", "main", "resources")
                    .collect(joining(l, ".".concat(l), l));
    public static final String myZip = resources.concat("myZip.zip");
    public static final Logger log = LoggerFactory.getLogger("");

    public static void saveZipFile() {
        try (BufferedInputStream in = new BufferedInputStream(new FileInputStream(FileService.loaderTextFile));
             ZipOutputStream zout = new ZipOutputStream(new FileOutputStream(myZip))) {

            ZipEntry entry = new ZipEntry("rootFolder/loaderInZip.txt");
            zout.putNextEntry(entry);
            zout.write(in.readAllBytes());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readZipFile() {
        try (ZipFile aZip = new ZipFile(myZip)) {
            Enumeration<? extends ZipEntry> entries = aZip.entries();
            while (entries.hasMoreElements()) {
                ZipEntry entry = entries.nextElement();
                InputStream stream = aZip.getInputStream(entry);
                ReadAndWriteFileService.readFileAsSymbols(stream);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
