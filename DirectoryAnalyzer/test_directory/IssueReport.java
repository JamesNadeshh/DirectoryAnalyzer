/**
 * Class for reporting issues - but NOT solved
 * Contains "Issue" but NO solved indicator - should NOT be counted as solved issue
 */
public class IssueReport {
    private int issueId;
    private String reporter;
    private String description;
    private String status; // "open", "in progress", "closed"

    public IssueReport(int issueId, String reporter, String description) {
        this.issueId = issueId;
        this.reporter = reporter;
        this.description = description;
        this.status = "open";
    }

    public void reportIssue() {
        System.out.println("Issue #" + issueId + " reported by " + reporter);
        System.out.println("Description: " + description);
        System.out.println("Status: " + status);
    }

    public void updateStatus(String newStatus) {
        this.status = newStatus;
        System.out.println("Issue #" + issueId + " status updated to: " + newStatus);
    }

    // Getters
    public int getIssueId() { return issueId; }
    public String getReporter() { return reporter; }
    public String getDescription() { return description; }
    public String getStatus() { return status; }
}