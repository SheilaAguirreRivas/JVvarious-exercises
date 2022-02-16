import java.util.Scanner;

public class Ejecucion {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Sumador<Double,Double> sum=new Sumador<>(12.25, 14.23);
		System.out.println("La suma es: "+sum.sumar());
	}

}
