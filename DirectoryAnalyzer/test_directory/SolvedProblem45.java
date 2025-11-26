/**
 * This class represents a specific problem that has been solved
 * Contains "Problem" and "Solved" keywords - SHOULD be counted as solved issue
 */
public class SolvedProblem45 {
    private int problemId;
    private String solution;

    public SolvedProblem45(int problemId, String solution) {
        this.problemId = problemId;
        this.solution = solution;
    }

    /**
     * Applies the solution to fix the problem
     */
    public void applySolution() {
        System.out.println("Applying solution for problem " + problemId + ": " + solution);
        // Implementation of the solved problem
    }

    public boolean isProblemResolved() {
        return solution != null && !solution.isEmpty();
    }

    // Getters and setters
    public int getProblemId() { return problemId; }
    public String getSolution() { return solution; }
}