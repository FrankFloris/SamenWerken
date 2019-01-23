package Trein;

import java.time.LocalTime;

public class Connexion extends Trein{

	Connexion(LocalTime vertrektijd, LocalTime aankomsttijd, String vertreklocatie,
			String aankomstlocatie) {
		super("Connexion", vertrektijd, aankomsttijd, vertreklocatie, aankomstlocatie, "Trein");
		// TODO Auto-generated constructor stub
	}

}
