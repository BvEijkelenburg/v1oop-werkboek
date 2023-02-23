package les06.opdracht6_2;

import java.util.Scanner;

public class Main {
  public static void main(String[] arg) {
    FacebookAccount account = new FacebookAccount("Mike");

    Vriend v1 = new Vriend("Jan", "deMan", "jan@ziggo.nl");
    Vriend v2 = new Vriend("Kees", "Hoogtevrees", "keesh@gmail.com");
    Vriend v3 = new Vriend("Piet", "Kierewiet", "pietjuh@outlook.com");
		
    account.voegVriendToe(v1);
    account.voegVriendToe(v2);
    account.voegVriendToe(v3);
    account.voegVriendToe(v3);

    int aantal = account.aantalVrienden();
    System.out.println("Account werkt" + (aantal==3 ? "" : " niet") + "!");
    // Nu gaan we zoeken:
    String voornaam = leesVanToetsenbord("Voer een voornaam in: ");
    String achternaam = leesVanToetsenbord("Voer een achternaam in: ");
    String email = leesVanToetsenbord("Voer een emailadres in: ");

    Vriend v4 = new Vriend(voornaam, achternaam, email);
		
    if (account.isVriendMet(v4)) {
      System.out.println("Dit account is vriend met: " + v4);
    } else {
      System.out.println(v4 + " is geen vriend van dit account");
    }

    if (account.verwijderVriend(v4)) {
      System.out.println("Verwijderen van " +v4+ " gelukt!");
    } else {
    	System.out.println(v4 + " kon niet verwijderd worden!");
    }

    System.out.println("\n" + account);
  }
	
  @SuppressWarnings("resource")
  public static String leesVanToetsenbord(String boodschap) {
    Scanner scanner = new Scanner(System.in);
	
    System.out.print(boodschap + " ");
    String resultaat = scanner.nextLine();

    return resultaat;
  }
}

