import java.util.Scanner;
public class Ejecucion {

		public static void main(String[] args){
			ColaEst c = new ColaEst();
			int valor=0;
			Scanner sc=new Scanner(System.in);
			while(!c.ColaLlena()){
				System.out.println("ingrese valor");
				valor = sc.nextInt();
				c.insertar(valor);
			}
			while(!c.ColaVacia()){
				System.out.println(c.sacar());
			}
		}
}
