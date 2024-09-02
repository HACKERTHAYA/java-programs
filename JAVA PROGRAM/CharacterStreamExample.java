import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class CharacterStreamExample {
    public static void main(String[] args) {
        String inputFilePath = "input.txt";
        String outputFilePath = "output.txt";

        // Write data to file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {
            String data = "Hello, this is a test.";
            writer.write(data); // Write string to file
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Read data from file
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line); // Print each line of the file
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
