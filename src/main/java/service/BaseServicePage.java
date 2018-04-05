package service;

import bean.Instruction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class BaseServicePage {

    public String openUrl(Instruction instruction) {
        StringBuilder str = new StringBuilder();
        try {
            URL url = new URL(instruction.getTargetUrl());
            InputStream is = url.openConnection().getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            String line = null;
            while ((line = reader.readLine()) != null) {
                str.append(line);
            }
            reader.close();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str.toString();
    }
}