/**
 * A regular Java class without any issue-related keywords
 * This should NOT be counted as a solved issue
 */
public class RegularClass {
    private String name;
    private int value;

    public RegularClass(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Value: " + value);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}