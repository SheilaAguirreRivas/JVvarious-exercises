
public class Ejecucion {

	public static void main(String[] args) {
		Elemento<Integer> A=new Elemento<>(4);
		Elemento<Integer> B=new Elemento<>(4);
		
		if(A.compareTo(B)) {
			System.out.println("Son iguales");
		}
		else {
			System.out.println("No son iguales");
		}

	}
}
