import java.util.Scanner;

/**
 * Main class that serves as the entry point for the Directory Analysis System.
 * This program analyzes a directory to count Java files and identify solved issues.
 */
public class DirectoryAnalyzerApp {

    public static void main(String[] args) {
        DirectoryAnalyzerApp app = new DirectoryAnalyzerApp();
        app.start();
    }

    /**
     * Starts the directory analysis application
     */
    public void start() {
        Scanner scanner = new Scanner(System.in);
        DirectoryAnalyzer analyzer = new DirectoryAnalyzer();

        System.out.println("=== Directory Analysis System ===");
        System.out.println("This program analyzes directories to count Java files and solved issues.");

        boolean continueRunning = true;

        while (continueRunning) {
            try {
                // Get directory path from user
                System.out.print("\nPlease enter the directory path to analyze: ");
                String directoryPath = scanner.nextLine().trim();

                // Validate if path is not empty
                if (directoryPath.isEmpty()) {
                    System.out.println("Error: Directory path cannot be empty. Please try again.");
                    continue;
                }

                // Perform analysis
                AnalysisResult result = analyzer.analyzeDirectory(directoryPath);

                // Display results
                displayResults(result);

            } catch (SecurityException e) {
                System.out.println("Error: Access denied to the specified directory. " +
                        "Please check your permissions.");
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }

            // Ask user if they want to analyze another directory
            System.out.print("\nWould you like to analyze another directory? (yes/no): ");
            String response = scanner.nextLine().trim().toLowerCase();

            if (!response.equals("yes") && !response.equals("y")) {
                continueRunning = false;
                System.out.println("Thank you for using the Directory Analysis System. Goodbye!");
            }
        }

        scanner.close();
    }

    /**
     * Displays the analysis results in a clear format
     * @param result The analysis result to display
     */
    private void displayResults(AnalysisResult result) {
        System.out.println("\n=== Analysis Results ===");
        System.out.println("Directory: " + result.getDirectoryPath());
        System.out.println("Number of Java Files = " + result.getJavaFileCount());
        System.out.println("Number of Issues = " + result.getSolvedIssueCount());
        System.out.println("=========================");
    }
}