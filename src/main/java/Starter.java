import bean.Instruction;
import commandprovider.Executor;
import reader.Reader;

public class Starter {
    /*Example of .txt file:
    #1
        open
        https://www.google.ru/
        checkPageContains
        Google offered in:
    #2
        open
        https://www.google.ru/
        checkPageTitle
        Google
    #3
        open
        https://www.google.ru/
        checkLinkPresentByHref
        /images/branding/product/ico
    #4
        open
        https://www.google.ru/
        checkLinkPresentByName
        any name (failure, there are no links with name)
    */

    public static void main(String[] args) {
        Reader reader = new Reader();
        Instruction instruction = reader.readInstruction("C:\\Users\\User\\Desktop\\instruction.txt");
        Executor executor = new Executor();
        String result = executor.executeCommand(instruction);
        System.out.println("The result is '" + result + "'");
    }
}