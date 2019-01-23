package app8181.nl.Trein;

import java.time.*;

public class Trein {
	public String bedrijfsnaam;
	public LocalTime vertrektijd;
	public LocalTime aankomsttijd;
	public String vertreklocatie;
	public String aankomstlocatie;
	Trein (String bedrijfsnaam, LocalTime vertrektijd, LocalTime aankomsttijd, String vertreklocatie, String aankomstlocatie){
		this.bedrijfsnaam = bedrijfsnaam;
		this.vertrektijd = vertrektijd;
		this.aankomsttijd = aankomsttijd;
		this.vertreklocatie = vertreklocatie;
		this.aankomstlocatie = aankomstlocatie;
	}
	void vertrekmelding() {
		System.out.println("De " + bedrijfsnaam + " trein van " + vertreklocatie + " naar " + aankomstlocatie +  " vertrekt om " + vertrektijd);
	}
}

