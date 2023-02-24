package ejercicio12;

public class MainPersonaArray {
	public static void main(String[] args) {

		Persona [] peaple= new Persona[5];
		String [] nombres= {"Alberto","Ana","Eva","Laura","Pablo"};
		int [] edades= {25,35,23,28,21};
		
		for (int i=0;i<edades.length;i++) {
		peaple[i]=new Persona();
		}
	 
		for (int i=0;i<edades.length;i++) {
		peaple[i].setEdad(edades[i]);
		peaple[i].setNombre(nombres[i]);
		}
	
		for (int i=0;i<edades.length;i++) {
		System.out.println("la edad es "+ peaple[i].getEdad()+ 
		" de la persona " +peaple[i].getNombre());
		}
	}
}
