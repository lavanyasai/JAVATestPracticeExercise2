package main.java.com.stackroute.pe2;

/*
Finds all files of a folder and selects only given extension file name and display content of that file.
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FindAllFiles {

    public static String findAndReadFiles(String[] names) throws IOException {
        String result = "";
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
            result = new String(fileContent);
            return result;
        }
        catch (Exception exception) {
            result = "Exception";
        }
        return result;
    }
}
