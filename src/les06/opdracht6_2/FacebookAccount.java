package les06.opdracht6_2;

import java.util.ArrayList;

public class FacebookAccount {
	private String naam;
	private ArrayList<Vriend> mijnVrienden;
	
	public FacebookAccount(String nm) {
		this.naam = nm;
		mijnVrienden = new ArrayList<>();
	}
	
	public String getNaam() {
		return naam;
	}
	
	public void voegVriendToe(Vriend nwV) {
		if (!mijnVrienden.contains(nwV)) {
			mijnVrienden.add(nwV);
		}
	}
	
	public boolean verwijderVriend(Vriend exV) {
		return mijnVrienden.remove(exV);
	}
	
	public boolean isVriendMet(Vriend v) {
		return mijnVrienden.contains(v);
	}
	
	public int aantalVrienden() {
		return mijnVrienden.size();
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(naam);
		
		if (aantalVrienden() > 0) {
			sb.append(" heeft " +aantalVrienden() + " vrienden: \n");
			mijnVrienden.forEach(vriend -> sb.append(vriend.toString() + "\n"));
		} else {
			sb.append(" heeft nog geen vrienden!");
		}
		
		return sb.toString();
	}
}
