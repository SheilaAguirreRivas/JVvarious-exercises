
public class ComparadorObjs<T1,T2>{
	protected T1 obj1;
	protected T2 obj2;
	
	public ComparadorObjs(T1 obj1, T2 obj2){
		this.obj1 = obj1;
		this.obj2 = obj2;		
	}
	
	public boolean mismaPrimeraLetra(){
		String letra1=((String) obj1).substring(0,1);
		String letra2=((String)obj2.toString()).substring(0,1);
		return letra1.equalsIgnoreCase(letra2);
	}

}
