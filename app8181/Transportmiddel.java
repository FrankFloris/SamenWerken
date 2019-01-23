package app8181;


import java.time.LocalTime;

public class Transportmiddel {
	public String bedrijfsnaam;
	public LocalTime vertrektijd;
	public LocalTime aankomsttijd;
	public String vertreklocatie;
	public String aankomstlocatie;
	public String soortopenbaarvervoer;
	protected Transportmiddel (String bedrijfsnaam, LocalTime vertrektijd, LocalTime aankomsttijd, String vertreklocatie, String aankomstlocatie, String soortopenbaarvervoer){
		this.bedrijfsnaam = bedrijfsnaam;
		this.vertrektijd = vertrektijd;
		this.aankomsttijd = aankomsttijd;
		this.vertreklocatie = vertreklocatie;
		this.aankomstlocatie = aankomstlocatie;
		this.soortopenbaarvervoer = soortopenbaarvervoer;
	}
	void vertrekmelding() {
		System.out.println("De " + bedrijfsnaam + " " + soortopenbaarvervoer.toLowerCase() + " van " + vertreklocatie + " naar " + aankomstlocatie +  " vertrekt om " + vertrektijd);
		
	}
}
