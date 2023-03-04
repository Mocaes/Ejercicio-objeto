package ejercicio6;
import java.util.Scanner;

public class MetodoConstructor {
	private Scanner teclado;
	private int[] sueldos;
	
	public MetodoConstructor() {
		teclado=new Scanner(System.in);
		sueldos=new int[5];
		for(int f=0;f<5;f++) {
			System.out.print("Ingrese valor sueldo:");
			sueldos[f]=teclado.nextInt();
		}
	}
	public void imprimir() {
		for(int f=0;f<5;f++) {
			System.out.println(sueldos[f]);
		}
	}
	public static void main(String[] args) {
		MetodoConstructor operario=new MetodoConstructor();
		operario.imprimir();
	}
}
