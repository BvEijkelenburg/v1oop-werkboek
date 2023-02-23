package les05.opdracht5_1;

public class Main {
	public static void main(String[] args) {
		/* Plaats een breakpoint op de volgende regel en debug 
		 * het programma in de les. Zo kan je de opgaven bespreken
		 * en de klas de antwoorden laten geven */ 
		
		System.out.println(8 + 3 * 5);
		System.out.println((7.0 + 1) / 2);
		System.out.println(7.0 + 1 / 2);
		System.out.println(8 + 4 / 2 * 2);
		System.out.println(8 + 5 / 2 * 2);
		
		System.out.println(1 + 2 + "3" + 4 + 5);
		System.out.println(147 / 11);
		System.out.println(147 % 11);
		System.out.println(837462 / 100);
		System.out.println(837462 % 100);
		
		System.out.println((10 + 11) / 2.0);
		System.out.println((10 + 11) / 2);
		System.out.println(10 + 11 / 2.0);
		
		int a, b, c, d, m;
		
		a = b = c = (d = 6);
		System.out.println(String.format("%d %d %d %d", a, b, c, d));
		
		m = (b + ++c + a++);
		System.out.println(String.format("%d %d %d %d", m, a, b, c));
	}
}
