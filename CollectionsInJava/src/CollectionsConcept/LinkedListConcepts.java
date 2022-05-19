package CollectionsConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcepts {

	public static void main(String[] args) {
		
		//Singly linked list.. has nodes which is divided into 2 parts>> data and next>> next refer the next node reference..
		//Head node >> has only 1 part and it points to first node always..
		//last node always points to Null..
		
		
		LinkedList<String> l1 = new LinkedList<String>();
		
		l1.add("varsha");
		l1.add("ayushi");
		
		System.out.println(l1);
		
		l1.addFirst("names"); // adds before node 1 
		l1.addLast("completed");	// adds after the last node
		
		System.out.println(l1);
		
		
		//set:
		
		l1.set(0, "naveen");
		
		System.out.println(l1);
		
		//get:
		System.out.println(l1.get(2));
		//remove
		System.out.println(l1.remove(3));
		System.out.println(l1);

		//for loop:
		System.out.println("****for loop****");
		for (int n=0; n<l1.size(); n++) {
			System.out.println(l1.get(n));
		}
		
		
		//advance for loop
		System.out.println("****advance for loop****");
		for( String str : l1) {
			System.out.println(str);
		}
		
		//iterator
		System.out.println("****using iterator****");
		Iterator<String> it = l1.iterator();
		while(it.hasNext()) {
			String sr = it.next();
			System.out.println(sr);
		}
		
		//while loop
		System.out.println("****using while loop****");
		int p=0;
		while(l1.size()>p) {
			System.out.println(l1.get(p));
			p++;
		}
		
		
		
		
	}

}
