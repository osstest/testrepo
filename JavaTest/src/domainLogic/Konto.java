package domainLogic;

public class Konto {
	
	@SuppressWarnings("unused")
	private int blz = 0;
	@SuppressWarnings("unused")
	private int kontonummer = 0;

	public Konto(int blz, int kontonummer)  {
		
		this.blz = blz;
		this.kontonummer = kontonummer;
	}
}
