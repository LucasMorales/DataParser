import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Utils {
    public static String readFileAsString(String filepath) {
        StringBuilder output = new StringBuilder();

        try (Scanner scanner = new Scanner(new File(filepath))) {

            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                output.append(line + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return output.toString();
    }

    public static String[] readFilesAsCleanedLines(String filepath, int linesToSkip) {
        String data = readFileAsString(filepath);
        String[] lines = data.split("\n");

        for (String line : lines) {
            line = cleanLine(line);
        }

        return lines;
    }

    private static String cleanLine(String line) {
        int locOfStartQuote = line.indexOf("\"");
        int locOfEndQuote = line.indexOf("\"", locOfStartQuote);

        while (locOfStartQuote != -1 && locOfEndQuote != -1) { // while there are still commas, keep trimming
            line = cleanSubString(line, locOfStartQuote, locOfEndQuote);

        }
        return line;
    }

    private static String cleanSubString(String line, int locOfStartQuote, int locOfEndQuote) {
        String beforeQuotes = line.substring(0, locOfStartQuote);
        String afterQuotes = line.substring(locOfEndQuote + 1);

        String betweenQuotes = line.substring(locOfStartQuote + 1, locOfEndQuote);
        betweenQuotes = removeBadChars(betweenQuotes);

        return beforeQuotes + betweenQuotes + afterQuotes;
    }

    private static String removeBadChars(String toClean) {
        toClean = toClean.replace(",", "");
        toClean = toClean.replace("%", "");
        toClean = toClean.trim();
        return toClean;
    }


}