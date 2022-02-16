
public class Ejecucion {

	public static void main(String[] args) {
		ListaDoblementeEnlazada lista =	new ListaDoblementeEnlazada(); 
	       lista.alta(5);
	       lista.alta(10);
	       lista.alta(15);
	       lista.alta(20);
	       lista.alta(25);
	       lista.imprimirParaAdelante();
	       System.out.println("");
	       lista.delete(25);
	       lista.imprimirParaAtras();
	}

}
