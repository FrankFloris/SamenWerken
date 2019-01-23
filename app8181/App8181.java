package app8181;
import java.time.LocalTime;
import java.util.ArrayList;

import Trein.*;

public class App8181 {
	public static void main(String[] args) {
		
		ArrayList<Transportmiddel> trans = new ArrayList<>();
		
		LocalTime vertrektijd = LocalTime.of(11, 13);
		LocalTime aankomsttijd = LocalTime.of(13, 15);
		
		Transportmiddel ns1 = new NS(vertrektijd, aankomsttijd , "Amsterdam", "Rotterdam");
//		Transportmiddel arr1 = new Arriva(aankomsttijd, aankomsttijd, null, null);
		 
		 ns1.vertrekmelding();
//		 Transportmiddel arriva1 = new Arriva

	}
}
