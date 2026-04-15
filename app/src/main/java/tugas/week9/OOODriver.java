package tugas.week9;

import java.util.HashMap;
import java.util.Map;

public class OOODriver {
    private Map<MedalSlot, CoreMedal> activeMedals = new HashMap<>();

    public void insertMedal(CoreMedal medal) throws InvalidMedalException {
        if (activeMedals.containsKey(medal.getEligibleSlot())) {
            throw new InvalidMedalException("Slot " + medal.getEligibleSlot() + " is already occupied!");
        }
        activeMedals.put(medal.getEligibleSlot(), medal);
        System.out.println("Inserted " + medal + " into " + medal.getEligibleSlot());
    }

    public void ejectAll() {
        activeMedals.clear();
        System.out.println("All medals ejected.");
    }

    public Map<MedalSlot, CoreMedal> getActiveMedals() {
        return activeMedals;
    }
}