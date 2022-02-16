
public class Ejecucion {

	public static void main(String[] args) {
		Imprimidor<String> impStr = new Imprimidor<String>("Hola mundo");
		impStr.imprimir();//.imprimir_reves(); para que salga hola mundo al reves
		
		Imprimidor<Integer> impInt = new Imprimidor<Integer>(143);
		impInt.imprimir_reves();
	}

}
