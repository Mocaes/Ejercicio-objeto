package ejercicio16;
import java.util.Scanner;
public class Notas {
	public static void main (String [] args) {
		NotasAsignaturas notas= new NotasAsignaturas();
		Scanner s = new Scanner(System.in);
		System.out.println("Coloque su nota de Base de Datos");
		notas.setNotaBaseDatos(s.nextInt());
		System.out.println("Coloque su nota de Entorno de Desarrollo");
		notas.setNotaEntornoDesarrollo(s.nextInt());
		System.out.println("Coloque su nota de Lenguaje de Marcas");
		notas.setNotaLenguajeMarcas(s.nextInt());
		System.out.println("Coloque su nota de Programacion");
		notas.setNotaProgramacion(s.nextInt());
		System.out.println("Coloque su nota de Sistemas informaticos");
		notas.setNotaSistemasInformaticos(s.nextInt());
		
		float notaMedia = notas.calcularNotaMedia();
		System.out.println("Nota media: " + notaMedia);
		
		String calificacion= notas.determinarCalificacion();
		System.out.println("Claificación: " + calificacion);
	}
}
