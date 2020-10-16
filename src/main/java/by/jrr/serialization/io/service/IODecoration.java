package by.jrr.serialization.io.service;

import java.io.*;

import static by.jrr.serialization.io.service.FileService.*;

public class IODecoration {

    public static void buffered() throws IOException {
        InputStream bufferedInputStream
                = new BufferedInputStream(new FileInputStream(loaderTextFile));
        bufferedInputStream.close();

        BufferedWriter out = new BufferedWriter(new FileWriter(loaderTextFile, true));
        out.close();

        BufferedReader in = new BufferedReader(new FileReader(loaderTextFile));
        String data = in.readLine();
        while (data != null) {
            System.out.println(data);
            data = in.readLine();
        }
        in.close();

        new BufferedReader(new FileReader(loaderTextFile)).lines()
                .forEach(System.out::println);
    }

    public static void typedWrite() {
        double price = 20.0;
        String product = "product name";
        String product2 = "Another product name";

        try (DataOutputStream out = new DataOutputStream(new FileOutputStream(typedFile))) {
            out.writeDouble(price);
            out.writeUTF(product);
            out.writeUTF(product2);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
    public static void typedRead() {
        try (DataInputStream in = new DataInputStream(new FileInputStream(typedFile))) {
            double price = in.readDouble();
            String product = in.readUTF();
            String product2 = in.readUTF();

            System.out.println(price);
            System.out.println(product);
            System.out.println(product2);
        } catch (IOException ex) {
//            ex.printStackTrace();
        }

//        try (DataInputStream in = new DataInputStream(new FileInputStream(typedFile))) {
//            for(int i = 0; i < 1; i ++ ) {
//                double prodPrice = in.readDouble();
//                System.out.println(prodPrice);
//            }
//            while (true) {
//                String symbol = in.readUTF();
//                System.out.print(symbol);
//            }
//        } catch (IOException ex) {
////            ex.printStackTrace();
//        }
    }
}
