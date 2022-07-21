package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class HashMapCompare {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		
		map1.put(1, "A");
		map1.put(2, "B");
		map1.put(3, "C");
		
		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		
		map2.put(1, "A");
		map2.put(3, "C");
		map2.put(2, "B");
		
		HashMap<Integer, String> map3 = new HashMap<Integer, String>();
		
		map3.put(1, "A");
		map3.put(3, "C");
		map3.put(2, "C");//if 1 index of hashMap already has the value> it creates a LINKEDLIST and then stores the values..the reference/address node of 1st is the second and of second is Null... 
		map3.put(2, "C");//.equals compares the keyName of keys of HashMap>>calculates hashCode>>gets the Index>>and as per that randomly stores values in the index of HashMap..
		map3.put(4, "B");//no order of Indexing..on basis of hASHcODE , CALCULATES INDEX and stores values..
		map3.put(null, "A");//for null key hashCode is 0> and Index is 0>> Value is always stored at 0th index..
		
		System.out.println(map1.equals(map3)); //false
		System.out.println(map1.equals(map2)); //true
		
		System.out.println("!!!!!!!!!!!!!");
		//to compare only KEYS
		System.out.println(map1.keySet().equals(map2.keySet()));//true //compare only keys
		System.out.println(map3.keySet().equals(map2.keySet()));//false//store in "set">>so it will automatically remove duplicates and then compare
		
		System.out.println("!!!!!!!!!!!!!");
		
		
		//TO find extra keys from map set while comparing 2 hashMaps ..
		//YOU need to use hashSet for this..
		
		HashSet<Integer> Extrakeys = new HashSet<Integer>(map1.keySet()); //pass 1 hashMap in arguments of HashSet//stores unique keys...
		
		
		Extrakeys.addAll(map3.keySet());//ADD THE keys of 2nd hashMap 
		Extrakeys.removeAll(map1.keySet());//remove the keys of 1st hashMap
		System.out.println(Extrakeys); //output will be extra keys present 
		
		System.out.println("!!!!!!!!!!!!!");
		
		//DUPLICATES NOT ALOWED>>> use ArrayList to store values
		//to compare the values of HashMap
		//TO COMPARE values of map1 and map2
		//create arrayList and store values of both HashMap values and compare
		System.out.println(new ArrayList<>(map1.values()).equals(new ArrayList<>(map2.values()))); //true
		System.out.println(new ArrayList<>(map1.values()).equals(new ArrayList<>(map3.values()))); //false
		
		System.out.println("!!!!!!!!!!!!!");
		//DUPLICATES ALLOWED>>> use HashSet
		
		System.out.println(new HashSet<>(map1.values()).equals(new HashSet<>(map2.values())));
		System.out.println(new HashSet<>(map1.values()).equals(new HashSet<>(map3.values())));
		
		
		

	}

}
