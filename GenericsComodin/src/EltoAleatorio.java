
public class EltoAleatorio<T>{
	private T elemento;
	private int cantElem;
	
	public EltoAleatorio(T array[]) {
		this.cantElem = array.length;
	}
	
	public T getElemento() {
		return this.elemento;
	}
	
	public boolean mismoLargo(EltoAleatorio<?> el) {
		/*if(this.cantElem==el.cantElem) {
			return true;
		}
		else
		{
		return	false;
		}*/
		return this.cantElem==el.cantElem;
	}
}
