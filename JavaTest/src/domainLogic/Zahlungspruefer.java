package domainLogic;

import java.util.ArrayList;

public class Zahlungspruefer extends Thread {

	ArrayList<Veranstaltung> veranstaltungen = new ArrayList<Veranstaltung>();
	
	public void run() {
		
		while(true) {
			
			pruefeZahlungen();
		}
	}
	
	public void addVeranstaltung(Veranstaltung veranstaltung) {
		
		/** Wird jedesmal aufgerufen nachdem eine Veranstaltung erstellt wurde! **/
		
		veranstaltungen.add(veranstaltung);
	}
	
	public void removeVeranstaltung(Veranstaltung veranstaltung) {
		
		/** Wird jedesmal aufgerufen nachdem eine Veranstaltung beendet wurde! **/
		
		veranstaltungen.remove(veranstaltung);
	}
	
	public void pruefeZahlungen() {
		
		/** Hier wird geprüft wer gezahlt hat und wer nicht. Ggf. wird erinnert! **/
	}
}
