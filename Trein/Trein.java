package Trein;
import app8181.*;

import java.time.*;

public class Trein extends Transportmiddel {

	protected Trein(String bedrijfsnaam, LocalTime vertrektijd, LocalTime aankomsttijd, String vertreklocatie,
			String aankomstlocatie, String soortopenbaarvervoer) {
		super(bedrijfsnaam, vertrektijd, aankomsttijd, vertreklocatie, aankomstlocatie, soortopenbaarvervoer);
	}

}

