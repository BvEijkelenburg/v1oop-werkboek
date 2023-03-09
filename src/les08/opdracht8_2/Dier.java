package les08.opdracht8_2;
public class Dier {
  protected int aantalPoten;

  public Dier() {
    aantalPoten = 0;
  }

  public Dier(int aP) {
    aantalPoten = aP;
  }

  public String speak() {
    return "*";
  }

  public String toString() {
    return "Dier met " + aantalPoten + " poten";
  }
}
