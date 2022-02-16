/*
 * 4)	Crear la matriz con los números 1,2,3|4,5,6|7,8,9 imprimir la suma 
 * de la diagonal en una función llamada MostrarResultado
 */
public class Matrix {
	public static void main(String[] args) {
		int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
	    MostrarResultado(mat);
}
	
	public static void MostrarResultado(int[][] m){
	      int filas=m.length;
	      int columnas=m[0].length;
	      int calc=0;
	      for(int i=0;i<filas;i++){
	         for(int j=0;j<columnas;j++){
	            if(i==j){
	               calc+= m[i][j];
	            }
	         }		
	      }
	      System.out.println(calc);
	   }
}

