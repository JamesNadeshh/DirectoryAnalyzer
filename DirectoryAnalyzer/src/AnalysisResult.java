
public class AnalysisResult {
    private final String directoryPath;
    private final int javaFileCount;
    private final int solvedIssueCount;


    public AnalysisResult(String directoryPath, int javaFileCount, int solvedIssueCount) {
        this.directoryPath = directoryPath;
        this.javaFileCount = javaFileCount;
        this.solvedIssueCount = solvedIssueCount;
    }

    public String getDirectoryPath() {
        return directoryPath;
    }

    public int getJavaFileCount() {
        return javaFileCount;
    }

    public int getSolvedIssueCount() {
        return solvedIssueCount;
    }


    @Override
    public String toString() {
        return String.format(
                "Analysis Results:\nDirectory: %s\nJava Files: %d\nSolved Issues: %d",
                directoryPath, javaFileCount, solvedIssueCount
        );
    }
}
