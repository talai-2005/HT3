package service;

import bean.Instruction;

public class CheckTitleService extends BaseServicePage {

    public String checkTitle(Instruction instruction) {
        String html = openUrl(instruction);
        if(html.contains("<title>" + instruction.getExpectedValue() + "</title>")){
            return "Success";
        } else {
            return "Error";
        }
    }
}