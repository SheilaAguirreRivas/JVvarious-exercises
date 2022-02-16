
public class Hija extends Madre {//quiero que herede de la clase madre
	private int datoHija;

	//constructor
	public Hija(int dm,int dh) {
		super(dm);
		this.datoHija=dh;
	}
	
	
	
	public int getDatoHija() {
		return datoHija;
	}

	public void setDatoHija(int datoHija) {
		this.datoHija = datoHija;
	}
	
}
