import java.util.ArrayList;
public class PilaEstArrList {
	ArrayList<Integer> pila1 = new ArrayList<Integer>();
	int tope=-1;
	
    public void insertar(Integer v){
        pila1.add(v);
        tope++;
    }
    public int sacar(){
    	int ret;
    	ret = pila1.remove(tope);
    	tope--;
    	return ret;
    }
    public boolean PilaVacia(){
        return tope==-1;
	}	
    public boolean PilaLlena(){
        return tope==pila1.size()-1;
	}	
}
