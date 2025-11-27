import java.util.Scanner;


public class DirectoryAnalyzerApp {

    public static void main(String[] args) {
        DirectoryAnalyzerApp app = new DirectoryAnalyzerApp();
        app.start();
    }


    public void start() {
        Scanner scanner = new Scanner(System.in);
        DirectoryAnalyzer analyzer = new DirectoryAnalyzer();

        System.out.println("=== Directory Analysis System ===");
        System.out.println("This program analyzes directories to count Java files and solved issues.");

        boolean continueRunning = true;

        while (continueRunning) {
            try {
                System.out.print("\nPlease enter the directory path to analyze: ");
                String directoryPath = scanner.nextLine().trim();

                if (directoryPath.isEmpty()) {
                    System.out.println("Error: Directory path cannot be empty. Please try again.");
                    continue;
                }

                AnalysisResult result = analyzer.analyzeDirectory(directoryPath);

                displayResults(result);

            } catch (SecurityException e) {
                System.out.println("Error: Access denied to the specified directory. " +
                        "Please check your permissions.");
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }


            System.out.print("\nWould you like to analyze another directory? (yes/no): ");
            String response = scanner.nextLine().trim().toLowerCase();

            if (!response.equals("yes") && !response.equals("y")) {
                continueRunning = false;
                System.out.println("Thank you for using the Directory Analysis System. Goodbye!");
            }
        }

        scanner.close();
    }


    private void displayResults(AnalysisResult result) {
        System.out.println("\n=== Analysis Results ===");
        System.out.println("Directory: " + result.getDirectoryPath());
        System.out.println("Number of Java Files = " + result.getJavaFileCount());
        System.out.println("Number of Issues = " + result.getSolvedIssueCount());
        System.out.println("=========================");
    }
}
