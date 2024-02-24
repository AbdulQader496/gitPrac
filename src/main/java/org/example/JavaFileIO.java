package org.example;

import java.io.*;

public class JavaFileIO {
    public static void main(String[] args) {
//        try {
//            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
//            writer.write("Writing into a file");
//            writer.write("\nWriting into a file");
//            writer.close();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
            try {
                System.out.println(reader.readLine());
                reader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
            System.out.println(e);
        }
    }
}
