package ejercicio10;

public class salario {
	private String nombre;
	private double salario;
	private double incremento;
	
	public salario(String nombre, double salario,double incremento) {
		this.incremento=incremento;
		this.nombre=nombre;
		this.salario=salario;
	}
	public double getIncremento() {
		
		return incremento;
	}
	public void setIncremento(double incremento) {
		this.incremento=+incremento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario += salario;
	}
	
	void mostrarDatos() {
		System.out.println(nombre +" "+ salario + " " + incremento);
		}
}
