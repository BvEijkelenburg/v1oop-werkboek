package les07.opdracht7_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

// We hebben geen getters, dus kunnen we alleen via de toString() testen.
public class VoertuigTest {

    @Test
    public void defaultConstructorTest() {
        Voertuig v1 = new Voertuig();
        assertEquals("Merk: onbekend, type: onbekend",
                v1.toString(),
                "De default constructor levert niet de goede uitkomst.");
    }

    @Test
    public void constructorMerkTest() {
        Voertuig v2 = new Voertuig("Fiat");
        assertEquals("Merk: Fiat, type: onbekend",
                v2.toString(),
                "De constructor met parameter 'merk' levert niet de goede uitkomst.");
    }

    @Test
    public void fullConstructorTest() {
        Voertuig v3 = new Voertuig("Ford", "Fiesta");
        assertEquals("Merk: Ford, type: Fiesta",
                v3.toString(),
                "De constructor met parameter 'merk' en 'type' levert niet de goede uitkomst.");
    }
}