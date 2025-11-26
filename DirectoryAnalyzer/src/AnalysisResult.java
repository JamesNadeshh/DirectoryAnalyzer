/**
 * Data class to store and represent the results of directory analysis.
 * This class follows the immutable object pattern for data integrity.
 */
public class AnalysisResult {
    private final String directoryPath;
    private final int javaFileCount;
    private final int solvedIssueCount;

    /**
     * Constructor to create an analysis result
     * @param directoryPath The analyzed directory path
     * @param javaFileCount Number of Java files found
     * @param solvedIssueCount Number of solved issues identified
     */
    public AnalysisResult(String directoryPath, int javaFileCount, int solvedIssueCount) {
        this.directoryPath = directoryPath;
        this.javaFileCount = javaFileCount;
        this.solvedIssueCount = solvedIssueCount;
    }

    // Getters
    public String getDirectoryPath() {
        return directoryPath;
    }

    public int getJavaFileCount() {
        return javaFileCount;
    }

    public int getSolvedIssueCount() {
        return solvedIssueCount;
    }

    /**
     * Provides a string representation of the analysis results
     * @return Formatted string with analysis results
     */
    @Override
    public String toString() {
        return String.format(
                "Analysis Results:\nDirectory: %s\nJava Files: %d\nSolved Issues: %d",
                directoryPath, javaFileCount, solvedIssueCount
        );
    }
}