package ArrayListConcept;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {
	
	
	//default class
	//dynamic array -->size is not fixed, adjusted dynamically
	
	
	
	public static void main(String[] args) {



		
		
		
		ArrayList<String> ar1  = new ArrayList<String>();
		ar1.add("java");
		ar1.add("python");
		ar1.add("ruby");
		ar1.add("js");
		
		
		ArrayList<String> ar2  = new ArrayList<String>();
		ar2.add("selenium");
		ar2.add("devOps");
		
		
		ar2.addAll(ar1);
		
		System.out.println(ar2);
		
		ar1.addAll(1, ar2);
		
		System.out.println(ar1);
		


		
		System.out.println(ar1.contains("devOps"));
		System.out.println(ar1.indexOf("js") > 0 );
		
		
		ArrayList<String> NewList = new ArrayList<String>(Arrays.asList("varsha", "anoop", "varsha"));
		
		System.out.println(NewList);
		
		System.out.println(NewList.lastIndexOf("varsha"));
		
		NewList.forEach(e -> e.concat("Gupta"));
	
		
		
		ArrayList<Integer> IntList = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,6,7,8,9));
		
		IntList.removeIf(e -> !(e%2==0));
		System.out.println(IntList);
		
		
		Object ob[] = IntList.toArray(); //converting array list to array
		
		for(Object o : ob) {
			System.out.println(o);
		}
	
	}

}
