package les05.opdracht5_2;

public class Main {
	public static void main(String[] args) {
		int leeftijd = 80;										// Bereik waarvoor de expressie 'true' is:
		System.out.println(!(leeftijd <= 65));					// leeftijd > 65
		
		int n = 10;
		System.out.println(!(n >= 18 || n < 7)); 				// 7 <= n < 18
		
		int x = 10;
		System.out.println(!(x >= 18 && x < 40));				// x < 18 || x >= 40
		System.out.println((x >= 10 && x <= 20 || x > 40));		// 10 <= x <= 20 of x > 40
		System.out.println((x >= 10 && (x <= 20 || x > 40)));	// 10 <= x <= 20 of x > 40
		System.out.println((x >= 10 || x > 40) && (x <= 20));	// 10 <= x <= 20
		
		char ch = 0;
		System.out.println((ch == 'A' && ch == 'B' ));			// geen waarden mogelijk
		System.out.println(!(ch == 'A' || ch == 'B' ));			// alles behalve 'A' en 'B'
	}
}

