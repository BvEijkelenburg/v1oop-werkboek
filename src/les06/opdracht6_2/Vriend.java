package les06.opdracht6_2;

public class Vriend {
	private String voornaam;
	private String achternaam;
	private String email;

	public Vriend(String vnm, String anm, String em) {
		this.voornaam = vnm;
		this.achternaam = anm;
		this.email = em;
	}

	public boolean equals(Object andereObject) {
		boolean gelijkeObjecten = false; // blijft false tenzij:

		if (andereObject instanceof Vriend) {
			Vriend andereKlant = (Vriend) andereObject;

			if (this.voornaam.equals(andereKlant.voornaam) && 
				this.achternaam.equals(andereKlant.achternaam) && 
				this.email.equals(andereKlant.email)) {

				gelijkeObjecten = true;
			}
		}

		return gelijkeObjecten;

	}

	public String toString() {
		return voornaam + " " + achternaam + ", email: " + email;
	}
}
