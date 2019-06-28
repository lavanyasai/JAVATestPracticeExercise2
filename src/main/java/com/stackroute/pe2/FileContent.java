package main.java.com.stackroute.pe2;

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
            System.out.println("Contents of the file are " + content);
            System.out.println("Length of the file is " + (content.length() - 1));
        }
        catch(IOException exception) {
            return "IOException";
        }
        return content;
    }
}
