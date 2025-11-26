/**
 * Utility class providing helper methods
 * This should NOT be counted as a solved issue
 */
public class UtilityClass {

    public UtilityClass() {
        // Default constructor
    }

    public void helperMethod() {
        System.out.println("Helper method executed successfully");
    }

    public static String formatString(String input) {
        if (input == null || input.trim().isEmpty()) {
            return "Default";
        }
        return input.trim().toUpperCase();
    }

    public boolean validateInput(String input) {
        return input != null && !input.trim().isEmpty();
    }
}