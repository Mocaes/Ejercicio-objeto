package ejercicio14;

public class NotasAsignaturas {
	private float notaEntornoDesarrollo;
	private float notaProgramacion;
	private float notaSistemasInformaticos;
	private float notaBaseDatos;
	private float notaLenguajeMarcas;
	public float getNotaEntornoDesarrollo() {
		return notaEntornoDesarrollo;
	}
	public void setNotaEntornoDesarrollo(float notaEntornoDesarrollo) {
		this.notaEntornoDesarrollo = notaEntornoDesarrollo;
	}
	public float getNotaProgramacion() {
		return notaProgramacion;
	}
	public void setNotaProgramacion(float notaProgramacion) {
		this.notaProgramacion = notaProgramacion;
	}
	public float getNotaSistemasInformaticos() {
		return notaSistemasInformaticos;
	}
	public void setNotaSistemasInformaticos(float notaSistemasInformaticos) {
		this.notaSistemasInformaticos = notaSistemasInformaticos;
	}
	public float getNotaBaseDatos() {
		return notaBaseDatos;
	}
	public void setNotaBaseDatos(float notaBaseDatos) {
		this.notaBaseDatos = notaBaseDatos;
	}
	public float getNotaLenguajeMarcas() {
		return notaLenguajeMarcas;
	}
	public void setNotaLenguajeMarcas(float notaLenguajeMarcas) {
		this.notaLenguajeMarcas = notaLenguajeMarcas;
	}
	
	public float calcularNotaMedia() {
		return (notaEntornoDesarrollo + notaProgramacion + notaSistemasInformaticos +notaBaseDatos + notaLenguajeMarcas) /5;
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
