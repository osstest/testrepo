package testClasses;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;

import org.junit.Test;

import domainLogic.Anmeldung;
import domainLogic.Laeufer;
import domainLogic.Statistik;
import domainLogic.Veranstaltung;

public class VeranstaltungTest {

	@Test
	public void test() {
		
		LaeuferTest laeuferTest = new LaeuferTest();
		Laeufer laeufer = laeuferTest.erstelleLaeufer();
		
		meldeLaeufer(laeufer, genVeranstaltung());
	}
	
	private Veranstaltung genVeranstaltung() {
		
		String name = "Hanslauf";
		double distanz = 42;
		Date termin = new Date(System.currentTimeMillis());
		double startgebuehr = 12;
		Date anmeldeschluss = new Date(System.currentTimeMillis() + 50000);
		new ArrayList<Anmeldung>();
		new ArrayList<Anmeldung>(); 
		new Statistik();
		
		Veranstaltung veranstaltung = new Veranstaltung(name, distanz, termin, startgebuehr, anmeldeschluss);
		
		assertEquals(name,veranstaltung.getName());
		assertEquals(distanz,veranstaltung.getDistanz(),0);
		assertEquals(termin,veranstaltung.getTermin());
		assertEquals(startgebuehr,veranstaltung.getStartgebuehr(),0);
		assertEquals(anmeldeschluss,veranstaltung.getAnmeldeschluss());
		
		assertNotNull(veranstaltung.getStatistik());
		assertNotNull(veranstaltung.getAnmeldung());
		assertNotNull(veranstaltung.getStartliste());
		
		return veranstaltung;
	}
	
	private void meldeLaeufer(Laeufer laeufer, Veranstaltung veranstaltung) {
		
		veranstaltung.anmelden(new Anmeldung(laeufer, false, false, null));
		assertEquals(laeufer,veranstaltung.getAnmeldung().get(0).getLaeufer());
		
		assertEquals(1,veranstaltung.getAnmeldungszahl());

		veranstaltung.anmelden(new Anmeldung(laeufer, false, false, null));
		veranstaltung.anmelden(new Anmeldung(laeufer, false, false, null));
		veranstaltung.anmelden(new Anmeldung(laeufer, false, false, null));
		veranstaltung.anmelden(new Anmeldung(laeufer, false, false, null));
		veranstaltung.anmelden(new Anmeldung(laeufer, false, false, null));
		veranstaltung.anmelden(new Anmeldung(laeufer, false, false, null));
		
		assertEquals(7,veranstaltung.getAnmeldungszahl());
	}
}
