package ArrayListConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate {

	public static void main(String[] args) {


		ArrayList<Integer> arInt = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,1,2,34,5,6,6,78,8,8,9,0));
		
		//1. LinkedHashSet
		
		LinkedHashSet<Integer> LinkSet = new LinkedHashSet<Integer>(arInt);//Pass ArrayList as parameter
			
		ArrayList<Integer> NonDuparInt = new ArrayList<Integer>(LinkSet); //pass linked hash set as parameter
		
		System.out.println("NonDuparInt===> " + NonDuparInt); //pass the array into the linkedHashSet>> and then pass that linkedhashSet values in the arrayList...
										//you will get unique values..
		
		//2. Stream..after JDK:8
		
		ArrayList<Integer> ParInt = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,1,2,34,5,6,6,78,8,8,9,0));
		
		List<Integer> Markint =  ParInt.stream().distinct().collect(Collectors.toList());//distinct method..in Stream.. 
		
		System.out.println("Markint====> " + Markint);
		
		
		
		

	}

}
