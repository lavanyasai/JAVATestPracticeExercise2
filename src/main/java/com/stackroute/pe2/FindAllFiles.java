package main.java.com.stackroute.pe2;
/*
Finds all files of a folder and selects only given extension file name and display content of that file.
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class FindAllFiles {

    public static String findAndReadFiles(String[] names) throws IOException {
        try {
            File directory = new File(names[0]);

            File[] filesList = directory.listFiles();

            for (File file : filesList) {
                System.out.println(file.getName());
            }

            File file = new File(names[0] + "/" + names[1]);
            FileInputStream fileInputStream = new FileInputStream(file);

            byte[] fileContent = new byte[(int) file.length()];
            fileInputStream.read(fileContent);
            String content = new String(fileContent);
            return content;
        }
        catch (Exception exception) {
            return "Exception";
        }
    }
}
