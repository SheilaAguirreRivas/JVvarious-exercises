
public class Ejecucion {

	public static void main(String[] args) {
		ListaCircular lista=new ListaCircular();
		lista.insertNodo(4);
		lista.insertNodo(6);
		lista.insertNodo(1);
		lista.insertNodo(3);
		lista.insertNodo(8);
		
		lista.elimNodo(4);
		lista.mostrarLista();
		
		System.out.println("\n");
		
		lista.elimNodo(8);
		lista.mostrarLista();
		
		System.out.println("\n");
		
		lista.elimNodo(1);
		lista.mostrarLista();
	
	}

}
