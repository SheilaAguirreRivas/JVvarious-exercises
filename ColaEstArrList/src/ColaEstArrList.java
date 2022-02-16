import java.util.ArrayList;

public class ColaEstArrList {
	ArrayList<Integer> cola1 = new ArrayList<Integer>();
	int inicio=-1;
	int fin=-1;
	
    public void insertar(int v){
    	fin++;
    	if(fin==0){
    		inicio++;
    	}
    	cola1.add(v);
    }
    public int sacar(){
    	int ret;
    	ret=cola1.remove(inicio);
    	return ret;
    }

    public boolean ColaVacia(){
        return cola1.size() == 0;
	}
}