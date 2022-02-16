
public class Ejecucion {

	public static void main(String[] args) {//si tiene la misma cantidad de elementos
		String s1[]= {"a", "b", "c", "d", "e", "f"};
		String s2[]= {"1", "2", "3", "4", "5", "6", "7"};
		Integer s3[]= {1,2,3,4,5,6};
	
		EltoAleatorio<String> e1=new EltoAleatorio<String>(s1);
		EltoAleatorio<String> e2=new EltoAleatorio<String>(s2);
		EltoAleatorio<Integer> e3=new EltoAleatorio<Integer>(s3);
		
		System.out.println(e1.mismoLargo(e3));
	}

}
