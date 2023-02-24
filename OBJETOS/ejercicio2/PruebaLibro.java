package ejercicio2;
import java.util.*;

public class PruebaLibro {
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
	Libro[] listaLibro = new Libro[3];
	listaLibro[0] = new Libro();
	listaLibro[1] = new Libro();
	listaLibro[2] = new Libro();
	
	//dar valores al objeto libro1
	for ( int i = 0;i<=3;i++) {
	System.out.println("Coloque los datos");
	System.out.println(1);
	listaLibro[i].autor=s.nextLine();
	System.out.println(2);
	listaLibro[i].isbn=s.nextLine();
	System.out.println(3);
	listaLibro[i].titulo=s.nextLine();
	System.out.println(4);
	listaLibro[i].numeroDePaginas=s.nextInt();
	}
	
	// mostrar valores de los objetos
	for ( int i=0;i<=3;i++) {
	System.out.println(listaLibro[i].titulo+" "+listaLibro[i].autor+" "+ 
	listaLibro[i].isbn+" "+ listaLibro[i].numeroDePaginas);
	}
	}
}
