package les08.opdracht8_1;

public class Gebouw {
	private double lengte;
	private double breedte;
	private int aantalVerdiepingen;
	public int laatsteRenovatie;
	
	public Gebouw() {
		
	}
	
	public Gebouw(double l, double b, int aV) {
		lengte = l; breedte = b; aantalVerdiepingen = aV;
	}
	
	public double oppervlakte() {
		return lengte * breedte * aantalVerdiepingen;
	}
	
	public void renoveer(int jaarBuiten) {
		laatsteRenovatie = jaarBuiten;
	}
	
	public double berekenHuur() {
		return oppervlakte() * 75;
	}
	
	public String toString() {
		return "lengte x breedte: " + lengte + "x" + breedte + " verdiepingen: " + aantalVerdiepingen + " laatste buitenrenovatie: " + laatsteRenovatie;
	}
}
