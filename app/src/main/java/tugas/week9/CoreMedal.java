package tugas.week9;

public enum CoreMedal {
    // HEAD
    TAKA(MedalSlot.HEAD), KUWAGATA(MedalSlot.HEAD), LION(MedalSlot.HEAD), 
    SAI(MedalSlot.HEAD), SHACHI(MedalSlot.HEAD), PTERA(MedalSlot.HEAD), COBRA(MedalSlot.HEAD),
    
    // ARMS
    TORA(MedalSlot.ARMS), KAMAKIRI(MedalSlot.ARMS), GORILLA(MedalSlot.ARMS), 
    UNAGI(MedalSlot.ARMS), KUJAKU(MedalSlot.ARMS), TRICERA(MedalSlot.ARMS), KAME(MedalSlot.ARMS),
    
    // LEGS
    BATTA(MedalSlot.LEGS), CHEETAH(MedalSlot.LEGS), ZOU(MedalSlot.LEGS), 
    TAKO(MedalSlot.LEGS), CONDOR(MedalSlot.LEGS), TYRANNO(MedalSlot.LEGS), WANI(MedalSlot.LEGS);

    private final MedalSlot eligibleSlot;

    CoreMedal(MedalSlot slot) {
        this.eligibleSlot = slot;
    }

    public MedalSlot getEligibleSlot() {
        return eligibleSlot;
    }
}