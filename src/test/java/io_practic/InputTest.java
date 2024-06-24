package io_practic;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class InputTest {
    public static void main(String[] args) {
//        inputReadWithBytes();
        fileReadWithReader();
//        fileReadWithClassFiles();
        }
        public static void inputReadWithBytes() {
            FileInputStream fis;
            InputStreamReader isr;
            File file = new File("E:/1.txt");

            try {
                int a = 0;

                fis = new FileInputStream(file);
                isr = new InputStreamReader(fis);
                while ((a = isr.read()) != -1) {
                    System.out.print((char) a);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            } finally {
//            try {
//                fis.close();
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//
            }
        }
        public static void fileReadWithReader(){
            try (FileReader fileReader = new FileReader("E:/1.txt")){
                int character;
                while ((character = fileReader.read()) != -1) {
                    // Преобразуем прочитанный символ в char и выводим его на экран
                    System.out.print((char) character);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        public static void fileReadWithClassFiles(){
            Path filePath = Paths.get("E:/1.txt");
            try {
                Files.readAllLines(filePath).forEach(System.out::println);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
}
