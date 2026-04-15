package tugas.week9;

import java.util.*;

public class TransformationEngine {
    private ComboCatalogue catalogue = new ComboCatalogue();
    private String lastState = "";

    public TransformationResult process(CoreMedal[] slots) throws InvalidMedalException {
        // 1. Cek Kelengkapan (Harus ada 3 koin)
        List<CoreMedal> currentMedals = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            if (slots[i] == null) {
                throw new InvalidMedalException("Slot " + (i + 1) + " masih kosong! Butuh 3 medal untuk scan.");
            }
            currentMedals.add(slots[i]);
        }

        // Buat ID unik untuk cek Re-scan (Urutan tetap penting untuk ID status)
        String currentState = slots.toString() + slots.toString() + slots.toString();

        // 2. Cari di Katalog (Cek apakah 3 koin tersebut membentuk combo spesial)
        ComboRule match = catalogue.findMatchAnyOrder(currentMedals);

        // 3. Logika Scanning Charge
        if (currentState.equals(lastState) && match != null) {
            return new TransformationResult("SCANNING CHARGE! " + match.getChant(), true);
        }
        lastState = currentState;

        // 4. Output Hasil
        if (match != null) {
            return new TransformationResult(match.getChant() + "\n" + match.getName().toUpperCase() + " COMBO!", true);
        } else {
            return new TransformationResult("MIXED FORM!", false);
        }
    }
}