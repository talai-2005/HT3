package reader;

import bean.Instruction;

import java.io.*;
import java.util.ArrayList;

public class Reader {

    private Instruction instruction = new Instruction();

    public Instruction readInstruction(String path) {
        ArrayList<String> valuesFromFile = new ArrayList<String>();
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(
                        new FileInputStream(path)));
            String line;
            while ((line = reader.readLine()) != null) {
                valuesFromFile.add(line);
            }
        } catch (IOException e) {
            // log error
        }
        instruction.setCommand(valuesFromFile.get(0));
        instruction.setTargetUrl(valuesFromFile.get(1));
        instruction.setInnerCommand(valuesFromFile.get(2));
        instruction.setExpectedValue(valuesFromFile.get(3));
        return instruction;
    }
}