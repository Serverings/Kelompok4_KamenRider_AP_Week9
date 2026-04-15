package tugas.week9;

import java.util.Map;

public class TransformationEngine {
    private ComboCatalogue catalogue = new ComboCatalogue();
    private String lastState = "";

   public TransformationResult process(Map<MedalSlot, CoreMedal> slots) throws InvalidMedalException {
    if (slots.size() < 3) {
        throw new InvalidMedalException("Incomplete Medals! Need 3 medals to scan.");
    }

    CoreMedal h = slots.get(MedalSlot.HEAD);
    CoreMedal a = slots.get(MedalSlot.ARMS);
    CoreMedal l = slots.get(MedalSlot.LEGS);

    String currentState = h.toString() + a.toString() + l.toString();
    ComboRule match = catalogue.findMatch(h, a, l);

    // LOGIC BARU: Cek Scanning Charge
    if (currentState.equals(lastState)) {
        // Hanya boleh Scanning Charge kalau match (Full Combo)
        if (match != null) {
            return new TransformationResult("SCANNING CHARGE! " + match.getName().toUpperCase() + " VICTORY!", true);
        } else {
            // Kalau Mixed Form discan ulang, tetap Mixed Form (atau beri pesan error)
            return new TransformationResult("Mixed Form detected. No Finishing Move available for mixed states.", false);
        }
    }

    lastState = currentState;

    if (match != null) {
        return new TransformationResult(match.getChant() + "\n" + match.getName().toUpperCase() + " COMBO!", true);
    } else {
        return new TransformationResult("MIXED FORM!", false);
    }
}
}