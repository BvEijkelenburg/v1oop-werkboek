package les08.opdracht8_2;

public class Eend extends Dier {
	  private boolean kanVliegen;

	  public Eend() {
	    super();
	    aantalPoten = 2;
	    kanVliegen = false;
	  }

	  public void setKanVliegen(boolean kV) {
	    kanVliegen = kV;
	  }

	  public String speak() {
	    return "kwaak kwaak kwaak";
	  }

	  public String toString() {
	    String alDanNiet = (kanVliegen ? "wel" : "niet");
	    return "Eend met " + super.toString() + " kan " +alDanNiet+ " vliegen";    
	  }
	}

