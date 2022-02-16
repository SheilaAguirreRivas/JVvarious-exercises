import java.util.Scanner;
import java.util.ArrayList;


public class Ejecucion {

	public static void main(String[] args) {
		ArrayList<Integer> pepe= new ArrayList<Integer>();
		//agregar
		pepe.add(2);
		pepe.add(2);
		pepe.add(2);
		pepe.add(2);
		pepe.add(2);
		pepe.add(45);
		pepe.add(34);
		
		//para eliminar
		pepe.remove(6);
		
		//System.out.println(pepe.get(6));
		//System.out.println(pepe.remove(6));
		//para mostrar
		for(int i=0;i<pepe.size();i++) {
			System.out.println(pepe.get(i));
		}
		
		
		/*
		PilaEstArrList p = new PilaEstArrList();
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
			*/
	}

}
