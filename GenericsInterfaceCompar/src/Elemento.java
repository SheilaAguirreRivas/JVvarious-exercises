
public class Elemento<T> implements Compare<T>{
	private T dato;
	
	public Elemento(T d) {
		this.dato = d;
	};
		
	public T GetDato() {
		return this.dato;
	}
	
	@Override
	public boolean compareTo(Elemento<T> dato) {
		Integer a= (Integer)this.GetDato();
		Integer b= (Integer)this.GetDato();
		return a.equals(b);
	}
}
