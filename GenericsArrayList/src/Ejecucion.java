import java.util.ArrayList;
import java.util.List;



public class Ejecucion {

	public static void main(String[] args) {
		ArrayList <Integer> lista = new ArrayList<>();
		lista.add(5);
		lista.add(7);
		
		int numero = (Integer) lista.get(0);// puede o no estar
		System.out.println(numero);
	}

}
