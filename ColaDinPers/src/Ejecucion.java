import java.util.Scanner;

public class Ejecucion {

	public static void main(String[] args) {
		Cola cola=new Cola();
		int edad;
		String nombre;

		Scanner sc = new Scanner(System.in); //Se crea el lector
		System.out.println("Ingrese Edad: ");
		edad = sc.nextInt();		
		
		while(edad !=0){
			System.out.println("Ingrese Nombre: ");
			nombre = sc.next();
			cola.insertar(edad, nombre);
			
			System.out.println("Ingrese Edad: ");
			edad = sc.nextInt();		
		}
		
		Persona p;
		while(!cola.estaVacia()){
			p=cola.extraer();
			System.out.println(p.getNombre()+" "+p.getEdad());
		}
	}
}
