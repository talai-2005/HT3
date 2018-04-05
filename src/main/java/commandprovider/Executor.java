package commandprovider;

import bean.Instruction;
import service.CheckLinkByHrefService;
import service.CheckLinkByNameService;
import service.CheckPageContainsService;
import service.CheckTitleService;

import static commandprovider.Command.*;

public class Executor {

    private String response;

    public String executeCommand(Instruction instruction) {
       String innerCommand = instruction.getInnerCommand();
        if (innerCommand.equals(CHECK_TITLE.getValue())) {
            response = new CheckTitleService().checkTitle(instruction);
        } else if(innerCommand.equals(CHECK_LINK_BY_HREF.getValue())) {
            response = new CheckLinkByHrefService().checkLinkByHref(instruction);
        } else if(innerCommand.equals(CHECK_LINK_BY_NAME.getValue())) {
            response = new CheckLinkByNameService().checkLinkByName(instruction);
        } else if(innerCommand.equals(CHECK_PAGE_CONTAINS.getValue())){
            response = new CheckPageContainsService().checkPageContains(instruction);
        } else {
            // log error
            System.out.println("There is no such command");
        }
        return response;
    }
}