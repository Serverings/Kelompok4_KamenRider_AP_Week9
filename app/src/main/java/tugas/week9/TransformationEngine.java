package tugas.week9;

import java.util.ArrayList;
import java.util.List;

public class TransformationEngine {
    private ComboCatalogue catalogue = new ComboCatalogue();
    private String lastState = "";
    public TransformationResult process(CoreMedal[] slots) throws InvalidMedalException {
        List<CoreMedal> currentMedals = new ArrayList<>();
        StringBuilder stateBuilder = new StringBuilder();

        for (int i = 0; i < 3; i++) {
            if (slots[i] == null) {
                throw new InvalidMedalException("Slot " + (i + 1) + " masih kosong!");
            }
            currentMedals.add(slots[i]);
            stateBuilder.append(slots[i].name());
        }

        String currentState = stateBuilder.toString();
        ComboRule match = catalogue.findMatchAnyOrder(currentMedals);

        if (currentState.equals(lastState) && match != null) {
            return new TransformationResult("SCANNING CHARGE! " + match.getChant(), true);
        }

        lastState = currentState;

        if (match != null) {
            return new TransformationResult(match.getChant() + "\n" + match.getName().toUpperCase() + " COMBO!", true);
        } else {
            return new TransformationResult("MIXED FORM!", false);
        }
    }
}