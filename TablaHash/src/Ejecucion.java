import java.util.Arrays;

public class Ejecucion {

	public static void main(String[] args) {
		//int[] Elementos={"40","13","11","34","28"};
		int[] Elementos={40,13,10,32,20};
		ClaseHash Hash=new ClaseHash(Elementos.length*2);
		Hash.funcionHash(Elementos, Hash.TablaHash);

		int buscado;
		buscado=Hash.BuscarClave(13);
		buscado=Hash.BuscarClave(20);
	}

}
