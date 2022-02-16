
public class Cola {
	 private Persona primero;
	    private Persona ultimo;
	    private int tamanio;

	    public Cola() {
	        primero = null;
	        ultimo = null;
	        tamanio = 0;
	    }

	    public boolean isEmpty() {
	        return primero == null;
	    }

	    public int size() {
	        return tamanio;
	    }

	    public Persona primero() {

	    	if (isEmpty()) {
	            return null;
	        }

	        return primero;
	    }

	    public void insertar(int e,String n){
	    	Persona i=new Persona(e,n);
	    	if(primero==null && ultimo==null){
	    		primero=i;
	    		ultimo=i;
	    	}
	    	ultimo.setSiguiente(i);
	    	ultimo = ultimo.getSiguiente();
	    }
	    
	    
	    public Persona extraer(){
	    	Persona p = primero;
	    	primero = primero.getSiguiente();
	    	return p;
	    }
	    
	    public boolean estaVacia(){
	    	boolean vacia;
	    	if(primero==null){
	    		vacia=true;
	    	}
	    	else{
	    		vacia=false;
	    	}
	    	return vacia;
	    }
	    
}
