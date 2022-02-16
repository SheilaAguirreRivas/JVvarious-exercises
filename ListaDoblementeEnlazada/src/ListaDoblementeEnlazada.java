
public class ListaDoblementeEnlazada {
	Nodo primero;
	Nodo ultimo;
	ListaDoblementeEnlazada()
	{
		primero=null;
		ultimo=null;
	}

	public boolean estavacio()
	{
		if(primero==null) return true;
		else return false;
	}

	public ListaDoblementeEnlazada alta(int dat)
	{
		if(estavacio())
		{
			Nodo nuevo=new Nodo(dat);
			primero=nuevo;
			ultimo=nuevo;
		}
		else
		{
			Nodo nuevo=new Nodo(dat);
			ultimo.next=nuevo;
			nuevo.ant=ultimo;
			ultimo=nuevo;
		}
		return this;
	}

	




	public boolean delete(int num)
	{
		Nodo anterior=null;
		Nodo actual=primero;
		while(actual!=ultimo)
		{
			//Si encontró el dato
			if(actual.dato==num)
			{
				//Si el dato está en el primer nodo
				if(anterior==null)
				{
					primero=actual.next;
					primero.ant=null;
				}
				//Elemento del medio
				else{
					//Si el dato está un nodo del medio
					anterior.next=actual.next;
					actual=actual.next;
					actual.ant=anterior;
				}
				return true;
			}
			//Sigo buscando
			anterior=actual;
			actual=actual.next;
		}
		//Si el dato está en el último nodo
		if(num==ultimo.dato)
		{
		ultimo=actual.ant;
		actual.ant=null;
		anterior.next=null;
			return true;		
		}
		return false;
	}

        public void imprimirParaAtras()
	{
		Nodo actual;
		actual=ultimo;
		while(actual!=primero)
		{
			System.out.println(actual.dato);
			actual=actual.ant;
		}
                System.out.println(actual.dato);

	}
        public void imprimirParaAdelante()
	{
		Nodo actual;
		actual=primero;
		while(actual!=ultimo)
		{
			System.out.println(actual.dato);
			actual=actual.next;
		}
                System.out.println(actual.dato);
	}
}
