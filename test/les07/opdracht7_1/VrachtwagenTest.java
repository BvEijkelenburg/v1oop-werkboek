package les07.opdracht7_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

//We hebben geen getters, dus kunnen we alleen via de toString() testen.
public class VrachtwagenTest {

    @Test
    public void testDefaultConstructor() {
        Vrachtwagen v1 = new Vrachtwagen();
        assertEquals("Vrachtwagen. Merk: onbekend, type: onbekend, met een laadvermogen van 0 ton",
                v1.toString(),
                "De default constructor levert niet de goede uitkomst.");
    }

    @Test
    public void testConstructorMerkLaadvermogen() {
        Vrachtwagen v2 = new Vrachtwagen("Daf", 25);
        assertEquals("Vrachtwagen. Merk: Daf, type: onbekend, met een laadvermogen van 25 ton",
                v2.toString(),
                "De constructor met parameters 'merk' en 'laadvermogen' levert niet de goede uitkomst.");
    }

    @Test
    public void testFullConstructor() {
        Vrachtwagen v3 = new Vrachtwagen("Scania", "S5", 34);
        assertEquals("Vrachtwagen. Merk: Scania, type: S5, met een laadvermogen van 34 ton",
                v3.toString(),
                "De constructor met 3 parameters levert niet de goede uitkomst.");
    }
}