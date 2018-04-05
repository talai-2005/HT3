package bean;

public class Instruction {

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public String getTargetUrl() {
        return targetUrl;
    }

    public void setTargetUrl(String targetUrl) {
        this.targetUrl = targetUrl;
    }

    public String getExpectedValue() {
        return expectedValue;
    }

    public void setExpectedValue(String expectedValue) {
        this.expectedValue = expectedValue;
    }

    public String getInnerCommand() {
        return innerCommand;
    }

    public void setInnerCommand(String innerCommand) {
        this.innerCommand = innerCommand;
    }

    private String command;
    private String targetUrl;
    private String innerCommand;
    private String expectedValue;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Instruction that = (Instruction) o;

        if (!command.equals(that.command)) return false;
        if (!targetUrl.equals(that.targetUrl)) return false;
        if (!innerCommand.equals(that.innerCommand)) return false;
        return expectedValue.equals(that.expectedValue);
    }

    @Override
    public int hashCode() {
        int result = command.hashCode();
        result = 31 * result + targetUrl.hashCode();
        result = 31 * result + innerCommand.hashCode();
        result = 31 * result + expectedValue.hashCode();
        return result;
    }
}