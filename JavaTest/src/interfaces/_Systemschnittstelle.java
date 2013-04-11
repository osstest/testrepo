package interfaces;

//public enum Auswertung {STARTLISTE, GESAMTERGEBNISLISTE, NICHTSTARTER, ABBRECHER};

import domainLogic.Anmeldung;
import domainLogic.Ergebnis;
import domainLogic.Laeufer;
import domainLogic.Veranstaltung;
import domainLogic.Verein;
import java.util.List;

public interface _Systemschnittstelle {
	
	void erzeugeVeranstaltung(Veranstaltung v);
	void erzeugeVerein(Verein v);
	void erzeugeAnmeldung(Anmeldung a);
	void erzeugeLaeufer(Laeufer a);
	void erzeugeLaufzeit(Ergebnis e);
	
	List<Veranstaltung> getVeranstaltungen();
	List<Verein> getVereine();
	List<Laeufer> getLaeufer();
	List<Anmeldung> getAnmeldungen(String Veranstaltung);
	List<Ergebnis> getLaufzeiten(String Veranstaltung);
//	List<ListeneintragDTO> getAuswertung(Auswertung a, String Veranstaltung);	// Nicht nötig bzw. möglich
	
	void init();
}