package ejercicio8;

public class MainSalario {
	public static void main(String[] args) {
		salario sal = new salario("Alberto",1200,300);
		String nombre=sal.getNombre();
		double salario=sal.getSalario();
		double incremento = sal.getIncremento();
		double suma=salario+incremento;
		
		System.out.println("El empleado es "+nombre);
		System.out.println("El salario es "+salario);
		System.out.println("El incremento es "+incremento);
		System.out.println("El total a ingresar es "+suma);

	}
}
