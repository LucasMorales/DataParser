import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
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

    public static ArrayList<ElectionResult> parse2016ElectionResults(String data) {
        ArrayList<ElectionResult> results = new ArrayList<>();

        String[] rows = data.split("\n");

        for (int r = 1; r < rows.length; r++) {
            String currentRow = rows[r];
            String finalString = "";
            String p1 = "";
            String p2 = "";
            String p3 = "";
            String p4 = "";

            if (currentRow.indexOf("\"") == -1) {
                int locOfPercent = currentRow.indexOf("%");
                p1 = currentRow.substring(2, locOfPercent);
                p2 = currentRow.substring(locOfPercent + 1);
            } else {
                int locOfStartQuot = currentRow.indexOf("\"");
                p1 = currentRow.substring(2, locOfStartQuot);
                int locOfComma = currentRow.indexOf(",", locOfStartQuot);
                p2 = currentRow.substring(locOfStartQuot + 1, locOfComma);
                int locOfEndQuot = currentRow.indexOf("\"", locOfComma);
                int locOfPercent = currentRow.indexOf("%");
                p3 = currentRow.substring(locOfEndQuot + 1, locOfPercent);
                p4 = currentRow.substring(locOfPercent + 1);
            }
            finalString = p1 + p2 + p3 + p4;
            System.out.println(finalString);
        }

        return results;

    }

}