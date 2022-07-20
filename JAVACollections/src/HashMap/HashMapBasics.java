package HashMap;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapBasics {

	public static void main(String[] args) {
	
		
		//key-value pair
		//cannot have duplicate keys
		//No order >> No indexing
		//multiple null values but 1 null key...
		//you can have duplicate keys..but it will give you latest value..
		
		HashMap<String, String> map1 = new HashMap<String, String> ();
		map1.put("UP", "Lucknow");
		map1.put("Delhi", "New Delhi");
		map1.put("Bihar", "Patna");//you can have duplicate keys..but it will give you latest value..
		map1.put("Bihar", "PatnaNewKey");
		map1.put(null, "berlin6");
		map1.put(null, "berlin1");
		map1.put(null, null);
		
		
		System.out.println(map1.get("Bihar"));
		System.out.println(map1.get(null));
		
		System.out.println("!!!!!!!!!!!!!! *KEY SET* !!!!!!!!!!!!!!!!!!!!!!1");
		//using Iterator with hashMap, we have to use KeySet
		
		Iterator<String> it1 = map1.keySet().iterator();
		
		while(it1.hasNext()) {
			String key =  it1.next();
			String value = map1.get(key);
					
			System.out.println("key is: " + key + " and Value is:" + value);
		}
	
		System.out.println("!!!!!!!!!!!!!! *ENTRY SET* !!!!!!!!!!!!!!!!!!!!!!1");
		
		//using iterator with HashMap we can also use EntrySet,Return type is different than keySet
		
		Iterator<Entry<String, String>> it2 = map1.entrySet().iterator();
		
		while(it2.hasNext()) {
			
			Entry<String, String>  entry = it2.next();
			
			System.out.println("key is==> " + entry.getKey() + "value is==> " + entry.getValue());
		}
		
		System.out.println("!!!!!!!!!!!!!! *LAMBDA* !!!!!!!!!!!!!!!!!!!!!!1");
		//ITERATE hashMap using for Each and lambda
		
		map1.forEach((K,V) -> System.out.println("keys is >>>> " + K + "value is >>>>> " + V));
	}
	
	

}
