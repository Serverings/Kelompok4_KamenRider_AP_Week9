package tugas.week9;

public class OOODriver {
    private CoreMedal[] slots = new CoreMedal[3];

    public void insertMedal(int slotNumber, CoreMedal medal) throws InvalidMedalException {
        if (slotNumber < 1 || slotNumber > 3) {
            throw new InvalidMedalException("Nomor slot tidak valid!");
        }

        for (int i = 0; i < slots.length; i++) {
            if (slots[i] != null && slots[i] == medal) {
                throw new InvalidMedalException("Medal " + medal + " sudah terpasang di Slot " + (i + 1));
            }
        }

        if (slots[slotNumber - 1] != null) {
            throw new InvalidMedalException("Slot " + slotNumber + " sudah terisi!");
        }

        slots[slotNumber - 1] = medal;
        System.out.println("Medal " + medal + " dimasukkan ke Slot " + slotNumber);
    }

    public void ejectMedal(int slotNumber) throws InvalidMedalException {
        if (slotNumber < 1 || slotNumber > 3) throw new InvalidMedalException("Slot tidak valid!");
        
        if (slots[slotNumber - 1] != null) {
            System.out.println("Ejecting " + slots[slotNumber - 1]);
            slots[slotNumber - 1] = null;
        }
    }

    public CoreMedal[] getSlots() {
        return slots;
    }
}