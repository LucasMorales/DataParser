import java.lang.reflect.Array;
import java.util.ArrayList;

/***
 * Main class for DataParser
 * Author: Lucas
 */

public class Main {
    public static void main(String[] args) {

        loadAllData("2016_Presidential_Results.csv", "Education.csv", "Unemployment.csv");





    }

    public static void loadAllData(String electionFilepath, String educationFilepath, String employmentFilepath) {
        String[] electionRawLines = Utils.readFilesAsCleanedLines(electionFilepath, 1);
        String[] educationRawLines = Utils.readFilesAsCleanedLines(educationFilepath, 5);
        String[] employmentRawLines = Utils.readFilesAsCleanedLines(employmentFilepath, 8);
    }


}




