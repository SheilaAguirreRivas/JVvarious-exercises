
public class Ejecucion {

	public static void main(String[] args) {
		String s1="Aldo";
		StringBuffer s2= new StringBuffer("Emma");
		ComparadorObjs<String, StringBuffer> comp=new ComparadorObjs<String, StringBuffer>(s1,s2);
		System.out.println(comp.mismaPrimeraLetra());
	}
}
