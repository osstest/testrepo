package domainLogic;

public class Adresse {

	private String strasse = null;
	private int hausnummer = 0;
	private char hausnummerzusatz = ' ';
	private int plz = 0;
	private String ort = null;
	private String land = null;
	
	public Adresse(String strasse, int hausnummer, char hausnummerzusatz,
			int plz, String ort, String land) {
		super();
		this.strasse = strasse;
		this.hausnummer = hausnummer;
		this.hausnummerzusatz = hausnummerzusatz;
		this.plz = plz;
		this.ort = ort;
		this.land = land;
	}
	
	public String getStrasse() {
		return strasse;
	}
	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}
	public int getHausnummer() {
		return hausnummer;
	}
	public void setHausnummer(int hausnummer) {
		this.hausnummer = hausnummer;
	}
	public char getHausnummerzusatz() {
		return hausnummerzusatz;
	}
	public void setHausnummerzusatz(char hausnummerzusatz) {
		this.hausnummerzusatz = hausnummerzusatz;
	}
	public int getPlz() {
		return plz;
	}
	public void setPlz(int plz) {
		this.plz = plz;
	}
	public String getOrt() {
		return ort;
	}
	public void setOrt(String ort) {
		this.ort = ort;
	}
	public String getLand() {
		return land;
	}
	public void setLand(String land) {
		this.land = land;
	}
}
