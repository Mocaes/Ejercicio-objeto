package ejercicio4;

public class Prueba {

	public static void main(String[] args) {
		suma suma1=new suma();
		suma1.cargar1();
		suma1.cargar2();
		suma1.operar();
		System.out.print("el resultado de la suma es:");
		suma1.mostrarResultado();
		resta resta1=new resta();
		resta1.cargar1();
		resta1.cargar2();
		resta1.operar();
		System.out.print("El resultado de la resta es: ");
		resta1.mostrarResultado();
	}

}
