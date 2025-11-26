/**
 * Class that contains problematic code - issues NOT solved
 * Contains "Problem" but NO solved indicator - should NOT be counted as solved issue
 */
public class ProblematicCode {
    private String issueDescription;
    private String errorMessage;

    public ProblematicCode(String issueDescription, String errorMessage) {
        this.issueDescription = issueDescription;
        this.errorMessage = errorMessage;
    }

    /**
     * Method that demonstrates the problematic behavior
     */
    public void demonstrateProblem() {
        System.out.println("Problem: " + issueDescription);
        System.out.println("Error: " + errorMessage);
        System.out.println("This problem needs to be fixed!");
    }

    /**
     * Analyzes the problem to understand root cause
     */
    public void analyzeProblem() {
        System.out.println("Analyzing problem: " + issueDescription);
        // Problem analysis logic would go here
    }

    public String getIssueDescription() { return issueDescription; }
    public String getErrorMessage() { return errorMessage; }
}