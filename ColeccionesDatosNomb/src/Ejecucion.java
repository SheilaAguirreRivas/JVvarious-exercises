import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Ejecucion {

	public static void main(String[] args) {
		ListIterator<String> litr = null;
		List<String> names = new ArrayList<String>();
		names.add("Juana");
		names.add("Pedro");
		names.add("Pablo");
		names.add("Tomas");
		names.add("Carolina");
		
		//Obtaining list iterator
		litr=names.listIterator();
		
		System.out.println("Recorrido para adelante: ");
		while(litr.hasNext()) {
			System.out.println(litr.next());
			}
		System.out.println("\nRecorrido para atras: ");
		while(litr.hasPrevious()) {
		System.out.println(litr.previous());
		}
	}
}

