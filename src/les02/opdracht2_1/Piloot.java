package les02.opdracht2_1;

public class Piloot {
    private String naam;
    private int vlieguren;
    private double salaris;

    public Piloot(String nm) {
        naam = nm;
    }

    public void setSalaris(double sal) {
        salaris = sal;
    }

    public double getSalaris() {
        return salaris;
    }

    public void verhoogVliegurenMet(int uren) {
        vlieguren += uren;
    }

    public int getVlieguren() {
        return vlieguren;
    }

    @Override
    public String toString() {
        return naam + " heeft " + vlieguren + " vlieguren gemaakt en verdient " + salaris;
    }
}
