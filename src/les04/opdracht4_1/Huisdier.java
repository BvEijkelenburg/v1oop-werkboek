package les04.opdracht4_1;

public class Huisdier {
    private String naam;
    private String ras;
    private double gewicht;
    private Eigenaar baasje;

    public Huisdier(String nm, String r) {
        naam = nm;
        ras = r;
        gewicht = 0.0;
    }

    public void setBaasje(Eigenaar e) {
        this.baasje = e;
    }

    public Eigenaar getBaasje() {
        return baasje;
    }

    public String getNaam() {
        return naam;
    }

    public String getRas() {
        return ras;
    }

    public String toString() {
        return naam + ", de " + ras + ", weegt " + gewicht + " kg. \nEn de eigenaar is: " + baasje;
    }
}
