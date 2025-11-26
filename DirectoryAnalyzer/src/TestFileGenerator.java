import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Helper class to generate sample Java files for testing the Directory Analyzer
 */
public class TestFileGenerator {

    public static void main(String[] args) {
        TestFileGenerator generator = new TestFileGenerator();
        generator.createTestDirectoryStructure();
    }

    /**
     * Creates a complete test directory structure with sample Java files
     */
    public void createTestDirectoryStructure() {
        String basePath = "test_directory";

        try {
            // Create main test directory
            File testDir = new File(basePath);
            if (!testDir.exists()) {
                testDir.mkdir();
                System.out.println("Created test directory: " + testDir.getAbsolutePath());
            }

            // Create sample Java files
            createSampleJavaFiles(basePath);

            // Create a subdirectory with more files
            File subDir = new File(basePath + "/subfolder");
            subDir.mkdir();
            createSubdirectoryFiles(subDir.getPath());

            System.out.println("Test directory structure created successfully!");
            System.out.println("You can now run DirectoryAnalyzerApp and point it to: " +
                    testDir.getAbsolutePath());

        } catch (Exception e) {
            System.out.println("Error creating test files: " + e.getMessage());
        }
    }

    /**
     * Creates sample Java files in the specified directory
     */
    private void createSampleJavaFiles(String directoryPath) throws IOException {
        // Regular Java files (not issues)
        createJavaFile(directoryPath, "RegularClass.java",
                "public class RegularClass {\n    // This is a regular class\n}");

        createJavaFile(directoryPath, "MainApplication.java",
                "public class MainApplication {\n    public static void main(String[] args) {\n        System.out.println(\\\"Hello\\\");\n    }\n}");

        createJavaFile(directoryPath, "UtilityClass.java",
                "public class UtilityClass {\n    // Utility methods here\n}");

        // Solved issue files
        createJavaFile(directoryPath, "SolvedProblem45.java",
                "public class SolvedProblem45 {\n    // This problem has been solved\n}");

        createJavaFile(directoryPath, "Issue123Fixed.java",
                "public class Issue123Fixed {\n    // Issue #123 has been resolved\n}");

        createJavaFile(directoryPath, "BugFixCompleted.java",
                "public class BugFixCompleted {\n    // Bug fix implementation\n}");

        createJavaFile(directoryPath, "ProblemSolvedExample.java",
                "public class ProblemSolvedExample {\n    // Example of a solved problem\n}");

        // Unsolved issue files (should not be counted as solved)
        createJavaFile(directoryPath, "IssueReport.java",
                "public class IssueReport {\n    // Reporting an issue\n}");

        createJavaFile(directoryPath, "BugReport.java",
                "public class BugReport {\n    // Bug report class\n}");

        createJavaFile(directoryPath, "ProblematicCode.java",
                "public class ProblematicCode {\n    // This has problems\n}");
    }

    /**
     * Creates sample files in a subdirectory
     */
    private void createSubdirectoryFiles(String directoryPath) throws IOException {
        createJavaFile(directoryPath, "SubFolderClass.java",
                "public class SubFolderClass {\n    // Class in subfolder\n}");

        createJavaFile(directoryPath, "ResolvedIssue.java",
                "public class ResolvedIssue {\n    // This issue was resolved\n}");
    }

    /**
     * Creates a single Java file with the specified content
     */
    private void createJavaFile(String directoryPath, String fileName, String content) throws IOException {
        File file = new File(directoryPath, fileName);
        try (FileWriter writer = new FileWriter(file)) {
            writer.write(content);
        }
        System.out.println("Created: " + file.getAbsolutePath());
    }
}