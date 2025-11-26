/**
 * Class for reporting bugs - but NOT solved
 * Contains "Bug" but NO solved indicator - should NOT be counted as solved issue
 */
public class BugReport {
    private String bugTitle;
    private String severity;
    private String stepsToReproduce;
    private boolean isConfirmed;

    public BugReport(String bugTitle, String severity, String stepsToReproduce) {
        this.bugTitle = bugTitle;
        this.severity = severity;
        this.stepsToReproduce = stepsToReproduce;
        this.isConfirmed = false;
    }

    public void confirmBug() {
        this.isConfirmed = true;
        System.out.println("Bug confirmed: " + bugTitle);
    }

    public void displayBugInfo() {
        System.out.println("Bug Title: " + bugTitle);
        System.out.println("Severity: " + severity);
        System.out.println("Confirmed: " + isConfirmed);
    }

    public String getBugTitle() { return bugTitle; }
    public String getSeverity() { return severity; }
    public String getStepsToReproduce() { return stepsToReproduce; }
    public boolean isConfirmed() { return isConfirmed; }
}