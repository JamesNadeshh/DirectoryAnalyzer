import java.io.File;
import java.util.ArrayList;
import java.util.List;


public class DirectoryAnalyzer {


    public AnalysisResult analyzeDirectory(String directoryPath) {
        // Validate directory existence and accessibility
        File directory = validateDirectory(directoryPath);

        // Get all files in the directory
        File[] files = directory.listFiles();

        if (files == null) {
            throw new IllegalArgumentException("Unable to read files from the directory.");
        }

        // Filter and analyze Java files
        List<File> javaFiles = filterJavaFiles(files);
        List<File> solvedIssueFiles = identifySolvedIssues(javaFiles);

        return new AnalysisResult(directoryPath, javaFiles.size(), solvedIssueFiles.size());
    }

    private File validateDirectory(String directoryPath) {
        if (directoryPath == null || directoryPath.trim().isEmpty()) {
            throw new IllegalArgumentException("Directory path cannot be null or empty.");
        }

        File directory = new File(directoryPath);

        if (!directory.exists()) {
            throw new IllegalArgumentException("Directory does not exist: " + directoryPath);
        }

        if (!directory.isDirectory()) {
            throw new IllegalArgumentException("Path is not a directory: " + directoryPath);
        }

        if (!directory.canRead()) {
            throw new IllegalArgumentException("Cannot read directory: " + directoryPath);
        }

        return directory;
    }


    private List<File> filterJavaFiles(File[] files) {
        List<File> javaFiles = new ArrayList<>();

        for (File file : files) {
            if (file.isFile() && file.getName().toLowerCase().endsWith(".java")) {
                javaFiles.add(file);
            }
        }

        return javaFiles;
    }


    private List<File> identifySolvedIssues(List<File> javaFiles) {
        List<File> solvedIssueFiles = new ArrayList<>();
        String[] issueKeywords = {"issue", "problem", "bug", "fix"};
        String[] solvedIndicators = {"solved", "resolved", "fixed", "completed"};

        for (File javaFile : javaFiles) {
            String fileName = javaFile.getName().toLowerCase();

            // Check if file name contains issue-related keywords
            boolean isIssueFile = containsAnyKeyword(fileName, issueKeywords);

            // Check if file name contains solved indicators
            boolean isSolved = containsAnyKeyword(fileName, solvedIndicators);

            // Consider it a solved issue if it's both an issue file and marked as solved
            if (isIssueFile && isSolved) {
                solvedIssueFiles.add(javaFile);
            }
        }

        return solvedIssueFiles;
    }


    private boolean containsAnyKeyword(String text, String[] keywords) {
        for (String keyword : keywords) {
            if (text.contains(keyword)) {
                return true;
            }
        }
        return false;
    }
}
