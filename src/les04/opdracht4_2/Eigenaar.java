package les04.opdracht4_2;

public class Eigenaar {
    private String naam;
    private int giroNr;
    private Huisdier beestje;

    public Eigenaar(String nm) {
        naam = nm;
    }

    public void setBeestje(Huisdier hd) {
        beestje = hd;
    }

    public Huisdier getBeestje() {
        return beestje;
    }

    public void setGiroNr(int nr) {
        giroNr = nr;
    }

    public int getGiroNr() {
        return giroNr;
    }

    public String getNaam() {
        return naam;
    }

    public String toString() {
        return naam + " heeft giro " + giroNr + ". En is het baasje van " + beestje;
    }
}
