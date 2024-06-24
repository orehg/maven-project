package io_practic;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class OutputTest {
    public static void main(String[] args) {
//        fileWriteWithBytes();
//        fileWriteWithWriter();
//        fileAppendWithWriter();
//        fileWriteWithClassFiles();
    }
    public static void fileWriteWithBytes() {
        FileOutputStream fileOutputStream = null;
        String string = "fiu43ii14ui 5 415  43 r g";
            try {
                fileOutputStream = new FileOutputStream("E:/1.txt");
                fileOutputStream.write(string.getBytes());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
    }
    public static void fileWriteWithWriter() {
        String string = "512451";
        try (FileWriter fileWriter = new FileWriter("E:/1.txt")){
            fileWriter.write(string);
        } catch (IOException e) {
        throw new RuntimeException(e);
            }
    }
    public static void fileAppendWithWriter() {
        String string = "qwertyuiop";
        try (FileWriter fileWriter = new FileWriter("E:/1.txt", true)){
            fileWriter.write(string);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void fileWriteWithClassFiles(){
        Path filePath = Paths.get("E:/1.txt");
        String string = "jkl;";
        try {
            Files.write(filePath, string.getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
