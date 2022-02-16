/*
 * array de 4 elem, fifo, no tiene tope pero tiene dos flechas un indicador de cuando empieza  o termina 
 * la cola, tengo que saber cual es el primer elemento que voy a tener que sacar de la cola
 * cual es primero de la cola. es estatico no se corren los valores, a mediada que inserto el fin se va subiendo y el inicio cuando se va eliminando el inicio sube 
 * tambien
 * 
 */
public class ColaEst {
	int cola1[]=new int[4];
    int inicio=-1;//-1 es decir en ningun lugar se apunta
    int fin=-1;//enteros donde voy a estar parado

    public void insertar(int v){
    	fin++;

    	if(fin==0){
    		inicio++;
    	}
        
    	cola1[fin]=v;
    }
    public int sacar(){
    	int retorno=0;
    	retorno=cola1[inicio];
    	cola1[inicio]=0;
    	inicio++;
    	return retorno;
    }

    public boolean ColaLlena(){//llena la cola, cuando el fin se va corriendo, hasta el 3, sino se puede seguir insertando
        return fin==cola1.length-1;
	}

    public boolean ColaVacia(){//una vez llena se quiere vaciar,viene y dice que el valor
        return inicio > cola1.length-1;
	}
}
