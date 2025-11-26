/**
 * This class represents a completed bug fix
 * Contains "Bug" and "Completed" keywords - SHOULD be counted as solved issue
 */
public class BugFixCompleted {
    private int bugId;
    private String bugDescription;
    private String fixDetails;

    public BugFixCompleted(int bugId, String bugDescription, String fixDetails) {
        this.bugId = bugId;
        this.bugDescription = bugDescription;
        this.fixDetails = fixDetails;
    }

    /**
     * Executes the bug fix
     */
    public void executeFix() {
        System.out.println("Executing fix for bug #" + bugId);
        System.out.println("Bug: " + bugDescription);
        System.out.println("Fix: " + fixDetails);
    }

    /**
     * Tests that the bug fix works correctly
     */
    public boolean testFix() {
        System.out.println("Testing bug fix for bug #" + bugId);
        return true;
    }

    public int getBugId() { return bugId; }
    public String getBugDescription() { return bugDescription; }
    public String getFixDetails() { return fixDetails; }
}