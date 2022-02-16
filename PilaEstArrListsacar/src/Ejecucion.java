import java.util.Scanner;
import java.util.ArrayList;

public class Ejecucion {

	public static void main(String[] args) {
		PilaEstArrListsacar	 p= new PilaEstArrListsacar();
		Integer valor;
			Scanner sc=new Scanner(System.in);
			
			for (int i=0;i<5;i++)
			{
				System.out.println("Ingrese valor: ");
				valor = sc.nextInt();
				p.insertar(valor);
			}
			while(!p.PilaVacia()){
				System.out.println(p.sacar());
			}
	}

}
