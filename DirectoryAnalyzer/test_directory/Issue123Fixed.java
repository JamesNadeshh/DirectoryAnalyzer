/**
 * This class fixes a specific issue (issue number 123)
 * Contains "Issue" and "Fixed" keywords - SHOULD be counted as solved issue
 */
public class Issue123Fixed {
    private String issueDescription;
    private String fixVersion;

    public Issue123Fixed(String issueDescription, String fixVersion) {
        this.issueDescription = issueDescription;
        this.fixVersion = fixVersion;
    }

    /**
     * Verifies that the issue has been properly fixed
     */
    public boolean verifyFix() {
        System.out.println("Verifying fix for issue: " + issueDescription);
        System.out.println("Fixed in version: " + fixVersion);
        return true;
    }

    /**
     * Documents the resolution of the issue
     */
    public void documentResolution() {
        System.out.println("Issue resolution documented successfully");
    }

    public String getIssueDescription() {
        return issueDescription;
    }

    public String getFixVersion() {
        return fixVersion;
    }
}