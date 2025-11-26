/**
 * A regular class located in a subfolder
 * This should NOT be counted as a solved issue
 */
public class SubFolderClass {
    private String data;

    public SubFolderClass(String data) {
        this.data = data;
    }

    public void processData() {
        System.out.println("Processing data: " + data);
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    /**
     * Utility method for data transformation
     */
    public String transformData() {
        if (data == null) return "";
        return data.toUpperCase();
    }
}