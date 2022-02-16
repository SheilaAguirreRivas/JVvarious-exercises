import java.util.Scanner;

public class Ejecucion {

	public static void main(String[] args) {
		ColaEstArrList c = new ColaEstArrList();
		 int valor;
			Scanner sc=new Scanner(System.in);

			for (int i=0;i<5;i++)
			{
				System.out.println("Ingrese Valor: ");
				valor = sc.nextInt();
				c.insertar(valor);
			}
			while(!c.ColaVacia()){
				System.out.println(c.sacar());
			}
/* en vez del for, para que sea dinamico y cargue las veces que quiera
 * while (valor!=0)
 * {
 * c.insertar(valor);
 * 
 * System.out.println("Ingrese Valor: ");
				valor = sc.nextInt();
 * 
 * 
 * }
 * 
 * 
 * 
 * 
 * */
	}

}
