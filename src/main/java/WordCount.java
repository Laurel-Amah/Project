import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCount {

  public static void main(String[] args) {
    if (args.length == 0) {
      System.out.println("Please provide a filename as an argument.");
      return;
    }

    String filename = args[0];
    int wordCount = 0;

    try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
      String line;
      while ((line = reader.readLine()) != null) {
        // Split the line into words using a regular expression for whitespace
        String[] words = line.split("\\s+");
        wordCount += words.length;
      }
    } catch (IOException e) {
      System.out.println("Error reading file: " + e.getMessage());
    }

    System.out.println("Number of words in " + filename + ": " + wordCount);
  }
}
