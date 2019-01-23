package app8181.nl;
import app8181.nl.*;
import java.time.*;

public class App8181 {
	public static void main(String[] args) {
		
		LocalTime a = LocalTime.now();
		LocalTime b = LocalTime.of(12, 13);
		Transportmiddel c = new Transportmiddel("NS", a, b, "Amsterdam", "Rotterdam", "trein");
		System.out.println("test");
	}
}
