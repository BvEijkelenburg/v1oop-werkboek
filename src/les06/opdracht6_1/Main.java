package les06.opdracht6_1;

public class Main {
	public static void main(String[] args) {
		String s1 = "route" + 6 + 6;
		String s2 = 6 + 6 + "route";
		String s3 = "concert" + "piano";
		String s4 = "concertpiano";

		System.out.println("1: s1 = " + s1 + " / s2 = " +s2);
		System.out.println("2: == (" + (s3 == s4) + ") vs equals: (" + (s3.equals(s4)) + ")");
		System.out.println("3: s3.length(): " + s3.length());
		System.out.println("4: s4.charAt(3): " + s4.charAt(3));  
		System.out.println("5: \"boom\".compareTo(\"roos\"): " + "boom".compareTo("roos"));
		System.out.println("6: int x = Integer.parseInt(\"6\"): " + Integer.parseInt("6"));
	}
}
