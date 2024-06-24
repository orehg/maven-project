package io_practic;

import java.io.*;

//TODO:
//1.create new file in resources with name text_with_spaces.txt
//2.add text("Hello world car house table") to this file
//3.read and print this text from file
//4.remove spaces from text
//5.read, check and print this text from file without spaces
//6.delete this file
public class InputOutputTask {
    private static final String PATH = "./src/test/resources/text_with_spaces.txt";

    public static void main(String[] args) {
        addTextToFile();
        readFileAndPrintTextFromFile();
        removeSpacesFromFile(readFile());
        readFileAndPrintTextFromFile();
        checkTextFromFileForSpaces(readFile());
    }

    public static void addTextToFile() {
        String string = "Hello world car house table";
        try (FileWriter fileWriter = new FileWriter(PATH)) {
            fileWriter.write(string);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void readFileAndPrintTextFromFile() {
        try (FileReader fileReader = new FileReader(PATH)) {
            int character;
            while ((character = fileReader.read()) != -1) {
                System.out.print((char) character);
            }
            System.out.println();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String readFile() {
        String textFromFile = "";
        try (FileReader fileReader = new FileReader(PATH)) {
            int character;
            while ((character = fileReader.read()) != -1) {
                textFromFile += (char) character;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return textFromFile;
    }

    public static void checkTextFromFileForSpaces(String textForCheck) {
        System.out.println(textForCheck.contains(" ") ? "There are spaces in the text!" : "All spaces have been removed");
    }

    public static void removeSpacesFromFile(String textFromFile) {
        try (FileWriter fileWriter = new FileWriter(PATH)) {
            fileWriter.write(textFromFile.replace(" ", ""));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

