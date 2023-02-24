package ejercicio15;

public class NotasAsignaturas {
	private String[] asignaturas;
	private float[] notas;
	
	
	public String[] getAsignaturas() {
		return asignaturas;
	}
	public void setAsignaturas(String[] asignaturas) {
		this.asignaturas = asignaturas;
	}
	public float[] getNotas() {
		return notas;
	}
	public void setNotas(float[] notas) {
		this.notas = notas;
	}
	public float calcularNotaMedia() {
		float sum=0;
		for(float nota:notas) {
			sum+=nota;
		}
		return sum/notas.length;
	}
	public String determinarCalificacion() {
		float notaMedia=calcularNotaMedia();
		if(notaMedia<5) {
			return "Suspendido";
		}else if (notaMedia<7) {
			return "aprobado";
		}else if (notaMedia<9) {
			return "Bien";
		}else if (notaMedia<10) {
			return "Notable";
		}else {
			return "Sobresaliente";
		}
	}
}
