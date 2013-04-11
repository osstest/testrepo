package domainLogic;

import java.util.ArrayList;

public class Laeufer {

	private String name = null;
	private Adresse adresse = null;
	private char geschlecht = 'm';
	private int jahrgang = 0;
	private ArrayList<Verein> vereine = null;
	private String mail = null;
	private long handynummer = 0;
	
	public Laeufer(String name, Adresse adresse, char geschlecht, int jahrgang, ArrayList<Verein> vereine, String mail, long handynummer) {
		
		this.name = name;
		this.adresse = adresse;
		this.geschlecht = geschlecht;
		this.jahrgang = jahrgang;
		this.vereine = vereine;
		this.mail = mail;
		this.handynummer = handynummer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public char getGeschlecht() {
		return geschlecht;
	}

	public void setGeschlecht(char geschlecht) {
		this.geschlecht = geschlecht;
	}

	public int getJahrgang() {
		return jahrgang;
	}

	public void setJahrgang(int jahrgang) {
		this.jahrgang = jahrgang;
	}

	public ArrayList<Verein> getVereine() {
		return vereine;
	}

	public void setVereine(ArrayList<Verein> vereine) {
		this.vereine = vereine;
	}
	
	public void addVerein(Verein verein) {
		this.vereine.add(verein);
	}
	
	public void removeVerein(Verein verein) {
		this.vereine.remove(verein);
	}
	
	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public long getHandynummer() {
		return handynummer;
	}

	public void setHandynummer(long handynummer) {
		this.handynummer = handynummer;
	}
}
