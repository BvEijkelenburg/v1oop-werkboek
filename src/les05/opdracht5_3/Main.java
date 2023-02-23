package les05.opdracht5_3;

import les04.opdracht4_2.Huisdier;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Huisdier> dieren = new ArrayList<>();

        Huisdier dier1 = new Huisdier("Astrid", "Pekinees");
        Huisdier dier2 = new Huisdier("Brutus", "Mechelse herder");

        dieren.add(dier1);
        dieren.add(dier2);
        dieren.add(new Huisdier("Bello", "Friese stabij"));

        System.out.println("Aantal dieren in lijst: " + dieren.size());

        for (Huisdier dier : dieren) {
            System.out.println(dier);
        }
        System.out.println();

        dieren.add(0, new Huisdier("Noortje", "Abessijn"));
        dieren.set(2, new Huisdier("Brutus", "Duitse herder"));

        for (Huisdier dier : dieren) {
            System.out.println(dier);
        }
    }
}

