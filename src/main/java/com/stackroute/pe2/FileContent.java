package main.java.com.stackroute.pe2;

/*
Read the file content and display content of that file.
 */

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileContent {

    public static String readFileContent(File file) {
        String content = "";
        try {
            FileReader fileReader = new FileReader(file);
            int letter;
            while ((letter = fileReader.read()) != -1) {
                content = content + (char) letter;
            }
        }
        catch(IOException exception) {
            content = "IOException";
        }
        return content;
    }
}
