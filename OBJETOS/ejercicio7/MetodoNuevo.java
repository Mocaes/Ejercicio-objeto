package ejercicio7;
import java.util.Scanner;
public class MetodoNuevo {
	private Scanner teclado;
	private String[] nombres ;
	
	public MetodoNuevo() {
		teclado = new Scanner (System.in);
		nombres=new String[5];
		for(int i=0;i<5;i++) {
			System.out.print("ingrese un nombre");
			nombres[i]=teclado.nextLine();
		}
	}
	public void imprimir() {
		for(int i=0;i<5;i++){
		System.out.println(nombres[i]);
		}
	}
		public static void main(String[] args) {
			MetodoNuevo accion=new MetodoNuevo();
			accion.imprimir();
		
	}
}
