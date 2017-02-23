import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CheckTheFormula {

    List<String> strings = new ArrayList<>(1);

    public void searchForMissingParentheses(String inputFile, String outputFile) {
        //read from the input-file
        String lineText;
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            while ((lineText = reader.readLine()) != null) {
                strings.add(lineText + "\r\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        //write to the output-file
        try (FileWriter writer = new FileWriter(outputFile)) {
            Iterator<String> iterator = strings.iterator();
            while (iterator.hasNext()) {
                String tempStr = iterator.next();
                writer.write(tempStr);
                writer.append(checker(tempStr));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //logic of verifying a formula
    public String checker(String sourceStr) {
        char[] strCopy = sourceStr.toCharArray();
        StringBuilder builder = new StringBuilder();

        removePairOfParentheses(strCopy, '(', ')');
        removePairOfParentheses(strCopy, ')', '(');

        for (int i = 0; i < strCopy.length; i++) {
            if (strCopy[i] == '(' || strCopy[i] == ')') builder.append('^');
            else builder.append(' ');
        }
        return builder.toString() + "\r\n";
    }

    public void removePairOfParentheses(char[] sourceStr, char parentheses1, char parentheses2) {
        for (int i = 0; i < sourceStr.length; i++) {
            if (sourceStr[i] == parentheses1) {
                for (int j = i + 1; j < sourceStr.length; j++) {
                    if (sourceStr[j] == parentheses2) {
                        sourceStr[i] = ' ';
                        sourceStr[j] = ' ';
                        break;
                    }
                }
            }
        }
    }

}