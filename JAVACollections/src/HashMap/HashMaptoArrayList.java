package HashMap;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMaptoArrayList {

	public static void main(String[] args) {
		
		
		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		
		map2.put(1, "A");
		map2.put(3, "C");
		map2.put(2, "B");
		
		System.out.println(new ArrayList<>(map2.values()));
		System.out.println(new ArrayList<>(map2.keySet()));
		
		System.out.println("!!!!!!!!!lambda!!!!!!!!!!");
		
		map2.forEach((K,V) -> System.out.println("key : " + K + " AND value : " + V));
		
		//LINKED HASHMAP==>> stores in form of doubly linked list>>before address,key,value,after address ==>insertion order maintained..
		//HASHMAP==>stores in form of Linked List>.key and values--> INSERTION ORDER NOT MAINTAINED
		
		
		
	}

}
