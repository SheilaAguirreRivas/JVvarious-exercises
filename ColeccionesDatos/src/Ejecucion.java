import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;


public class Ejecucion {

	public static void main(String[] args) {
		List<String> stringList = new ArrayList<>();
		stringList.add("a");
		stringList.add("b");
		stringList.add("c");
		
		Iterator<String> List2 = stringList.iterator();
		while(List2.hasNext()) {
			System.out.println(List2.next());
		}
		
		Collection<String> List3 = new ArrayList<String>();
		List3.add("d");
		List3.add("e");
		List3.add("f");
		for (String s: List3) {//Object s : List3
			//String s1 = (String)s;
			System.out.println(s);//(s1)
		}
	
	}

}
