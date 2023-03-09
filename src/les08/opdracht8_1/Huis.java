package les08.opdracht8_1;

public class Huis extends Gebouw {
	public int laatsteRenovatie;
	public boolean isGeisoleerd;
	
	public Huis() {}
	
	public Huis(boolean isG) {
		isGeisoleerd = isG;
	}
	
	public Huis(int l, int b, int aV) {
		super(l, b, aV);
	}
	
	public Huis(int l, int b, int aV, boolean isG) {
		super(l, b, aV);
		isGeisoleerd = isG;
	}
			
	
	public void isoleer() {
		isGeisoleerd = true;
	}
	
	public double berekenHuur() {
		return oppervlakte() * 100;
	}
	
	public void renoveer(int jaarBinnen) {
		laatsteRenovatie = jaarBinnen;
	}
	
	public void renoveer(int jaarBinnen, int jaarBuiten) {
		super.renoveer(jaarBuiten);
		laatsteRenovatie = jaarBinnen;
	}
	
	public String toString() {
		return super.toString() + " laatste binnen renovatie: " + laatsteRenovatie + " extra geisoleerd: " +isGeisoleerd;
	}
}
