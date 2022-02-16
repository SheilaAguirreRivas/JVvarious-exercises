
public class Persona {
	private int edad;
	private String nombre;
	private Persona siguiente;

	public Persona(int e,String n){
		this.edad=e;
		this.nombre=n;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setSiguiente(Persona siguiente) {
		this.siguiente = siguiente;
	}

	public Persona getSiguiente() {
		return this.siguiente;
	}
}
