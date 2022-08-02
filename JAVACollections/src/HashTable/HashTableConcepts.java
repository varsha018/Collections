package HashTable;

import java.util.Hashtable;
import java.util.Map;

public class HashTableConcepts {

	public static void main(String[] args) {

		
		//implements MAP interface
		//very old class>>legacy Collection API
		//KEY AND VALUE PAIR FORMAT
		//it is synchronized==>THREAD-SAFE
		//NO null value and null key
		
		//initial capacity =11 (11 segments)
		//load =0.75
		
		//works on hashing concept==>hashCode generate that hashCode%11(segments)==>gives index ==> on that index values get stored.. 
		//In case of collision ==> linked list
		
		
		Map<String, Integer> map1 = new Hashtable<>();
		
		map1.put("apple", 20);
		map1.put("banana", 10);
		map1.put("grapes", 20);
	//	map1.put(null, 20); //NullPointerException
	//	map1.put("apple", null); //NullPointerException
		
		System.out.println(map1);
		
		


	}

}
