
package ejercicio5;
import java.util.Scanner;
public class operacio {
	protected Scanner teclado;
	protected double valor1;
	protected double valor2;
	protected double resultado;
	
	public operacio() {
		teclado=new Scanner (System.in);
	}
	public void cargar1() {
	System.out.print("Ingrese el primer valor:");
	valor1=teclado.nextInt();
	}
	public void cargar2() {
		System.out.print("Ingrese el segundo valor:");
		valor2=teclado.nextInt();
	}
	public void mostrarResultado() {
		System.out.println(resultado);
	}
}
