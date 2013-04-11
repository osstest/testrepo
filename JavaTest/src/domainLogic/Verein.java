package domainLogic;

public class Verein {

	private String name = null;
	private String register = null;
	private int registernummer = 0;
	private Adresse adresse = null;
	
	public Verein(String name, String register, int registernummer, Adresse adresse) {
		super();
		this.name = name;
		this.register = register;
		this.registernummer = registernummer;
		this.adresse = adresse;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRegister() {
		return register;
	}

	public void setRegister(String register) {
		this.register = register;
	}

	public int getRegisternummer() {
		return registernummer;
	}

	public void setRegisternummer(int registernummer) {
		this.registernummer = registernummer;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
}
