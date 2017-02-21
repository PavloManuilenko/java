import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CheckTheFormula {

    List<String> strings = new ArrayList<>(1);

    public void searchForMissingParentheses(String inputFile, String outputFile) {

        //read from the input-file
        String lineText;
        BufferedReader reader;
        FileWriter writer;
        try {
            reader = new BufferedReader(new FileReader(inputFile));

            while ((lineText = reader.readLine()) != null) {
                strings.add(lineText + "\r\n");
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //write into the output-file
        try {
            writer = new FileWriter(outputFile);

            Iterator<String> iterator = strings.iterator();

            while (iterator.hasNext()) {
                String tempStr = iterator.next();
                writer.write(tempStr);
                writer.append(checker(tempStr));
            }
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //logic of verifying a formula
    public String checker(String sourceStr) {
        String checkedString = "";

        for (int i = 0; i < sourceStr.length(); i++) {
            if (sourceStr.charAt(i) == '(') {
                checkedString += "^";
            }
            else {
                checkedString += " ";
            }
        }

        return checkedString + "\r\n";
    }
}
