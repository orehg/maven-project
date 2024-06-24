package io_practic;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileSearch {

    public static void main(String[] args) {
        String directoryToSearch = "E:/";

        List<String> txtFilesFound = searchTxtFiles(new File(directoryToSearch));

        if (!txtFilesFound.isEmpty()) {
            System.out.println("Найдены следующие файлы с расширением .txt:");
            for (String txtFile : txtFilesFound) {
                System.out.println(txtFile);
            }
        } else {
            System.out.println("Файлы с расширением .txt не найдены в указанной директории.");
        }
    }

    private static List<String> searchTxtFiles(File dir) {
        List<String> txtFiles = new ArrayList<>();

        if (dir.exists() && dir.isDirectory()) {
            File[] files = dir.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isFile() && file.getName().toLowerCase().endsWith(".txt")) {
                        txtFiles.add(file.getAbsolutePath());
                    } else if (file.isDirectory()) {
                        txtFiles.addAll(searchTxtFiles(file)); // Рекурсивный вызов для поддиректорий
                    }
                }
            }
        }
        return txtFiles;
    }
}
