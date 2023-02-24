package ejercicio13;
import java.util.Objects;
import ejercicio13.Coche;
import ejercicio13.Empleado;
import ejercicio13.Perro;

public class MainObjetos {
	public static void main(String[] args) {
	Coche[] coche=new Coche[5];
	String [] marca = {"Mercedes","Audi","Seat","Porche","Ferrari"};
	int[] caballos = {220,120,340,210,310};
	Perro[] perro = new Perro[5];
	String[] raza= {"pitbull","chiguagua","salchicha","pomerania","pastor aleman"};
	int [] cantidad= {2,3,1,10,2};
	Empleado[] empleado=new Empleado[5];
	String[] puesto= {"Cajero","Economista","Atencion al cliente","reponedor","Transportista"};
	int[] salario ={1200,2000,1400,900,1200};
	
	for(int i=0;i<marca.length; i++) {
		coche[i]=new Coche();	
	}
	
	for(int i=0;i<marca.length; i++) {
		perro[i]=new Perro();
	}
	
	for(int i=0;i<marca.length; i++) {
		empleado[i]=new Empleado();
	}
	for(int i=0; i<marca.length; i++) {
		coche[i].setNombre(marca[i]);
		coche[i].setCaballo(caballos[i]);
	}
	for(int i=0; i<marca.length; i++) {
		perro[i].setRaza(raza[i]);
		perro[i].setCantidad(cantidad[i]);
	}
	for(int i=0; i<marca.length; i++) {
		empleado[i].setSalario(salario[i]);
		empleado[i].setPuesto(puesto[i]);
	}
	System.out.println("Coche : ");
	for(int i=0;i<marca.length; i++){
	System.out.println("La marca es " + coche[i].getNombre() + " con caballos "+coche[i].getCaballos());
	System.out.println("--------------------------------------------------------------------------------");
	}
	System.out.println("Tabla perro: ");
	for(int i=0;i<marca.length; i++) {
	System.out.println("La raza del perro es " + perro[i].getRaza()+" con cantidad "+perro[i].getCantidad());
	System.out.println("--------------------------------------------------------------------------------");
	}
	System.out.println("Tabla Empleado: ");
	for(int i=0;i<marca.length; i++) {
	System.out.println("El puesto del trabajador es " + empleado[i].getPuesto() + " y su salario es " + empleado[i].getSalario());
	System.out.println("--------------------------------------------------------------------------------");
	}
	}
}
