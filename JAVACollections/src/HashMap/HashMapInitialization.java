package HashMap;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HashMapInitialization {
	
	public static HashMap<String,Integer> marksMap;
	
	
	static {
		marksMap = new HashMap<>();
		marksMap.put("A", 100);
		marksMap.put("B", 200);
		marksMap.put("C", 300);
		
		
	}

	public static void main(String[] args) {

		//1.Using HashMap class 
		HashMap<String,String> map1 = new HashMap<>();//not compulsory to pass arguments while creating object
		
		Map<String,String> map2 = new HashMap<>(); //top-casting
		
		//2.Using static way
		
		System.out.println(HashMapInitialization.marksMap.get("C"));
		
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!");
		
		//3.Immutable map only with 1 single entry
		
		Map<String,Integer> map3 = Collections.singletonMap("Single", 999);
		System.out.println(map3.get("Single"));
	//	map3.put("Double", 888);//UnsupportedOperationException
								//for singleTon class you cannot add 2 entries..
		
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!");


		
		//4.JAVA-8: creating a 2D array and collecting in form of Map
		
		Map<String,String> map4 = Stream.of(new String[][] {
			{"VARSHA", "1"},
			{"AYUSHI", "2"},
			{"SHIVAM", "3"},
		}).collect(Collectors.toMap(data->data[0], data->data[1]));//data for 2 D arrays
		
		System.out.println(map4.get("SHIVAM"));
		
		
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!");
		
		
		//5.USING SIMPLE ENTRYmethod with stream and ABSTRACTMAP
		//mutable map>>you can add more key value pair to this map
		Map<String,String> map5= Stream.of(new AbstractMap.SimpleEntry<>("anoop", "varsha"),
											new AbstractMap.SimpleEntry<>("amit", "monika")
				
				
				).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		
		System.out.println(map5);
		System.out.println(map5.get("amit"));
		map5.put("mommy", "papa");//mutable map
		System.out.println(map5.get("mommy"));
		
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!");
		
		//6.JDK-1.9:CREATE empty map
		
		Map<String,String> map6= Map.of(); //empty map
		
		System.out.println(map6);
		map6.put("var", "99"); //cannot add values to an empty map
		System.out.println(map6); //UnsupportedOperationException
		
		
	}

}
