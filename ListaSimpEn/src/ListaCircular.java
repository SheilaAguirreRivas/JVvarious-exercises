
public class ListaCircular {
	Nodo primero,ultimo;  
    
    public ListaCircular()
   {      
      primero = null;
      ultimo = null;
   }  
  //Metodo para insertar un nodo  
    public void insertNodo(int elem)
   {
      Nodo nuevo, ant;
      nuevo = new Nodo(elem);
     
      if(primero == null) // cuando no hay ningun nodo
      {      
         primero = nuevo;
         ultimo = nuevo;
      }
      else{
          nuevo.sig = ultimo.sig;
          ultimo.sig = nuevo;
          ultimo = nuevo;
      }
   }

    //-------------------------------------------    
    // Metodo para eliminar un nodo
        public void elimNodo(int datoE)
       {
          Nodo ant, act;
          ant = null;  
          act = primero;
         
          if(primero != null)
          {
             while((act != null)&&(act.dato != datoE))
             {             
                ant = act;
                act = act.sig;
             }    
          
             if((act == null)||(datoE != act.dato))
             {
                System.out.println("\n ¡¡¡ No existe !!!");        
             }    
             else
             {      
                 
   		if (act == primero)//caso 1: Elimina Primero 
                {
                   primero = primero.sig;
                   ultimo.sig = primero;
                   act.sig = null;
                   act = null;
                }
                
                else if (act == ultimo)//caso 2: elimina ultimo
                {
                   ant.sig = ultimo.sig;
                   ultimo = ant;
                   act.sig = null;
                   act = null;
                }                        
                else  // caso 3: elimina en medio 
                {
                   ant.sig = act.sig;
                   act.sig = null;
                   act = null;
                	}  
             }
          }
          else
          {
             System.out.print("\n¡¡¡ No hay Elementos !!!");
          }                                    
       }           
      //----------------------------------------------------------------------------- //Eliminar toda la lista    
        public void elimLista()
       {   
          Nodo elim,sig;
          elim = primero;
       
          while(primero != null)
          {
             primero = primero.sig; 
             elim.sig = null;
             elim = primero;
          }
       }    
    //------------------------------------------------------------------
      //Mostrar todos los Elementos de la lista 
        public void mostrarLista()
       { 
          Nodo mostrar;
          mostrar = primero;

          do  
          { 
       	   System.out.print("\n Elemento--> "+mostrar.dato);
              mostrar = mostrar.sig;
          }while(mostrar != primero && mostrar!=null);
       }
   }
