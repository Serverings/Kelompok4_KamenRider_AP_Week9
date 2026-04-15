package tugas.week9;

public class OOODriver {
    // Menggunakan array tetap berukuran 3 untuk slot 1, 2, dan 3
    private CoreMedal[] slots = new CoreMedal[3];

    public void insertMedal(int slotNumber, CoreMedal medal) throws InvalidMedalException {
        // Validasi nomor slot (1-3)
        if (slotNumber < 1 || slotNumber > 3) {
            throw new InvalidMedalException("Nomor slot tidak valid! Pilih 1, 2, atau 3.");
        }

        // Cek apakah slot sudah terisi
        if (slots[slotNumber - 1] != null) {
            throw new InvalidMedalException("Slot " + slotNumber + " sudah terisi oleh " + slots[slotNumber - 1] + "!");
        }

        // Sekarang medal boleh masuk walaupun slotnya salah secara tipe
        slots[slotNumber - 1] = medal;
        System.out.println("Medal " + medal + " berhasil dimasukkan ke Slot " + slotNumber);
    }

    public void ejectMedal(int slotNumber) throws InvalidMedalException {
        if (slotNumber < 1 || slotNumber > 3) {
            throw new InvalidMedalException("Pilih slot 1, 2, atau 3 untuk eject.");
        }
        
        if (slots[slotNumber - 1] == null) {
            System.out.println("Slot " + slotNumber + " memang sudah kosong.");
        } else {
            System.out.println("Ejecting " + slots[slotNumber - 1] + " dari Slot " + slotNumber);
            slots[slotNumber - 1] = null;
        }
    }

    public CoreMedal[] getSlots() {
        return slots;
    }
}