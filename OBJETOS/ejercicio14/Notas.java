package ejercicio14;

public class Notas {
	public static void main (String [] args) {
		NotasAsignaturas notas= new NotasAsignaturas();
		notas.setNotaBaseDatos(7);
		notas.setNotaEntornoDesarrollo(8);
		notas.setNotaLenguajeMarcas(8);
		notas.setNotaProgramacion(6);
		notas.setNotaSistemasInformaticos(6);
		
		float notaMedia = notas.calcularNotaMedia();
		System.out.println("Nota media: " + notaMedia);
		
		String calificacion= notas.determinarCalificacion();
		System.out.println("Claificación: " + calificacion);
	}
}
