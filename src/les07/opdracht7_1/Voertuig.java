package les07.opdracht7_1;

public class Voertuig {
    private String merk = "onbekend";
    private String type = "onbekend";

    public Voertuig() {}

    public Voertuig(String merk) {
        this(merk, "onbekend");
    }

    public Voertuig(String merk, String type) {
        this.merk = merk;
        this.type = type;
    }

    public String toString() {
        return "Merk: " +merk+ ", type: " +type;
    }
}
