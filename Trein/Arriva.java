package Trein;

import java.time.LocalTime;

public class Arriva extends Trein {

	Arriva(LocalTime vertrektijd, LocalTime aankomsttijd, String vertreklocatie,
			String aankomstlocatie) {
		super("Arriva", vertrektijd, aankomsttijd, vertreklocatie, aankomstlocatie, "Trein");
		// TODO Auto-generated constructor stub
	}

}
