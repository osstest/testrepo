package testClasses;

import static org.junit.Assert.*;

import java.util.ArrayList;

import domainLogic.Adresse;
import domainLogic.Laeufer;
import domainLogic.Verein;

public class LaeuferTest {

	@org.junit.Test
	public void test() {
		
		erstelleLaeufer();
	}
	
	public Laeufer erstelleLaeufer() {
		
		String name = "Hans-Peter Maier";
		Adresse adresse = new Adresse("Hansstrasse", 12, 'a', 79100, "Freiburg", "Germany");
		char geschlecht = 'm';
		int jahrgang = 1945;
		Verein verein = new Verein("Hansverein", "Register A", 13, adresse);
		ArrayList<Verein> vereine = new ArrayList<Verein>();
		vereine.add(verein);
		String mail = "hans@hansverein.de";
		long handynummer = 0761666666;
		
		Laeufer laeufer = new Laeufer(name, adresse, geschlecht, jahrgang, vereine, mail, handynummer);
		
		assertEquals(name,laeufer.getName());
		assertEquals(adresse,laeufer.getAdresse());
		assertEquals(geschlecht,laeufer.getGeschlecht());
		assertEquals(jahrgang,laeufer.getJahrgang());
		assertEquals(vereine,laeufer.getVereine());
		assertEquals(mail,laeufer.getMail());
		assertEquals(handynummer,laeufer.getHandynummer());
		
		return laeufer;
	}
}
