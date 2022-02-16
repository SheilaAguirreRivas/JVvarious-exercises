public class Sumador<T1 extends Number, T2 extends Number> {  
	  private T1 numero1;  
	  private T2 numero2;  
	  
	  public Sumador(T1 numero1, T2 numero2) {  
	    this.numero1 = numero1;  
	    this.numero2 = numero2;  
	  }  
  
	  public double sumar() {  
		  return numero1.doubleValue() + numero2.doubleValue();
	    //System.out.println(numero1.doubleValue() + numero2.doubleValue());  
	  }  
}

