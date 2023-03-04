package helper;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class accessFiles {

    public void writeToFile(String valueToWrite, String filename) {
        try {
            FileWriter myWriter = new FileWriter(filename);
            myWriter.write(valueToWrite);
            myWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
