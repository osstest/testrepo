package domainLogic;

import java.util.ArrayList;
import java.util.Date;

public class Veranstaltung {


	String name = null;
	private double distanz = 0;
	private Date termin = null;
	private double startgebuehr = 0;
	private Date anmeldeschluss = null;
	private ArrayList<Anmeldung> anmeldungen = new ArrayList<Anmeldung>();
	private ArrayList<Anmeldung> startliste = new ArrayList<Anmeldung>(); 
	private Statistik statistik = new Statistik();
	
	public Veranstaltung(String name, double distanz, Date termin, double startgebuehr, Date anmeldeschluss) {
		
		this.anmeldeschluss = anmeldeschluss;
		this.distanz = distanz;
		this.name = name;
		this.startgebuehr = startgebuehr;
		this.termin = termin;
	}
	
	public void anmelden(Anmeldung anmeldung) {
		
		this.anmeldungen.add(anmeldung);
	}
	
	public boolean abmelden(Laeufer laeufer) {
		
		for(int i = 0; i < anmeldungen.size(); i++) {
			if(anmeldungen.get(i).getLaeufer().equals(laeufer)) {
				
				anmeldungen.remove(i);
				return true;
			}
		}
		
		return false;
	}
	
	public void bezahlen(Konto konto) {
		
		/** Wenn ein Laeufer für eine Veranstaltung bezahlt, wird ihm eine Startnummer zugewiesen und er wird von der Anmeldeliste in die
		 * Startliste umgetragen! **/
	}
	
	public ArrayList<Anmeldung> nichtBezahlt() {
		
		return anmeldungen;
	}
	
	public ArrayList<Anmeldung> getStartliste() {

		return startliste;
	}
	
	public int getAnmeldungszahl() {
		
		return (anmeldungen.size() + startliste.size());
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDistanz() {
		return distanz;
	}

	public void setDistanz(double distanz) {
		this.distanz = distanz;
	}

	public Date getTermin() {
		return termin;
	}

	public void setTermin(Date termin) {
		this.termin = termin;
	}

	public double getStartgebuehr() {
		return startgebuehr;
	}

	public void setStartgebuehr(double startgebuehr) {
		this.startgebuehr = startgebuehr;
	}

	public Date getAnmeldeschluss() {
		return anmeldeschluss;
	}

	public void setAnmeldeschluss(Date anmeldeschluss) {
		this.anmeldeschluss = anmeldeschluss;
	}

	public ArrayList<Anmeldung> getAnmeldung() {
		return anmeldungen;
	}

	public void setAnmeldung(ArrayList<Anmeldung> anmeldung) {
		this.anmeldungen = anmeldung;
	}

	public Statistik getStatistik() {
		return statistik;
	}

	public void setStatistik(Statistik statistik) {
		this.statistik = statistik;
	}
}
