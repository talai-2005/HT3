package commandprovider;

public enum Command {
    OPEN("open"),
    CHECK_LINK_BY_HREF("checkLinkPresentByHref"),
    CHECK_LINK_BY_NAME("checkLinkPresentByName"),
    CHECK_PAGE_CONTAINS("checkPageContains"),
    CHECK_TITLE("checkPageTitle");
    private String value;
    Command(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}