package les08.opdracht8_2;

public class Main {
	public static void main(String[] args) {
		System.out.println("1.	nee");
		System.out.println("2.	ja, deze zijn altijd final en static");
		System.out.println("3.	ja, deze zijn altijd abstract");
		System.out.println("4.	nee, interfaces kunnen geen constructor hebben");
		System.out.println("5.	ja");

		System.out.println("6.	ja");
		System.out.println("7.	nee");
		System.out.println("8.	ja");
		System.out.println("9.	ja");
		System.out.println("10.	nee, ervan kan slechts van 1 klasse");

		System.out.println("11.	nee constructors erft de subklasse niet, en private attributen/methoden zijn niet toegankelijk");
		System.out.println("12.	ja");
		System.out.println("13.	ja");
		System.out.println("14.	nee, alleen degene zonder parameters heet zo");
		System.out.println("15.	nee, de super() aanroep moet ALTIJD als eerste");

		System.out.println("16.	nee dit gaat niet altijd goed; als de superklasse constructors parameters hebben moet je super(..) aanroepen");
		System.out.println("17.	nee, AutoService is een interface");
		System.out.println("18.	ja, ALLEEN als Dier NIET abstract is");
		System.out.println("19.	nee, referentietype Dier heeft deze methode niet, dus de compiler keurt dit af");
		System.out.println("20.	nee, een Dier is geen Koe");
		System.out.println("21.	ja, referentietype AutoService heeft deze methode, dus de compiler keurt dit goed");
	}
}
