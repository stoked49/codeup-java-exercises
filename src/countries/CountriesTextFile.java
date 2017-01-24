package countries;
import java.nio.*;
import java.io.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by Irby on 1/23/17.
 */
public class CountriesTextFile {
    public static void read() throws IOException {
        String dirString = "src/files";

        String fileString = "countries.txt";
        Path filePath = Paths.get(dirString, fileString);
        if (Files.notExists(filePath)) {
            Files.createFile(filePath);
        }
        FileReader fileReader = new FileReader(filePath.toFile());
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line = bufferedReader.readLine();
        while (null != line) {
            System.out.println(line);
            line = bufferedReader.readLine();
        }

    }
    public static void write() throws IOException{

    }
}

