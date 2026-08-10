// FileHandlingDemo.java
// Demonstrates reading from and writing to a file using Java file handling classes

import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class FileHandlingDemo {
    public static void main(String[] args) {
        String fileName = "sample.txt";

        // ---------- Writing to a file ----------
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("Hello, this is a file handling demo in Java.\n");
            writer.write("This is the second line of the file.\n");
            writer.write("File handling makes it easy to store and retrieve data.\n");
            System.out.println("Data written to " + fileName + " successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        System.out.println(); // blank line for readability

        // ---------- Reading from a file ----------
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("Reading content from " + fileName + ":");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
