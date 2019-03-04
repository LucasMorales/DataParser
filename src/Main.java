import java.lang.reflect.Array;
import java.util.ArrayList;

/***
 * Main class for DataParser
 * Author: Lucas
 */

public class Main {
    public static void main(String[] args) {
        String data = Utils.readFileAsString("data/2016_Presidential_Results.csv");

        ArrayList<ElectionResult> results = Utils.parse2016ElectionResults(data);


    }






}




