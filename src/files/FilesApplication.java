package files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import  java.nio.file.Path;
import java.nio.file.Paths;
/**
 * Created by Irby on 1/23/17.
 */
public class FilesApplication {
    public static void main(String[] args) throws IOException {
        String directory = "resources/books";
        Path directoryPath = Paths.get(directory);

        if(Files.notExists(directoryPath)) {
            Files.createDirectories(directoryPath);
        }
        String file = "books.txt";
        Path filePath = Paths.get(directory, file);
        if(Files.notExists(filePath)) {
            Files.createFile(filePath);
        }

        String[] books = {"The are of war", "The hobbit", "The design fo everyday things"};
        FileWriter fileWriter = new FileWriter(filePath.toFile(), true);
        BufferedWriter bufferedWriter = new BufferedWriter(file)
    }
}
