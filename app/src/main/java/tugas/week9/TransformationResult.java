package tugas.week9;

public class TransformationResult {
    private String message;
    private boolean isCombo;

    public TransformationResult(String message, boolean isCombo) {
        this.message = message;
        this.isCombo = isCombo;
    }

    public void display() {
        System.out.println("\n>>> " + message + " <<<");
    }
}