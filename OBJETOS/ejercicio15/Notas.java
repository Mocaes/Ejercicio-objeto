package ejercicio15;
import java.util.Scanner;
public class Notas {
	public static void main (String [] args) {
		NotasAsignaturas notas= new NotasAsignaturas();
		notas.setAsignaturas(new String[] {"Entorno de desarrollo","Programación",
		"Sistemas informáticos","Base de datos","Lenguaje de marcas"});
		notas.setNotas(new float[] {7,8,9,10,8});
		
		float notaMedia = notas.calcularNotaMedia();
		System.out.println("Nota media: " + notaMedia);
		
		String calificacion= notas.determinarCalificacion();
		System.out.println("Claificación: " + calificacion);
	}
}
