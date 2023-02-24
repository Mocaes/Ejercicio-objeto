package ejercicio12;
import java.util.Objects;
import ejercicio11.Persona;
public class MainPersona {
	public static void main(String[]args) {
		Persona person=new Persona();
		person.setEdad(25);
		person.setNombre("Alberto");
		String MostraNombre=person.getNombre();
		int MostrarEdad=person.getEdad();
		
		System.out.println("Su nombre es " + MostraNombre +" su edad es " + MostrarEdad);
	}

}
