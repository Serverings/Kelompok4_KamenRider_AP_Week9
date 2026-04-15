package tugas.week9;

public class OScanner {
    private TransformationEngine engine = new TransformationEngine();

    public void scan(OOODriver driver) {
        try {
            TransformationResult result = engine.process(driver.getActiveMedals());
            result.display();
        } catch (InvalidMedalException e) {
            System.out.println("SCAN ERROR: " + e.getMessage());
        }
    }
}