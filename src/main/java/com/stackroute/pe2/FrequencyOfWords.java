package main.java.com.stackroute.pe2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/*
Calculates the frequency of the words in a given file.
 */

public class FrequencyOfWords {
    public static void main(String[] args) throws IOException {
        frequencyOfWords("src/main/java/com/stackroute/pe2/file.txt");
    }

    public static String frequencyOfWords(String fileName) throws IOException {
        String result = "";
        try {
            File file = new File(fileName);
            FileInputStream fileInputStream = new FileInputStream(file);

            byte[] fileContent = new byte[(int) file.length()];
            fileInputStream.read(fileContent);
            String content = new String(fileContent);

            String words[] = content.split(" ");
            int count[] = new int[words.length];
            for (int i = 0; i < words.length; i++) {
                for (int j = 0; j < words.length; j++) {
                    if (words[i].equals(words[j])) {
                        count[j] = count[j] + 1;
                    }
                }
            }
            for (int i = 0; i < words.length; i++) {
                result = result + words[i] + "-" + count[i];
            }
        }
        catch(Exception exception) {
            result = "Exception";
        }
        return result;
    }
}
