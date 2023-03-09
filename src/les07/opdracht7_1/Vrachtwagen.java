package les07.opdracht7_1;

public class Vrachtwagen extends Voertuig {
    private int laadvermogen = 0;

    public Vrachtwagen() {}

    public Vrachtwagen(String merk, int laadvermogen) {
        super(merk);
        this.laadvermogen = laadvermogen;
    }

    public Vrachtwagen(String merk, String type, int laadvermogen) {
        super(merk, type);
        this.laadvermogen = laadvermogen;
    }

    public String toString() {
        return "Vrachtwagen. " + super.toString() + ", met een laadvermogen van " + laadvermogen + " ton";
    }
}
