/**
 * Example class demonstrating how a problem was solved
 * Contains "Problem" and "Solved" keywords - SHOULD be counted as solved issue
 */
public class ProblemSolvedExample {
    private String problemType;
    private String solutionApproach;

    public ProblemSolvedExample(String problemType, String solutionApproach) {
        this.problemType = problemType;
        this.solutionApproach = solutionApproach;
    }

    /**
     * Demonstrates the problem solution
     */
    public void demonstrateSolution() {
        System.out.println("Problem Type: " + problemType);
        System.out.println("Solution Approach: " + solutionApproach);
        System.out.println("Problem has been successfully solved using this approach.");
    }

    /**
     * Provides code example for the solution
     */
    public String getCodeExample() {
        return "// Code example for solving " + problemType + " using " + solutionApproach;
    }

    public String getProblemType() { return problemType; }
    public String getSolutionApproach() { return solutionApproach; }
}