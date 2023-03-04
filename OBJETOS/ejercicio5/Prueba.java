package ejercicio5;

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
		
		Division division1 = new Division();
		division1.cargar1();
		division1.cargar2();
		division1.operar();
		System.out.print("El resultado de la division es: ");
		division1.mostrarResultado();
		
		Multiplicacion multiplicacion1 = new Multiplicacion();
		multiplicacion1.cargar1();
		multiplicacion1.cargar2();
		multiplicacion1.operar();
		System.out.print("El resultado de la multiplicacion: ");
		multiplicacion1.mostrarResultado();
		
		Potencia potencia1 = new Potencia();
		potencia1.cargar1();
		potencia1.cargar2();
		potencia1.operar();
		System.out.print("El resultado de la potencia:");
		potencia1.mostrarResultado();
		
		Raiz raiz1 = new Raiz();
		raiz1.cargar1();
		raiz1.operar();
		System.out.print("El resultado de la potencia:");
		raiz1.mostrarResultado();
		
	}

}
