package service;

import bean.Instruction;

public class CheckLinkByHrefService extends BaseServicePage {

    public String checkLinkByHref(Instruction instruction) {
        String html = openUrl(instruction);
        if(html.contains("<link href=\"" + instruction.getExpectedValue())){
            return "Success";
        } else {
            return "Error";
        }
    }
}