package domainLogic;

import java.util.ArrayList;

public class Statistik {

	private ArrayList<Ergebnis> ergebnisliste = new ArrayList<Ergebnis>();

	public ArrayList<Ergebnis> getErgebnisliste() {
		return ergebnisliste;
	}

	public void setErgebnisliste(ArrayList<Ergebnis> ergebnisliste) {
		this.ergebnisliste = ergebnisliste;
	}
	
	public void addErgebnis(Ergebnis ergebnis) {
		ergebnisliste.add(ergebnis);
	}
	
	public ArrayList<Ergebnis> getAufgeber() {
		
		ArrayList<Ergebnis> aufgeber = new ArrayList<Ergebnis>();
		
		/** Alle Ergebnisse ohne Endzeit kommen in die Aufgeberliste **/
		
		return aufgeber;
	}
}
