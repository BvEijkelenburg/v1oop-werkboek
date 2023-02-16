package les03.opdracht3_2;

import java.util.Random;

public class BelastingTarieven {
    public void produceerBelastingTarieven() {
        for (int i = 1; i <= 10; i++) {
            int random = new Random().nextInt(5);
            double tarief = (100 / random) - 20;
            System.out.println(tarief + " %");
        }
    }
}
