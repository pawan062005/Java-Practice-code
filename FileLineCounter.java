import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileLineCounter {
    public static void main(String[] args) {
        String filePath = "D:\\java practice\\AbstractionDemo.png"; 
        int lineCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            while (br.readLine() != null) {
                lineCount++;
            }
            System.out.println("Number of lines in file: " + lineCount);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}

