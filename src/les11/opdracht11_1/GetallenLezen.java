package les11.opdracht11_1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class GetallenLezen {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("src/les11/opdracht11_1/invoer.txt");

        List<String> alleRegels = Files.readAllLines(path);
        double totaal = 0;

        for (String regel : alleRegels) {
            System.out.println(regel);
            totaal += Double.parseDouble(regel);
        }

        System.out.println("Aantal getallen: " + alleRegels.size());
        System.out.println("Gemiddelde: " + totaal / alleRegels.size());
    }
}
