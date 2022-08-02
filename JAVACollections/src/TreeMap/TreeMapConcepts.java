package TreeMap;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapConcepts {

	public static void main(String[] args) {
		
		//stores values in key-pair format
		//TreeMap is not HashMap
		//TreeMap does not follow hashing concept
		//TreeMap class implements Sorted Map Interface which extends the Map Interface
		
		//RED-BLACK TREEMAP
		//ROOT node is BLACK
		//Each node is either red or black
		//All leaves (NIL) are BLACK
		//IF A NODE IS RED , then both it's children are black
		//Every path from a given node to it's descendant NIL node,contains same number of BLACK node
		
		
		
		
		
		TreeMap<Integer, String> map1 = new TreeMap<>();
		
		map1.put(11, "apple");
		map1.put(02, "mango");
		map1.put(35, "banana");
		map1.put(04, "grapes");
		
		System.out.println(map1);  //prints in sorted order on basis of KEYS
		
		System.out.println("!!!!!!!!!!!!!!!!!!!");
		
		map1.forEach((K,V) -> System.out.println("KEY IS ==> " + K + "  VALUE IS ==> " + V)); //sorted order
		
		System.out.println("!!!!!!!!!!!!!!!!!!!");
		
		System.out.println(map1.lastKey());//largest value stored at LAST
		System.out.println(map1.firstKey());//smallest key stored at FIRST
		
		System.out.println("!!!!!!!!!!!!!!!!!!!");
		
		//KEYS LESS THAN 11, if we want to print ==>use headMap and KeySet
		
		Set<Integer> Lessthan11 = map1.headMap(11).keySet();
		System.out.println("LESS THAN 11 ==> " + Lessthan11);
		
		//KEYS MORE THAN 11, if we want to print ==>use TAILMAP and KeySet
		
		Set<Integer> Morethan11 = map1.tailMap(11).keySet();
		System.out.println("More than 11 ==> " + Morethan11);
		
		System.out.println("!!!!!!!! ASCENDING !!!!!!!!!!!");
		
		TreeMap<String, Integer> map2 = new TreeMap<>();
		
		map2.put("java", 1100);
		map2.put("python", 3200);
		map2.put("Ruby", 300);
		map2.put("C", 2400);
		map2.put("PHP", 5000);
		map2.put("JavaScript", 1600);
		map2.put("Apple", 16000);
		System.out.println(map2); //SORTED ORDER OF KEYS ==> ASCENDING ORDER
		
		System.out.println("!!!!!!!! DESCENDING !!!!!!!!!!!");
		
		//If you want descending order ==>Comparator.reverseOrder()  IN THE CONSTRUCTOR
		
		TreeMap<String, Integer> map3 = new TreeMap<>(Comparator.reverseOrder());
		
		map3.put("java", 1100);
		map3.put("python", 3200);
		map3.put("Ruby", 300);
		map3.put("C", 2400);
		map3.put("PHP", 5000);
		map3.put("JavaScript", 1600);
		map3.put("Apple", 16000);
		System.out.println(map3); //SORTED ORDER OF KEYS ==> DESCENDING ORDER		
		
		
	}

}
