package service;

import bean.Instruction;

public class CheckLinkByNameService extends BaseServicePage {

    public String checkLinkByName(Instruction instruction) {
        String html = openUrl(instruction);
        if(html.contains("<link name=\"" + instruction.getExpectedValue())){
            return "Success";
        } else {
            return "Error";
        }
    }
}