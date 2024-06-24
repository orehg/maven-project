package io_practic;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class AllTxtFiles {

    public static void main(String[] args) {
        String rootDirectory = "E:/qwerty/";

        List<String> txtFilesFound = searchTxtFiles(rootDirectory);


        if (!txtFilesFound.isEmpty()) {
            System.out.println("Найдены следующие файлы с расширением .txt:");
            for (String txtFile : txtFilesFound) {
                System.out.println(txtFile);
            }
        } else {
            System.out.println("Файлы с расширением .txt не найдены в указанной директории.");
        }
    }

    private static List<String> searchTxtFiles(String directory) {
        List<String> txtFiles = new ArrayList<>();
        File dir = new File(directory);

        if (dir.exists() && dir.isDirectory()) {
            File[] files = dir.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isFile() && file.getName().toLowerCase().endsWith(".txt")) {
                        txtFiles.add(file.getAbsolutePath());
                    }
                    else if (file.isDirectory()) {
                        File[] otherFiles = file.listFiles();
                        if (otherFiles != null) {
                            for (File otherFile : otherFiles) {
                                if (otherFile.isFile() && otherFile.getName().toLowerCase().endsWith(".txt")) {
                                    txtFiles.add(otherFile.getAbsolutePath());
                                }
                            }
                        }
                    }
                }
            }
        }
        return txtFiles;
    }
}


