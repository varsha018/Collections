package HashMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapSync {
	
	
	//HashMap is not Synchronized..==> 1 Null key and multiple null values
	//HashTable is Thread safe==> NO Null key and values ==> slow performance
	//Synchronized Map is Thread Safe==>slow performance==>null key and multiple null values are allowed
	//Concurrent HashMap Thread Safe==>Fast performance==>null key and values are not allowed..
	//In concurrent>>segment level lock is applied>>1 thread can write/change 1 segment at a time>>all the other threads can read that segment...
		//divided into 16 segments>>faster
	
	public static void main(String[] args) {
		// Converting HashMap(not thread safe) into synchronized map
		
		Map<String,String> map1 = new HashMap<String,String>();
		
		map1.put("1", "a");
		map1.put("2", "b");
		map1.put("3", "c");
		
		System.out.println(map1);
		
		System.out.println("!!!!!!!!!synchrozed map!!!!!!!");
		
		Map<String,String> map2 = Collections.synchronizedMap(map1);  //map2 is synchronized now..
		
		System.out.println(map2);
		
		System.out.println("!!!!!!!!concurrent hashMap !!!!!!!");
		//ConcurrentHashMap ==>> does not throw any concurrent modification exception 
		
		ConcurrentHashMap<String,Integer> ConMap = new ConcurrentHashMap<String,Integer>();
		
		ConMap.put("A", 1);
		ConMap.put("B", 3);
		ConMap.put("C", 4);
		
		System.out.println(ConMap);
		
	}

}
