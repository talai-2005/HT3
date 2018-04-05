package service;

import bean.Instruction;

public class CheckPageContainsService extends BaseServicePage {

    public String checkPageContains(Instruction instruction) {
        String html = openUrl(instruction);
        if(html.contains(instruction.getExpectedValue())){
            return "Success";
        } else {
            return "Error";
        }
    }
}