package domainLogic;

public class Anmeldung {

	private Laeufer laeufer = null;
	private boolean bezahlt = false;
	private boolean sms = false;
	private int startnummer = 0;
	private boolean disqualifiziert = false;
	private Verein verein = null;
	
	public Anmeldung(Laeufer laeufer, boolean bezahlt, boolean sms, Verein verein) {
		
		this.laeufer = laeufer;
		this.bezahlt = bezahlt;
		this.sms = sms;
		this.setVerein(verein);
	}
	
	public void erinnern() {
		
		/** Wird vom Zahlungsprüfer aufgerufen! **/
	}

	public Laeufer getLaeufer() {
		return laeufer;
	}

	public void setLaeufer(Laeufer laeufer) {
		this.laeufer = laeufer;
	}

	public boolean isBezahlt() {
		return bezahlt;
	}

	public void setBezahlt(boolean bezahlt) {
		this.bezahlt = bezahlt;
	}

	public boolean isSms() {
		return sms;
	}

	public void setSms(boolean sms) {
		this.sms = sms;
	}

	public int getStartnummer() {
		return startnummer;
	}

	public void setStartnummer(int startnummer) {
		this.startnummer = startnummer;
	}

	public boolean isDisqualifiziert() {
		return disqualifiziert;
	}

	public void setDisqualifiziert(boolean disqualifiziert) {
		this.disqualifiziert = disqualifiziert;
	}

	public Verein getVerein() {
		return verein;
	}

	public void setVerein(Verein verein) {
		this.verein = verein;
	}

	
}
