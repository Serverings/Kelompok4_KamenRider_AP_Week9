package tugas.week9;

import java.util.ArrayList;
import java.util.List;

public class ComboCatalogue {
    private List<ComboRule> rules = new ArrayList<>();

    public ComboCatalogue() {
        rules.add(new ComboRule("Tatoba", CoreMedal.TAKA, CoreMedal.TORA, CoreMedal.BATTA, "TA-TO-BA! TATOBA TA-TO-BA!"));
        rules.add(new ComboRule("Gatakiriba", CoreMedal.KUWAGATA, CoreMedal.KAMAKIRI, CoreMedal.BATTA, "GATA-GATA-GATAKIRIBA!"));
        rules.add(new ComboRule("Latorartar", CoreMedal.LION, CoreMedal.TORA, CoreMedal.CHEETAH, "LA-LA-LATORARTAR!"));
        rules.add(new ComboRule("Sagohzo", CoreMedal.SAI, CoreMedal.GORILLA, CoreMedal.ZOU, "SA-GO-HZO! SAGOHZO!"));
        rules.add(new ComboRule("Shauta", CoreMedal.SHACHI, CoreMedal.UNAGI, CoreMedal.TAKO, "SHA-SHA-SHAUTA!"));
        rules.add(new ComboRule("Tajadol", CoreMedal.TAKA, CoreMedal.KUJAKU, CoreMedal.CONDOR, "TA-JA-DOL!"));
        rules.add(new ComboRule("Putotyra", CoreMedal.PTERA, CoreMedal.TRICERA, CoreMedal.TYRANNO, "PU-TO-TYRA-NNOSAURUS!"));
        rules.add(new ComboRule("Burakawani", CoreMedal.COBRA, CoreMedal.KAME, CoreMedal.WANI, "BURA-KA-WANI!"));
    }

   public ComboRule findMatchAnyOrder(List<CoreMedal> inputMedals) {
        for (ComboRule rule : rules) {
            // Cek apakah list input mengandung semua koin yang dibutuhkan rule tersebut
            if (inputMedals.contains(rule.getHead()) && 
                inputMedals.contains(rule.getArms()) && 
                inputMedals.contains(rule.getLegs())) {
                return rule;
            }
        }
        return null;
    }
}