import java.util.HashMap;

public class Ejecucion {

	public static void main(String[] args) {
		// Creating an empty HashMap 
        HashMap<Integer, String> hash_map = new HashMap<Integer, String>(); 
  
        // Mapping string values to int keys 
        hash_map.put(null, "Argentina"); //aca me deja, en el anterior no me deja lo nulo de hashtable
        hash_map.put(2, "Brasil"); 
        hash_map.put(3, "Uruguay"); 
        hash_map.put(4, "Peru"); 
        hash_map.put(5, "Bolivia"); 
  
        // Displaying the HashMap 
        System.out.println("Initial Mappings are: " + hash_map); 
  
        // Getting the value of 25 
        System.out.println("The Value is: " + hash_map.get(1)); 
  
        // Getting the value of 10 
        System.out.println("The Value is: " + hash_map.get(2)); 
	}

}
