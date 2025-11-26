/**
 * This class in subfolder represents a resolved issue
 * Contains "Issue" and "Resolved" keywords - SHOULD be counted as solved issue
 */
public class ResolvedIssue {
    private int issueNumber;
    private String resolutionDetails;
    private String resolvedBy;

    public ResolvedIssue(int issueNumber, String resolutionDetails, String resolvedBy) {
        this.issueNumber = issueNumber;
        this.resolutionDetails = resolutionDetails;
        this.resolvedBy = resolvedBy;
    }

    /**
     * Marks the issue as completely resolved
     */
    public void markAsResolved() {
        System.out.println("Issue #" + issueNumber + " marked as resolved by " + resolvedBy);
        System.out.println("Resolution: " + resolutionDetails);
    }

    /**
     * Generates resolution report
     */
    public String generateResolutionReport() {
        return "Resolution Report for Issue #" + issueNumber +
                "\nResolved by: " + resolvedBy +
                "\nDetails: " + resolutionDetails;
    }

    public int getIssueNumber() { return issueNumber; }
    public String getResolutionDetails() { return resolutionDetails; }
    public String getResolvedBy() { return resolvedBy; }
}