package domainLogic;

import java.sql.Timestamp;
import java.util.ArrayList;

public class Ergebnis {

	private Timestamp endzeit = null;
	private ArrayList<Timestamp> zwischenzeiten = new ArrayList<Timestamp>();
	private Laeufer laeufer = null;
	
	public Ergebnis(Timestamp endzeit, ArrayList<Timestamp> zwischenzeiten,
			Laeufer laeufer) {
		super();
		this.endzeit = endzeit;
		this.zwischenzeiten = zwischenzeiten;
		this.laeufer = laeufer;
	}
	
	public void korrigiereZwischenzeit(int index, Timestamp zeit) {
		
	}
	
	public void korrigiereEndzeit(Timestamp zeit) {
		
	}
	
	public void sendeAlsSms() {
		
	}
	
	public double getNettozeit() {
	
		return 0;
	}
	
	public double getBruttozeit() {
		
		return 0;
	}
	
	public Timestamp getEndzeit() {
		return endzeit;
	}
	public void setEndzeit(Timestamp endzeit) {
		this.endzeit = endzeit;
	}
	public ArrayList<Timestamp> getZwischenzeiten() {
		return zwischenzeiten;
	}
	public void setZwischenzeiten(ArrayList<Timestamp> zwischenzeiten) {
		this.zwischenzeiten = zwischenzeiten;
	}
	public Laeufer getLaeufer() {
		return laeufer;
	}
	public void setLaeufer(Laeufer laeufer) {
		this.laeufer = laeufer;
	}
}
