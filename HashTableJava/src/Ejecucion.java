import java.util.Hashtable;
import java.util.Map;  
public class Ejecucion {

	public static void main(String[] args) {
		 Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  //String,String es ht.put("AR","Argentina");
		
		  ht.put(1,"Argentina");
		  ht.put(2,"Brasil");
		  ht.put(3,"Uruguay");
		  ht.put(4,"Peru");
		  
		 /* 
		  ht.put(100,"Amit");  ht.put(1,"Argentina");
		  ht.put(102,"Ravi");  ht.put(2,"Brasil");
		  ht.put(101,"Vijay");  ht.put(3,"Uruguay");
		  ht.put(103,"Rahul");  ht.put(4,"Peru");
		  
		  for(Map.Entry m:ht.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());
		  }  

		  System.out.println("\n");
		  ht.remove(101);
		   */
		  for(Map.Entry n:ht.entrySet()){  
			   System.out.println(n.getKey()+" "+n.getValue());  
		  }	
	}

}
