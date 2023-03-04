package ejercicio10;
import java.util.Scanner;
public class MainSalario {
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		salario sal = new salario(null, 0, 0);
		
		System.out.println("Porfavor coloque su nombre");
		sal.setNombre(s.nextLine());
		String nombre=sal.getNombre();
		
		System.out.println("Coloque su salario");
		sal.setSalario(s.nextInt());
		double salario=sal.getSalario();
		sal.mostrarDatos();
		
		System.out.println("Porfavor coloque cuanto quiere incrementar");
		sal.setIncremento(s.nextInt());
		double incremento = sal.getIncremento();
		sal.setSalario(incremento);
		
		sal.mostrarDatos();

	}
}
