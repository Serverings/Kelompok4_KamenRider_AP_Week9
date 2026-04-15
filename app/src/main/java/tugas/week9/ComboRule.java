package tugas.week9;

public class ComboRule {
    private String name;
    private CoreMedal head, arms, legs;
    private String chant;

    public ComboRule(String name, CoreMedal h, CoreMedal a, CoreMedal l, String chant) {
        this.name = name;
        this.head = h;
        this.arms = a;
        this.legs = l;
        this.chant = chant;
    }

    public boolean matches(CoreMedal h, CoreMedal a, CoreMedal l) {
        return head == h && arms == a && legs == l;
    }

    public String getName() { return name; }
    public String getChant() { return chant; }
    public CoreMedal getHead() { return head; }
    public CoreMedal getArms() { return arms; }
    public CoreMedal getLegs() { return legs; }
}