package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;



//HashMap no permite valores duplicados, orden aleatorio
//TreeMap no permite valores duplicados, orden ascendente
//LinkedHashMap Map no permite valores duplicados, orden dependiendo del ingreso de valores

public class App {

	public static void main(String[] args) {
		
		
//Map<Integer,String> map = new HashMap<>();
//		
//		map.put(1, "Sebastian");
//		map.put(5, "Juan");
//		map.put(7, "Carlos");
//		map.put(8, "Federico");
//		map.put(3, "Ezequie");
		
		
//Map<Integer,Persona> map = new HashMap<>();
		
		
//		Map<Integer,Persona> map = new LinkedHashMap<>();
//		
//		map.put(1, new Persona(1, "Sebastian", 22));
//		map.put(5, new Persona(2, "Juan", 66));
//		map.put(7, new Persona(3, "Carlos", 44));
//		map.put(2, new Persona(4, "Federico", 66));
//		map.put(3, new Persona(5, "Martin", 55));		
//	
//		Iterator it = map.keySet().iterator();
//		
//		while (it.hasNext()) {
//			Integer key =  (Integer)it.next();
//			System.out.println("Clave= "+key+" Valor= "+ map.get(key));
//			
//		}
		
		
		Map<Persona,String> map = new TreeMap<>();
		
		map.put(new Persona(1, "Sebastian", 22),"Uno");
		map.put(new Persona(2, "Juan", 33),"Dos");
		map.put(new Persona(3, "Carlos", 44),"Tres");
		map.put(new Persona(4, "Federico", 66),"Cuatro");
		map.put(new Persona(5, "Martin", 100),"Cinco");		
	
		for (Entry<Persona,String> ent : map.entrySet()) {
			System.out.println("Clave= "+ent.getKey()+" Valor= "+ ent.getValue());
		}
		
		
	}
	

}
